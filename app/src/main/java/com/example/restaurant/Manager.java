package com.example.restaurant;

import java.util.List;

public class Manager extends Personne {
    private List<Serveur> serveurs;
    private List<Cuisinier>Cuisinier;

    public Manager(List<Serveur> serveurs, List<com.example.restaurant.Cuisinier> cuisinier) {
        this.serveurs = serveurs;
        Cuisinier = cuisinier;
    }

    public Manager(String nom, String prenom, String ID, String password, List<Serveur> serveurs, List<com.example.restaurant.Cuisinier> cuisinier) {
        super(nom, prenom, ID, password);
        this.serveurs = serveurs;
        Cuisinier = cuisinier;
    }

    public Manager() {
    }

    public List<Serveur> getServeurs() {
        return serveurs;
    }

    public void setServeurs(List<Serveur> serveurs) {
        this.serveurs = serveurs;
    }

    public List<com.example.restaurant.Cuisinier> getCuisinier() {
        return Cuisinier;
    }

    public void setCuisinier(List<com.example.restaurant.Cuisinier> cuisinier) {
        Cuisinier = cuisinier;
    }
}
