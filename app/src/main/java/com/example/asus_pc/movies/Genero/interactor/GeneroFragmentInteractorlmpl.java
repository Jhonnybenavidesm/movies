package com.example.asus_pc.movies.Genero.interactor;

import com.example.asus_pc.movies.Genero.model.Genero;
import com.example.asus_pc.movies.Genero.presenter.GeneroFragmentPresenter;
import com.example.asus_pc.movies.Genero.reporitory.GeneroFragmentReporitory;
import com.example.asus_pc.movies.Genero.reporitory.GeneroFragmentRepositorylmpl;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroFragmentInteractorlmpl implements GeneroFragmentInteractor {

    private GeneroFragmentPresenter generoFragmentPresenter;
    private GeneroFragmentReporitory generoFragmentReporitory;

    public GeneroFragmentInteractorlmpl(GeneroFragmentPresenter generoFragmentPresenter) {
        this.generoFragmentPresenter = generoFragmentPresenter;
        generoFragmentReporitory = new GeneroFragmentRepositorylmpl(this);
    }

    @Override
    public void getDataGenero() {
        generoFragmentReporitory.getDataGenero();
    }

    @Override
    public void showResultGroups(List<Genero> peliculaList) {
        generoFragmentPresenter.showResultGeneros(peliculaList);
    }
}
