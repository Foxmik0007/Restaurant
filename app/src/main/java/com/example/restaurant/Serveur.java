package com.example.restaurant;

public class Serveur extends Personne {
    private Manager manager;

    public Serveur() {
    }

    public Serveur(Manager manager) {
        this.manager = manager;
    }

    public Serveur(String nom, String prenom, String ID, String password, Manager manager) {
        super(nom, prenom, ID, password);
        this.manager = manager;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
