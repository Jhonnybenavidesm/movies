package com.example.asus_pc.movies.Genero.reporitory;

import com.example.asus_pc.movies.ApiRest.RestApiAdapter;
import com.example.asus_pc.movies.ApiRest.Service;
import com.example.asus_pc.movies.Genero.interactor.GeneroFragmentInteractor;
import com.example.asus_pc.movies.Genero.interactor.GeneroFragmentInteractorlmpl;
import com.example.asus_pc.movies.Genero.model.Genero;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public class GeneroFragmentRepositorylmpl implements GeneroFragmentReporitory {

    private GeneroFragmentInteractor generoFragmentInteractor;
    List<Genero> generoList;

    public GeneroFragmentRepositorylmpl(GeneroFragmentInteractorlmpl generoFragmentInteractor) {
        this.generoFragmentInteractor = generoFragmentInteractor;
    }

    @Override
    public void getDataGenero() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Genero>> groups = service.getDataGenero();
        groups.enqueue(new Callback<List<Genero>>() {

            @Override
            public void onResponse(Call<List<Genero>> call, Response<List<Genero>> response) {
                generoList = response.body();
                generoFragmentInteractor.showResultGroups(generoList);
            }

            @Override
            public void onFailure(Call<List<Genero>> call, Throwable t) {

            }
        });


    }
}
