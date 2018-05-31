package com.example.asus_pc.movies.Peliculas.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.asus_pc.movies.Peliculas.adapter.PeliculaAdapter;
import com.example.asus_pc.movies.Peliculas.model.Pelicula;
import com.example.asus_pc.movies.Peliculas.presenter.PeliculaFragmentPresenter;
import com.example.asus_pc.movies.Peliculas.presenter.PeliculaFragmentPresenterlmpl;
import com.example.asus_pc.movies.R;

import java.util.List;


public class PeliculaFragment extends Fragment implements PeliculaFragmentView{
    private PeliculaFragmentPresenter peliculaFragmentPresenter;
    ProgressBar progressBarPelicula;
    RecyclerView recyclerViewPelicula;

    public PeliculaFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pelicula, container, false);

        progressBarPelicula = (ProgressBar) view.findViewById(R.id.id_pgb_peliculas);
        recyclerViewPelicula = (RecyclerView) view.findViewById(R.id.id_rcv_peliculas);
        recyclerViewPelicula.setLayoutManager(new LinearLayoutManager(getContext()));

        peliculaFragmentPresenter = new PeliculaFragmentPresenterlmpl(this);

        progressBarPelicula.setVisibility(View.VISIBLE);
        peliculaFragmentPresenter.getDataPelicula();

        return view;
    }

    @Override
    public void showResultPelicula(List<Pelicula> peliculaList) {
        progressBarPelicula.setVisibility(View.GONE);
        recyclerViewPelicula.setAdapter(new PeliculaAdapter(peliculaList, getContext()));
    }

}
