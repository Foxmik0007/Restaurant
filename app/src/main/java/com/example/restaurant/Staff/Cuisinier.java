package com.example.restaurant.Staff;

import com.example.restaurant.Personne;

public class Cuisinier extends Personne {
    private Manager manager;

    public Cuisinier() {
    }

    public Cuisinier(Manager manager) {
        this.manager = manager;
    }

    public Cuisinier(String nom, String prenom, String ID, String password, Manager manager) {
        super(nom, prenom, ID, password);
        this.manager = manager;
    }
}
