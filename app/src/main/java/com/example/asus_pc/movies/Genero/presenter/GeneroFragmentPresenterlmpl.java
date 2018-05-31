package com.example.asus_pc.movies.Genero.presenter;

import com.example.asus_pc.movies.Genero.interactor.GeneroFragmentInteractor;
import com.example.asus_pc.movies.Genero.interactor.GeneroFragmentInteractorlmpl;
import com.example.asus_pc.movies.Genero.model.Genero;
import com.example.asus_pc.movies.Genero.view.GeneroFragmentView;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroFragmentPresenterlmpl implements GeneroFragmentPresenter {

    private GeneroFragmentView generoFragmentView;
    private GeneroFragmentInteractor generoFragmentInteractor;

    public GeneroFragmentPresenterlmpl(GeneroFragmentView generoFragmentView) {
        this.generoFragmentView = generoFragmentView;
        generoFragmentInteractor = new GeneroFragmentInteractorlmpl(this);
    }

    @Override
    public void showResultGeneros(List<Genero> peliculaList) {
        generoFragmentView.showResultGeneros(peliculaList);
    }

    @Override
    public void getDataGenero() {
        generoFragmentInteractor.getDataGenero();
    }
}
