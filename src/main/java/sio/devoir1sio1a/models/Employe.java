package sio.devoir1sio1a.models;

public class Employe
{
    private int idEmploye;
    private String nomEmploye;
    private String dateEmploye;
    private int nbHeures;

    public Employe(int idEmploye, String nomEmploye, String dateEmploye, int nbHeures) {
        this.idEmploye = idEmploye;
        this.nomEmploye = nomEmploye;
        this.dateEmploye = dateEmploye;
        this.nbHeures = nbHeures;
    }

    public Employe(int idEmploye, String nomEmploye) {
        this.idEmploye = idEmploye;
        this.nomEmploye = nomEmploye;
    }


    public int getIdEmploye() {
        return idEmploye;
    }

    public void setIdEmploye(int idEmploye) {
        this.idEmploye = idEmploye;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public String getDateEmploye() {
        return dateEmploye;
    }

    public void setDateEmploye(String dateEmploye) {
        this.dateEmploye = dateEmploye;
    }

    public int getNbHeures() {
        return nbHeures;
    }

    public void setNbHeures(int nbHeures) {
        this.nbHeures = nbHeures;
    }
}
