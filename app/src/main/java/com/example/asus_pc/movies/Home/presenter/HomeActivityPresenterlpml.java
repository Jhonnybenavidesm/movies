package com.example.asus_pc.movies.Home.presenter;

import android.support.v4.app.FragmentManager;

import com.example.asus_pc.movies.Home.interactor.HomeActivityInteractor;
import com.example.asus_pc.movies.Home.interactor.HomeActivityInteractorlmpl;
import com.example.asus_pc.movies.Home.view.HomeActivityView;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class HomeActivityPresenterlpml implements HomeActivityPresenter{
    private HomeActivityView homeActivityView;
    private HomeActivityInteractor homeActivityInteractor;

    public HomeActivityPresenterlpml(HomeActivityView homeActivityView) {
        this.homeActivityView = homeActivityView;
        homeActivityInteractor = new HomeActivityInteractorlmpl(this);
    }

    @Override
    public void showResult() {

    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        homeActivityInteractor.ChangeTab(position, fragmentManager);

    }
}
