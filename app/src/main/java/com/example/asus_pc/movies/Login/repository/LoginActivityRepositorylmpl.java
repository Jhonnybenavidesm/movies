package com.example.asus_pc.movies.Login.repository;

import android.util.Log;

import com.example.asus_pc.movies.ApiRest.RestApiAdapter;
import com.example.asus_pc.movies.ApiRest.Service;
import com.example.asus_pc.movies.Login.interactor.LoginActivityInteractor;
import com.example.asus_pc.movies.Login.model.Login;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class LoginActivityRepositorylmpl implements LoginActivityRepositiry{

    private LoginActivityInteractor loginActivityInteractor;
    List<Login> loginList;

    public LoginActivityRepositorylmpl(LoginActivityInteractor loginActivityInteractor) {
        this.loginActivityInteractor = loginActivityInteractor;
    }


    @Override
    public void signIn(String user, String pass) {

        RestApiAdapter restApiAdapter = new RestApiAdapter();
        Service service = restApiAdapter.getClientService();
        service.onSignIn(user, pass).enqueue(new Callback<List<Login>>() {
            @Override
            public void onResponse(Call<List<Login>> call, Response<List<Login>> response) {
                loginList = response.body();
                loginActivityInteractor.processData(loginList);
            }

            @Override
            public void onFailure(Call<List<Login>> call, Throwable t) {

            }
        });

    }
}
