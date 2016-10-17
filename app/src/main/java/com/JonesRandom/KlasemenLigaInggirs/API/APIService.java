package com.JonesRandom.KlasemenLigaInggirs.API;

import com.JonesRandom.KlasemenLigaInggirs.Model.ResponJSON;

import retrofit2.Call;
import retrofit2.http.GET;

public interface APIService {

    @GET("api/klasemen-premier/")
    Call<ResponJSON> getKlasemen();
}
