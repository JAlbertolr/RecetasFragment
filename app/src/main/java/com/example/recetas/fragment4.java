package com.example.recetas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableRow;


public class fragment4 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Cargar la vista del diseño del fragment
        View view = inflater.inflate(R.layout.fragment_fragment4, container, false);

        // Obtener el TableRow y asignar el listener
        TableRow tableRow1 = view.findViewById(R.id.tableRow4);
        tableRow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verRecetaPescado(v);
            }
        });

        return view; // Asegúrate de retornar la vista
    }
    // Este método se ejecutará al hacer clic en el TableRow
    public void verRecetaPescado(View view) {
        NavController navController = Navigation.findNavController(view);
        navController.navigate(R.id.fragment6);
    }

}