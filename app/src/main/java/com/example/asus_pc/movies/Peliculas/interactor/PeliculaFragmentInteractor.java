package com.example.asus_pc.movies.Peliculas.interactor;

import com.example.asus_pc.movies.Peliculas.model.Pelicula;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public interface PeliculaFragmentInteractor {
    void getDataPelicula();
    void showResultPelicula(List<Pelicula> peliculaList);



}
