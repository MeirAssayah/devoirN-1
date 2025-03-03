package sio.devoir1sio1a.models;

import java.util.ArrayList;

public class Secteur
{
    private int idSecteur;
    private String nomSecteur;
    private ArrayList<Rayon> rayons;

    public Secteur(int idSecteur, String nomSecteur) {
        this.idSecteur = idSecteur;
        this.nomSecteur = nomSecteur;
        this.rayons = new ArrayList<>();

    }

    public int getIdSecteur() {
        return idSecteur;
    }

    public void setIdSecteur(int idSecteur) {
        this.idSecteur = idSecteur;
    }

    public String getNomSecteur() {
        return nomSecteur;
    }

    public void setNomSecteur(String nomSecteur) {
        this.nomSecteur = nomSecteur;
    }

    public ArrayList<Rayon> getRayons() {
        return rayons;
    }

    public void setRayons(ArrayList<Rayon> rayons) {
        this.rayons = rayons;
    }

    public void ajouterRayon(Rayon rayon)
    {
        this.rayons.add(rayon);
    }

    // Cette méthode permet de calculer le nombre d'heures total pour le secteur
    public int calculerTotalHeures()
    {
        // A vous de jouer
        for (Secteur secteur : getIdSecteur()){

            totalHeurSecteur=totalHeurSecteur+secteur.getIdSecteur();
                    return totalHeurSecteur;
        }
    }
}
