package sio.devoir1sio1a.models;

import java.util.ArrayList;

public class Rayon
{
    private int idRayon;
    private String nomRayon;
    private ArrayList<Employe> employes;

    public Rayon(int idRayon, String nomRayon) {
        this.idRayon = idRayon;
        this.nomRayon = nomRayon;
        this.employes = new ArrayList<>();
    }

    public int getIdRayon() {
        return idRayon;
    }

    public void setIdRayon(int idRayon) {
        this.idRayon = idRayon;
    }

    public String getNomRayon() {
        return nomRayon;
    }

    public void setNomRayon(String nomRayon) {
        this.nomRayon = nomRayon;
    }

    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    public void ajouterEmploye(Employe employe)
    {
        this.employes.add(employe);
    }

    // Cette méthode permet de calculer le nombre d'heures total pour le rayon
    public int calculerTotalHeures()
    {
        // A vous de jouer
       for (Employe employe: employes){
           totalHeureRayon=totalHeureRayon+ employe.getNbHeures();
           return totalHeureRayon;
       }
    }
}
