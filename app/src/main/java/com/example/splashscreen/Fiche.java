package com.example.splashscreen;

public class Fiche {
    private String mois;
    private String etat;
    private int id_Fiche;
    private int id_Visiteur;


    public Fiche(String mois, String etat, int id_fiche, int id_visiteur) {
        this.mois = mois;
        this.etat = etat;
        id_Fiche = id_fiche;
        id_Visiteur = id_visiteur;
    }

    public String getMois() {
        return mois;
    }

    public void setMois(String mois) {
        this.mois = mois;
    }


    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public int getId_Fiche() {
        return id_Fiche;
    }

    public void setId_Fiche(int id_Fiche) {
        this.id_Fiche = id_Fiche;
    }

    public int getId_Visiteur() {
        return id_Visiteur;
    }

    public void setId_Visiteur(int id_Visiteur) {
        this.id_Visiteur = id_Visiteur;
    }
}
