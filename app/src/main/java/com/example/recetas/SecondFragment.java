package com.example.recetas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TableRow;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;

import com.example.recetas.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Cargar la vista del diseño del fragment
        View view = inflater.inflate(R.layout.fragment_second, container, false);

        // Obtener el TableRow y asignar el listener
        TableRow tableRow1 = view.findViewById(R.id.tableRow2);
        tableRow1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verRecetaCarne(v);
            }
        });

        return view; // Asegúrate de retornar la vista
    }
    // Este método se ejecutará al hacer clic en el TableRow
    public void verRecetaCarne(View view) {
        NavController navController = Navigation.findNavController(view);
        navController.navigate(R.id.fragment7);
    }

}