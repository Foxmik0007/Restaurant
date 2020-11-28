package com.example.restaurant.Administrateur;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.restaurant.R;

public class portailAdministrateur extends AppCompatActivity {


    private Button listeEmploye, platsDisponibles, ressourcesDisponibles, recetteRestaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portail_administrateur);

        listeEmploye = (Button) findViewById(R.id.listeEmploye);
        platsDisponibles = (Button) findViewById(R.id.PlatsDisponible);
        ressourcesDisponibles = (Button) findViewById(R.id.RessourcesDisponibles);
        recetteRestaurant = (Button) findViewById(R.id.recette);

        listeEmploye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(portailAdministrateur.this, com.example.restaurant.Staff.listeEmploye.class);
                startActivity(intent);
            }
        });
    }
}