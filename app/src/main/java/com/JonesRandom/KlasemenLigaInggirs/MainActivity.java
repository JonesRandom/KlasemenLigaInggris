package com.JonesRandom.KlasemenLigaInggirs;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.JonesRandom.KlasemenLigaInggirs.API.APIService;
import com.JonesRandom.KlasemenLigaInggirs.Model.KlasemenItem;
import com.JonesRandom.KlasemenLigaInggirs.Model.ResponJSON;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.listKlasemen);

        loadData();

    }

    public void loadData(){

        final ProgressDialog dialog = ProgressDialog.show(MainActivity.this, "Please Wait", "Loading Data");

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://bayuu.net/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        APIService service = retrofit.create(APIService.class);

        Call<ResponJSON> call = service.getKlasemen();
        call.enqueue(new Callback<ResponJSON>() {
            @Override
            public void onResponse(Call<ResponJSON> call, Response<ResponJSON> response) {

                List<KlasemenItem> list = new ArrayList<KlasemenItem>();
                list = response.body().getKlasemen();

                KlasemenAdapter adapter = new KlasemenAdapter(list);
                recyclerView.setHasFixedSize(true);
                recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
                recyclerView.setAdapter(adapter);

                Toast.makeText(MainActivity.this, response.body().getStatus(),Toast.LENGTH_LONG).show();

                dialog.dismiss();

            }

            @Override
            public void onFailure(Call<ResponJSON> call, Throwable t) {
                Toast.makeText(MainActivity.this, t.getMessage(),Toast.LENGTH_LONG).show();
                dialog.dismiss();
            }
        });



    }
}
