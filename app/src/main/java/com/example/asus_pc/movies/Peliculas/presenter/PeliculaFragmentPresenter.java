package com.example.asus_pc.movies.Peliculas.presenter;

import com.example.asus_pc.movies.Peliculas.model.Pelicula;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public interface PeliculaFragmentPresenter {
    void showResultPelicula(List<Pelicula> peliculaList);
    void getDataPelicula();
}
