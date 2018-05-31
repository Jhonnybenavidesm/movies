package com.example.asus_pc.movies.Home.interactor;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.asus_pc.movies.Home.presenter.HomeActivityPresenter;
import com.example.asus_pc.movies.Peliculas.view.PeliculaFragment;
import com.example.asus_pc.movies.R;

/**
 * Created by Asus-PC on 29/05/2018.
 */

public class HomeActivityInteractorlmpl implements HomeActivityInteractor{

    private HomeActivityPresenter homeActivityPresenter;

    public HomeActivityInteractorlmpl(HomeActivityPresenter homeActivityPresenter) {
        this.homeActivityPresenter = homeActivityPresenter;
    }

    @Override
    public void ChangeTab(Integer position, FragmentManager fragmentManager) {
        switch (position){
            case 0:
                PeliculaFragment peliculaFragment = new PeliculaFragment();
                fragmentManager
                        .beginTransaction()
                        .replace(R.id.id_fl_index, peliculaFragment)
                        .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                        .addToBackStack(null)
                        .commit();
                break;

        }
    }

}
