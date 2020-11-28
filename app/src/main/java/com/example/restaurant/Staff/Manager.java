package com.example.restaurant.Staff;

import com.example.restaurant.Personne;
import com.example.restaurant.Staff.Cuisinier;
import com.example.restaurant.Staff.Serveur;

import java.util.List;

public class Manager extends Personne {
    private List<Serveur> serveurs;
    private List<Cuisinier>Cuisinier;

    public Manager(List<Serveur> serveurs, List<com.example.restaurant.Staff.Cuisinier> cuisinier) {
        this.serveurs = serveurs;
        Cuisinier = cuisinier;
    }

    public Manager(String nom, String prenom, String ID, String password, List<Serveur> serveurs, List<com.example.restaurant.Staff.Cuisinier> cuisinier) {
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

    public List<com.example.restaurant.Staff.Cuisinier> getCuisinier() {
        return Cuisinier;
    }

    public void setCuisinier(List<com.example.restaurant.Staff.Cuisinier> cuisinier) {
        Cuisinier = cuisinier;
    }
}
