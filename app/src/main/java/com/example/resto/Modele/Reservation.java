package com.example.resto.Modele;

public class Reservation {

    protected String nomresto;
    protected String nomreservation;
    protected String nbpersonnes;
    protected String emplacement;
    protected String jour;
    protected String heure;

    public Reservation(String nomresto, String nomreservation, String nbpersonnes, String emplacement, String jour, String heure) {
        this.nomresto = nomresto;
        this.nomreservation = nomreservation;
        this.nbpersonnes = nbpersonnes;
        this.emplacement = emplacement;
        this.jour = jour;
        this.heure = heure;
    }

    public String getNomresto() {
        return nomresto;
    }

    public void setNomresto(String nomresto) {
        this.nomresto = nomresto;
    }

    public String getNomreservation() {
        return nomreservation;
    }

    public String getNbpersonnes() {
        return nbpersonnes;
    }

    public void setNbpersonnes(String nbpersonnes) {
        this.nbpersonnes = nbpersonnes;
    }

    public String getEmplacement() {
        return emplacement;
    }

    public void setEmplacement(String emplacement) {
        this.emplacement = emplacement;
    }

    public String getJour() {
        return jour;
    }

    public void setJour(String jour) {
        this.jour = jour;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

}
