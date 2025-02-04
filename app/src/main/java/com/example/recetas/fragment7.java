package com.example.recetas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class fragment7 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Cargar la vista del diseño del fragment
        View view = inflater.inflate(R.layout.fragment_fragment7, container, false);

        //Referencia al boton que realiza la accion
        Button buttonT = view.findViewById((R.id.btnInicioFlan));
        //Configurar la accion del boton
        buttonT.setOnClickListener(v -> {
            NavController navController = Navigation.findNavController(view);
            navController.navigate(R.id.SecondFragment);
        });
        return view;

    }}