package com.example.restaurant;

public abstract class Personne {
    private String Nom;
    private String Prenom;
    private String ID;
    private String Password;

    public Personne (){}

    public Personne(String nom, String prenom, String ID, String password) {
        Nom = nom;
        Prenom = prenom;
        this.ID = ID;
        Password = password;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public void setPrenom(String prenom) {
        Prenom = prenom;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
