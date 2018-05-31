package com.example.asus_pc.movies.Login.presenter;

import com.example.asus_pc.movies.Login.model.Login;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public interface LoginActivityPresenter {
    void signIn(String user, String pass);
    void showResult(List<Login> loginList);
    void showError(String error);
}
