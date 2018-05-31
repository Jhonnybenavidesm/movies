package com.example.asus_pc.movies.Login.interactor;

import com.example.asus_pc.movies.Login.model.Login;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public interface LoginActivityInteractor {
    void signIn(String user, String pass);
    void processData(List<Login> loginList);
}
