package com.example.restaurant;
import com.example.restaurant.Administrateur.*;
import com.example.restaurant.Food.*;
import com.example.restaurant.Staff.*;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;


public class MainActivity extends AppCompatActivity {



    private EditText iD, password;
    private Button connect;
    private List<Manager> listeManager;
    private List<Serveur> listeServeur;
    private List<Cuisinier> listeCuisinier;
    private List<Plat> listePlats;
    private List<Ingredient> listeIngredients;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iD = (EditText) findViewById(R.id.identification_main);
        password = (EditText) findViewById(R.id.Password_main);
        connect = (Button) findViewById (R.id.connexion_main);

        listeManager = firstLoading.getListeManager();
        listeCuisinier = firstLoading.getListeCuisinier();
        listeServeur = firstLoading.getListeServeurs();
        listeIngredients =firstLoading.getListeRessources();
        listePlats = firstLoading.getListePlat();

        connect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                verify(iD.getText().toString(), password.getText().toString());
            }
        });
    }

    public void verify (String id, String password){
        if ( id.equals("Admin") && password.equals("1234")){
            Intent intent = new Intent(MainActivity.this, portailAdministrateur.class);
            startActivity(intent);
        }


    }

}