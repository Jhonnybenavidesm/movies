package com.example.asus_pc.movies.Login.presenter;

import com.example.asus_pc.movies.Login.interactor.LoginActivityInteractor;
import com.example.asus_pc.movies.Login.interactor.LoginActivityInteractorlmpl;
import com.example.asus_pc.movies.Login.model.Login;
import com.example.asus_pc.movies.Login.view.LoginActivityView;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class LoginActivityPresenterlmpl implements LoginActivityPresenter {

    private LoginActivityView loginActivityView;
    private LoginActivityInteractor loginActivityInteractor;

    public LoginActivityPresenterlmpl(LoginActivityView loginActivityView) {
        this.loginActivityView = loginActivityView;
        loginActivityInteractor = new LoginActivityInteractorlmpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        loginActivityInteractor.signIn(user, pass);
    }

    @Override
    public void showResult(List<Login> loginList) {
        loginActivityView.showResult(loginList);
    }

    @Override
    public void showError(String error) {
        loginActivityView.showError(error);
    }
}
