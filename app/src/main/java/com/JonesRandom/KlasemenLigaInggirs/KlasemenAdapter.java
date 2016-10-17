package com.JonesRandom.KlasemenLigaInggirs;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.JonesRandom.KlasemenLigaInggirs.Model.KlasemenItem;

import java.util.List;


public class KlasemenAdapter extends RecyclerView.Adapter<KlasemenAdapter.HolderKlasemen> {

    List<KlasemenItem> item;

    public KlasemenAdapter(List<KlasemenItem> item) {
        this.item = item;
    }

    @Override
    public HolderKlasemen onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_klasemen, parent, false);
        HolderKlasemen klasemen = new HolderKlasemen(v);
        return klasemen;
    }

    @Override
    public void onBindViewHolder(HolderKlasemen holder, int position) {

        int posisi = item.get(position).getPosisi();

        if (posisi < 4) {
            holder.warna_posisi.setBackgroundResource(R.drawable.klasemen_color_posisi_atas);
        } else if (posisi > 17) {
            holder.warna_posisi.setBackgroundResource(R.drawable.klasemen_color_posisi_bawah);
        } else {
            holder.warna_posisi.setBackgroundResource(R.drawable.klasemen_color_posisi);
        }

       if (position % 2 == 1) {
            holder.view.setBackgroundResource(R.color.c);
       } else {
            holder.view.setBackgroundResource(R.color.b);
        }

        holder.list_posisi.setText(String.valueOf(posisi));
        holder.list_club.setText(item.get(position).getKlub());

        holder.list_main.setText("M : " + item.get(position).getMain());
        holder.list_menang.setText("M : " + item.get(position).getMenang());
        holder.list_kalah.setText("M : " + item.get(position).getKalah());
        holder.list_seri.setText("M : " + item.get(position).getSeri());
        holder.list_poin.setText("M : " + item.get(position).getPoin());
    }

    @Override
    public int getItemCount() {
        return item.size();
    }

    class HolderKlasemen extends RecyclerView.ViewHolder {

        LinearLayout view;
        RelativeLayout warna_posisi;

        TextView list_posisi;
        TextView list_club;

        TextView list_main;
        TextView list_menang;
        TextView list_seri;
        TextView list_kalah;
        TextView list_poin;

        public HolderKlasemen(View itemView) {
            super(itemView);

            view = (LinearLayout) itemView.findViewById(R.id.view);
            warna_posisi = (RelativeLayout) itemView.findViewById(R.id.warna_posisi);

            list_posisi = (TextView) itemView.findViewById(R.id.list_posisi);
            list_club = (TextView) itemView.findViewById(R.id.list_club);

            list_main = (TextView) itemView.findViewById(R.id.list_main);
            list_menang = (TextView) itemView.findViewById(R.id.list_menang);
            list_seri = (TextView) itemView.findViewById(R.id.list_seri);
            list_kalah = (TextView) itemView.findViewById(R.id.list_kalah);
            list_poin = (TextView) itemView.findViewById(R.id.list_poin);

        }
    }
}
