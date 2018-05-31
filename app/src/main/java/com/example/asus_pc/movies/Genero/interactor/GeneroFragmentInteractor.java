package com.example.asus_pc.movies.Genero.interactor;

import com.example.asus_pc.movies.Genero.model.Genero;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface GeneroFragmentInteractor {
    void getDataGenero();
    void showResultGroups(List<Genero> peliculaList);
}
