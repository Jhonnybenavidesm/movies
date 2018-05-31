package com.example.asus_pc.movies.Genero.presenter;

import com.example.asus_pc.movies.Genero.model.Genero;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface GeneroFragmentPresenter {
    void showResultGeneros(List<Genero> generoList);
    void getDataGenero();
}
