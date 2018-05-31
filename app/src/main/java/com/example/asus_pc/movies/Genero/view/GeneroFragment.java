package com.example.asus_pc.movies.Genero.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.asus_pc.movies.Genero.model.Genero;
import com.example.asus_pc.movies.Genero.presenter.GeneroFragmentPresenter;
import com.example.asus_pc.movies.Genero.presenter.GeneroFragmentPresenterlmpl;
import com.example.asus_pc.movies.R;

import java.util.List;


public class GeneroFragment extends Fragment implements GeneroFragmentView{

    private GeneroFragmentPresenter generoFragmentPresenter;
    ProgressBar progressBarGenero;
    RecyclerView recyclerViewGenero;

    public GeneroFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_genero, container, false);

        progressBarGenero = (ProgressBar) view.findViewById(R.id.id_pgb_genero);
        recyclerViewGenero = (RecyclerView) view.findViewById(R.id.id_rcv_genero);
        // recyclerViewGenero.setLayoutManager(new LinearLayoutManager(getContext()));

        generoFragmentPresenter = new GeneroFragmentPresenterlmpl(this);

        progressBarGenero.setVisibility(View.VISIBLE);
        generoFragmentPresenter.getDataGenero();

        return view;
    }


    @Override
    public void showResultGeneros(List<Genero> peliculaList) {
        progressBarGenero.setVisibility(View.GONE);
        //recyclerViewGenero.setAdapter(new GeneroAdapter(peliculaList, getContext()));
    }
}
