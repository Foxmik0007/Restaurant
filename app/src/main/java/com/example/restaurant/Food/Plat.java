package com.example.restaurant.Food;

import java.util.List;

public class Plat {
    private String nom;
    private int prix;
    private List <Ingredient> ingredients;

    public Plat() {
    }

    public Plat(String nom, int prix, List<Ingredient> ingredients) {
        this.nom = nom;
        this.prix = prix;
        this.ingredients = ingredients;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
