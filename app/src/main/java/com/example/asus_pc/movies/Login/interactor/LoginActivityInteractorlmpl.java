package com.example.asus_pc.movies.Login.interactor;

import com.example.asus_pc.movies.Login.model.Login;
import com.example.asus_pc.movies.Login.presenter.LoginActivityPresenter;
import com.example.asus_pc.movies.Login.repository.LoginActivityRepositiry;
import com.example.asus_pc.movies.Login.repository.LoginActivityRepositorylmpl;

import java.util.List;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class LoginActivityInteractorlmpl implements LoginActivityInteractor {

    private LoginActivityPresenter loginActivityPresenter;
    private LoginActivityRepositiry loginActivityRepository;

    public LoginActivityInteractorlmpl(LoginActivityPresenter loginActivityPresenter) {
        this.loginActivityPresenter = loginActivityPresenter;
        loginActivityRepository = new LoginActivityRepositorylmpl(this);
    }

    @Override
    public void signIn(String user, String pass) {
        if ("".equals(user) || "".equals(pass)){
            loginActivityPresenter.showError("Los campos no pueden estar vacios");
        }else {
            loginActivityRepository.signIn(user, pass);
        }
    }

    @Override
    public void processData(List<Login> loginList) {
        Boolean searchUser = loginList.get(0).isSearchUser();

        if (searchUser){
            loginActivityPresenter.showResult(loginList);
        }else{
            loginActivityPresenter.showError("El usuario ingresado no existe");
        }
    }
}
