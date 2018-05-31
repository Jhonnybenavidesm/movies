package com.example.asus_pc.movies.Peliculas.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.asus_pc.movies.Peliculas.model.Pelicula;
import com.example.asus_pc.movies.R;
import com.squareup.picasso.Picasso;

import java.text.BreakIterator;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class PeliculaAdapter extends RecyclerView.Adapter {

    List<Pelicula> peliculaList;
    Context context;

    public PeliculaAdapter(List<Pelicula> peliculaList, Context context) {
        this.peliculaList = peliculaList;
        this.context = context;
    }




    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int id) {
        View item;
        switch (id) {


        }
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        Pelicula object = peliculaList.get(position);


    }

    @Override
    public int getItemCount() {
        return peliculaList.size();
    }

    public class ViewHolderTitle extends RecyclerView.ViewHolder{
        TextView textViewPeliculaTitle;


        public ViewHolderTitle(View item) {
            super(item);
            textViewPeliculaTitle = item.findViewById(R.id.id_txv_pelicula_title);
        }
    }

    public class ViewHolderMatch extends RecyclerView.ViewHolder {
        TextView textViewTeamLocal, textViewTeamHourMatch, textViewTeamVisitor;
        CircleImageView circleImageViewLocal, circleImageViewVisitor;

        public ViewHolderMatch(View item) {
            super(item);
          /*  textViewTeamLocal = item.findViewById(R.id.id_txv_team_local);
            textViewTeamHourMatch = item.findViewById(R.id.id_txv_team_hourmatch);
            textViewTeamVisitor = item.findViewById(R.id.id_txv_team_visitor);
            circleImageViewLocal = item.findViewById(R.id.id_img_team_local);
            circleImageViewVisitor = item.findViewById(R.id.id_img_team_visitor);*/
        }
    }
}
