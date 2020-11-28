package com.example.restaurant.Staff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.restaurant.R;

public class listeEmploye extends AppCompatActivity {

    private Button listeManager, listeServeur, listeCuisinier;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liste_employe);

    listeManager = (Button) findViewById(R.id.listeManager);
    listeServeur = (Button) findViewById(R.id.listeServeur);
    listeCuisinier = (Button) findViewById(R.id.listeCuisinier);

    }
}