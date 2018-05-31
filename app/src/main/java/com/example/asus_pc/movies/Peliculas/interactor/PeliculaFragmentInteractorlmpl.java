package com.example.asus_pc.movies.Peliculas.interactor;

import com.example.asus_pc.movies.Peliculas.model.Pelicula;
import com.example.asus_pc.movies.Peliculas.presenter.PeliculaFragmentPresenter;
import com.example.asus_pc.movies.Peliculas.repository.PeliculaFragmentRepository;
import com.example.asus_pc.movies.Peliculas.repository.PeliculaFragmentRepositorylmpl;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class PeliculaFragmentInteractorlmpl implements PeliculaFragmentInteractor {

    private PeliculaFragmentPresenter peliculaFragmentPresenter;
    private PeliculaFragmentRepository peliculaFragmentRepository;

    public PeliculaFragmentInteractorlmpl(PeliculaFragmentPresenter peliculaFragmentPresenter) {
        this.peliculaFragmentPresenter = peliculaFragmentPresenter;
        peliculaFragmentRepository = new PeliculaFragmentRepositorylmpl(this) {
        };
    }

    @Override
    public void getDataPelicula() {

    }

    @Override
    public void showResultPelicula(List<Pelicula> peliculaList) {

    }
}
