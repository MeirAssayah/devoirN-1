package sio.devoir1sio1a;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import sio.devoir1sio1a.models.Employe;
import sio.devoir1sio1a.models.Rayon;
import sio.devoir1sio1a.models.Secteur;

import javax.swing.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class DevoirController implements Initializable
{
    ArrayList<Secteur> secteurs;
    ArrayList<Employe> employes;
    @FXML
    private TableColumn tcNomSecteur;
    @FXML
    private TableView tvRayons;
    @FXML
    private TableView tvEmployesRayon;
    @FXML
    private TableColumn tcNumeroEmployeAll;
    @FXML
    private TableView tvEmployesAll;
    @FXML
    private TableColumn tcDateEmployeRayon;
    @FXML
    private TableColumn tcNumeroRayon;
    @FXML
    private TableColumn tcNumeroEmployeRayon;
    @FXML
    private TableColumn tcNomRayon;
    @FXML
    private TableView tvSecteurs;
    @FXML
    private TableColumn tcNomEmployeAll;
    @FXML
    private TableColumn tcNomEmployeRayon;
    @FXML
    private TableColumn tcHeureEmployeRayon;
    @FXML
    private TableColumn tcNumeroSecteur;
    @FXML
    private Button btnAjouter;
    @FXML
    private DatePicker dpDate;
    @FXML
    private TextField txtNbHeures;
    @FXML
    private TextField txtTotalRayon;
    @FXML
    private TextField txtTotalSecteur;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        secteurs = new ArrayList<>();
        employes = new ArrayList<>();
        initDatas();
        secteurs.add(secteurs.get(0));
        secteurs.add(secteurs.get(1));
        secteurs.add(secteurs.get(2));

        tcNumeroSecteur.setCellValueFactory(new PropertyValueFactory<>("Numéro"));
        tcNomSecteur.setCellValueFactory(new PropertyValueFactory<>("Nom"));

        tvSecteurs.setItems(FXCollections.observableArrayList(secteurs));

        employes.addAll(employes);
        tcNumeroEmployeAll.setCellValueFactory(new PropertyValueFactory<>("Numero"));
        tcNomEmployeAll.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        tvEmployesAll.setItems(FXCollections.observableArrayList(employes));

        // A vous de jouer


    }

    // Cette méthode permet de remplir les 2 collections
    // La liste de tous les employés
    // La liste de tous les secteurs
    // Ne pas toucher ce code
    public void initDatas()
    {
        Secteur produitsFrais = new Secteur(1,"Produits frais");
        Secteur alimentation = new Secteur(2,"Alimentation");
        Secteur maison = new Secteur(3,"Maison");

        Rayon legumes = new Rayon(1,"Légumes");
        Rayon viande = new Rayon(2,"Viande");

        Rayon gateaux = new Rayon(3,"Gâteaux");
        Rayon conserves = new Rayon(4,"Conserves");
        Rayon pates = new Rayon(5,"Pâtes");

        Rayon produitsEntretien = new Rayon(6,"Produits entretien");
        Rayon decoration = new Rayon(7,"Décorations");

        Employe fortin = new Employe(1,"Fortin");
        Employe cousinot = new Employe(2,"Cousinot");
        Employe alison = new Employe(3,"Alison");
        Employe texier = new Employe(4,"Texier");
        Employe garnier = new Employe(5,"Garnier");
        Employe muller = new Employe(6,"Muller");
        Employe rodriguez = new Employe(7,"Rodriguez");
        Employe rousseau = new Employe(8,"Rousseau");

        produitsFrais.ajouterRayon(legumes); produitsFrais.ajouterRayon(viande);
        alimentation.ajouterRayon(gateaux);alimentation.ajouterRayon(conserves);alimentation.ajouterRayon(pates);
        maison.ajouterRayon(produitsEntretien);maison.ajouterRayon(decoration);

        secteurs.add(produitsFrais);
        secteurs.add(alimentation);
        secteurs.add(maison);

        employes.add(fortin);employes.add(cousinot);employes.add(alison);employes.add(texier);
        employes.add(garnier);employes.add(muller);employes.add(rodriguez);employes.add(rousseau);
    }

    @FXML
    public void tvSecteursClicked(Event event)
    {
        // A vous de jouer



        tvSecteurs.setItems(FXCollections.observableArrayList(secteurs));

        ((Secteur)tvSecteurs.getSelectionModel().getSelectedItem().getClass());
        tvSecteurs.setItems(FXCollections.observableArrayList(tvSecteurs));
        tcNumeroSecteur.setCellValueFactory(new PropertyValueFactory<>("Numero"));
        tcNomSecteur.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        tcNumeroSecteur.setText(tcNumeroSecteur.getText());
        tcNomSecteur.setText(tcNomSecteur.getText());



    }

    @FXML
    public void tvRayonsClicked(Event event)
    {
        // A vous de jouer


        tvRayons.setItems(FXCollections.observableArrayList(tvRayons));
        ((Rayon)tvRayons.getSelectionModel().getSelectedItem().getClass());
        tvRayons.setItems(FXCollections.observableArrayList(tvRayons));
        tcNumeroRayon.setCellValueFactory(new PropertyValueFactory<>("Numero"));
        tcNomRayon.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        tcNumeroRayon.setText(tcNumeroRayon.getText());
        tcNomRayon.setText(tcNomRayon.getText());



    }

    @FXML
    public void btnAjouterAction(ActionEvent actionEvent)
    {
        tvEmployesAll.setItems(FXCollections.observableArrayList(employes));

        ((Employe))tvEmployesAll.setItems(FXCollections.observableArrayList(employes));
        tcNumeroEmployeAll.setCellValueFactory(new PropertyValueFactory<>("Numero"));
        tcNomEmployeAll.setCellValueFactory(new PropertyValueFactory<>("Nom"));
        tcNumeroEmployeAll.setText(tcNumeroEmployeAll.getText());
        tcNomEmployeAll.setText(tcNomEmployeAll.getText());
        // A vous de jouer




    }
}