package com.example.restaurant;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.restaurant.Food.Ingredient;
import com.example.restaurant.Food.Plat;
import com.example.restaurant.Staff.Cuisinier;
import com.example.restaurant.Staff.Manager;
import com.example.restaurant.Staff.Serveur;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class firstLoading extends AppCompatActivity {

    private static DatabaseReference Managers;
    private static DatabaseReference Serveurs;
    private static DatabaseReference Cuisinier;
    private static DatabaseReference Plats;
    private static DatabaseReference Ressources;

    private static List<Manager> listeManager;
    private static List<Serveur> listeServeurs;
    private static List<com.example.restaurant.Staff.Cuisinier> listeCuisinier;
    private static List<Plat> listePlat;
    private static List<Ingredient> listeRessources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_loading);

        listeManager = new ArrayList<>();
        listeServeurs = new ArrayList<>();
        listeCuisinier = new ArrayList<>();
        listePlat = new ArrayList<>();
        listeRessources = new ArrayList<>();

        Managers = FirebaseDatabase.getInstance().getReference("STAFF/MANAGER");
        Serveurs = FirebaseDatabase.getInstance().getReference("STAFF/SERVERS");
        Cuisinier = FirebaseDatabase.getInstance().getReference("STAFF/COOKER");
        Plats = FirebaseDatabase.getInstance().getReference("FOOD/MEAL");
        Ressources = FirebaseDatabase.getInstance().getReference("FOOD/INGREDIENTS");

        Handler handler = new Handler();

        //CONFIGURATION DELAIS D'ATTENTE
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(firstLoading.this, MainActivity.class);
                startActivity(intent);
                finish();
            }

            }, 2000);
    }

    //RECUPERATION DONNEES POUR LE LOGIN
    @Override
    protected void onStart() {
        super.onStart();

        // Recuperation Managers
        Managers.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot serviceSnap : dataSnapshot.getChildren()){
                    Manager manager = serviceSnap.getValue(Manager.class);
                    Boolean verify = false;

                    for (short i = 0; i < listeManager.size(); i++){
                        if (manager.getNom() == listeManager.get(i).getNom())
                            verify = true;
                    }
                    if (!verify)
                        listeManager.add(manager);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });


        // Recuperation Serveurs
        Serveurs.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                for (DataSnapshot serviceSnap : dataSnapshot.getChildren()){
                    Serveur serveur = serviceSnap.getValue(Serveur.class);
                    Boolean verify = false;

                    for (short i = 0; i < listeServeurs.size(); i++){
                        if (serveur.getNom() == listeServeurs.get(i).getNom())
                            verify = true;
                    }
                    if (!verify)
                        listeServeurs.add(serveur);
                }

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        // Recuperation Cuisinier
        Cuisinier.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot serviceSnap : snapshot.getChildren()){
                    Cuisinier cuisinier = serviceSnap.getValue(Cuisinier.class);
                    Boolean verify = false;

                    for (short i = 0; i < listeCuisinier.size(); i++){
                        if (cuisinier.getNom() == listeCuisinier.get(i).getNom())
                            verify = true;
                    }
                    if (!verify)
                        listeCuisinier.add( cuisinier );
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        } );

        // Recuperation Plats
        Plats.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot serviceSnap : snapshot.getChildren()){
                    Plat plat = serviceSnap.getValue(Plat.class);
                    Boolean verify = false;

                    for (short i = 0; i < listePlat.size(); i++){
                        if (plat.getNom() == listePlat.get(i).getNom())
                            verify = true;
                    }
                    if (!verify)
                        listePlat.add( plat );
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        } );


        //Recuperation Ingredients
        Ressources.addValueEventListener( new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot serviceSnap : snapshot.getChildren()){
                    Ingredient ingredient = serviceSnap.getValue(Ingredient.class);
                    Boolean verify = false;

                    for (short i = 0; i < listeRessources.size(); i++){
                        if (ingredient.getNom() == listeRessources.get(i).getNom())
                            verify = true;
                    }
                    if (!verify)
                        listeRessources.add( ingredient );
                }
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        } );

    }

    public static List<Manager> getListeManager() {
        return listeManager;
    }

    public static List<Serveur> getListeServeurs() {
        return listeServeurs;
    }

    public static List<com.example.restaurant.Staff.Cuisinier> getListeCuisinier() {
        return listeCuisinier;
    }

    public static List<Plat> getListePlat() {
        return listePlat;
    }

    public static List<Ingredient> getListeRessources() {
        return listeRessources;
    }
}