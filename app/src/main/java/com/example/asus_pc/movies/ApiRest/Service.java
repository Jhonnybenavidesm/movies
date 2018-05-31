package com.example.asus_pc.movies.ApiRest;

import android.graphics.Movie;

import com.example.asus_pc.movies.Genero.model.Genero;
import com.example.asus_pc.movies.Login.model.Login;
import com.example.asus_pc.movies.Peliculas.model.Pelicula;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public interface Service {

    @POST(Contants.URL_POST_LOGIN)
    @FormUrlEncoded
    Call<List<Login>> onSignIn(@Field("user") String user, @Field("pass") String pass);


    @GET(Contants.URL_GET_USERS)
    Call<List<Pelicula>> getDataPelicula();

    @GET(Contants.URL_GET_GENERO)
    Call<List<Genero>> getDataGenero();



}
