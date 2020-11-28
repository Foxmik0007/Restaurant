package com.example.restaurant.Administrateur;
import com.example.restaurant.Personne;

public class Administrateur extends Personne {
    private Administrateur administrateur;

    private Administrateur() {
    }

    private Administrateur(String nom,String prenom, String ID, String password) {
        super(nom, prenom, ID, password);
    }

    public Administrateur getAdministrateur() {
        return administrateur;
    }

    public void Create (String nom, String prenom, String id, String password){
        if (administrateur == null)
            administrateur = new Administrateur(nom, prenom, id, password);
    }

}
