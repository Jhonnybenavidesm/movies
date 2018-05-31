package com.example.asus_pc.movies.ApiRest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class RestApiAdapter {
    public Service getClientService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Contants.ROOT_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(Service.class);
    }
}
