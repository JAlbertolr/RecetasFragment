package com.example.recetas;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TableRow;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;


public class FirstFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Cargar la vista del diseño del fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        // Obtener el TableRow y asignar el listener
        TableRow tableRow1 = view.findViewById(R.id.tableRow1);
        tableRow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verRecetaEnsalada(v);
            }
        });

        return view; // Asegúrate de retornar la vista
    }
    // Este método se ejecutará al hacer clic en el TableRow
    public void verRecetaEnsalada(View view) {
        NavController navController = Navigation.findNavController(view);
        navController.navigate(R.id.fragment5);
    }

}