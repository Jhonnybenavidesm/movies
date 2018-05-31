package com.example.asus_pc.movies.Peliculas.presenter;

import com.example.asus_pc.movies.Peliculas.interactor.PeliculaFragmentInteractor;
import com.example.asus_pc.movies.Peliculas.interactor.PeliculaFragmentInteractorlmpl;
import com.example.asus_pc.movies.Peliculas.model.Pelicula;
import com.example.asus_pc.movies.Peliculas.view.PeliculaFragmentView;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class PeliculaFragmentPresenterlmpl implements PeliculaFragmentPresenter {
    private PeliculaFragmentView peliculaFragmentView;
    private PeliculaFragmentInteractor peliculaFragmentInteractor;

    public PeliculaFragmentPresenterlmpl(PeliculaFragmentView peliculaFragmentView) {
        this.peliculaFragmentView = peliculaFragmentView;
        peliculaFragmentInteractor = new PeliculaFragmentInteractorlmpl(this);
    }

    @Override
    public void showResultPelicula(List<Pelicula> peliculaList) {
        peliculaFragmentView.showResultPelicula(peliculaList);

    }


    @Override
    public void getDataPelicula() {
        peliculaFragmentInteractor.getDataPelicula();

    }
}
