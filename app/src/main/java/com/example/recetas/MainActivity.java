package com.example.recetas;

import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnHome(View view) {
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
        navController.navigate(R.id.FirstFragment);
    }

    public void btnEnsalada(View view) {
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
        navController.navigate(R.id.FirstFragment);
    }

    public void btnCarne(View view) {
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
        navController.navigate(R.id.SecondFragment);
    }

    public void btnPescado(View view) {
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
        navController.navigate(R.id.fragment3);
    }

    public void btnPostre(View view) {
        NavController navController = Navigation.findNavController(this, R.id.fragmentContainerView);
        navController.navigate(R.id.fragment4);
    }
}