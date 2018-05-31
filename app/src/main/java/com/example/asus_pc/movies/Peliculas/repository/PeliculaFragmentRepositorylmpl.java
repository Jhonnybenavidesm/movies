package com.example.asus_pc.movies.Peliculas.repository;

import com.example.asus_pc.movies.ApiRest.RestApiAdapter;
import com.example.asus_pc.movies.ApiRest.Service;
import com.example.asus_pc.movies.Peliculas.interactor.PeliculaFragmentInteractor;
import com.example.asus_pc.movies.Peliculas.model.Pelicula;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class PeliculaFragmentRepositorylmpl implements PeliculaFragmentRepository{
    private PeliculaFragmentInteractor peliculaFragmentInteractor;
    List<Pelicula> peliculaList;

    public PeliculaFragmentRepositorylmpl(PeliculaFragmentInteractor peliculaFragmentInteractor) {
        this.peliculaFragmentInteractor = peliculaFragmentInteractor;
    }

    @Override
    public void getDataPelicula() {
        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        Call<List<Pelicula>> matchs = service.getDataPelicula();
        matchs.enqueue(new Callback<List<Pelicula>>() {


            @Override
            public void onResponse(Call<List<Pelicula>> call, Response<List<Pelicula>> response) {
                peliculaList = response.body();
                peliculaFragmentInteractor.showResultPelicula(peliculaList);
            }

            @Override
            public void onFailure(Call<List<Pelicula>> call, Throwable t) {

            }


        });


    }
}