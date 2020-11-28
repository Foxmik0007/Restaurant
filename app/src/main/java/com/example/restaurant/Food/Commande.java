package com.example.restaurant.Food;

import com.example.restaurant.Food.Plat;

import java.util.List;

public class Commande {
    private List<Plat>commande;
    private int total;

    public Commande() {
    }

    public Commande(List<Plat> commande, int total) {
        this.commande = commande;
        this.total = total;
    }

    public List<Plat> getCommande() {
        return commande;
    }

    public void setCommande(List<Plat> commande) {
        this.commande = commande;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
