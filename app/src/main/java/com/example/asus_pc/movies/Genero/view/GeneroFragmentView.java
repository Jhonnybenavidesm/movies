package com.example.asus_pc.movies.Genero.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.asus_pc.movies.Genero.model.Genero;

import java.util.List;

/**
 * Created by Asus-PC on 31/05/2018.
 */

public interface GeneroFragmentView {
    View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);

    void showResultGeneros(List<Genero> peliculaList);
}
