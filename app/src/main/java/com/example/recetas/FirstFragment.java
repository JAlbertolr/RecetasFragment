package com.example.recetas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TableRow;


import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;




public class FirstFragment extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Cargar la vista del diseño del fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        // Obtener el TableRow y asignar el listener
        TableRow tableRow1 = view.findViewById(R.id.tableRow1);
        tableRow1.setOnClickListener(v -> onTableRowClick());
        return view;
    }
    // Este método se ejecutará al hacer clic en el TableRow
    public void onTableRowClick() {
        // Crear el Fragment5 y navegar hacia él
        FragmentTransaction transaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragment5 fragment5 = new fragment5();

        // Pasar datos al Fragment5 (por ejemplo, nombre de la receta)
        Bundle bundle = new Bundle();
        bundle.putString("recipe_name", "Nombre de la receta");
        fragment5.setArguments(bundle);

        // Reemplazar el fragmento actual por Fragment5
        transaction.replace(R.id.fragmentContainerView, fragment5);
        transaction.addToBackStack(null); // Opcional, para que el fragmento sea apilado en la pila de retroceso
        transaction.commit();
    }

}