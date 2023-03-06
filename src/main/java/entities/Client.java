package entities;

import java.util.ArrayList;
import java.util.Collection;

public class Client {

    private String prenom;
    private String nom;
    private String adresse;
    Collection<Compte> listeComptes = new ArrayList<>();
    TypeDeCarte carte;
    private int id;

    // Constructeur
    public Client(String prenom, String nom, String adresse) {
        this.prenom = prenom;
        this.nom = nom;
        this.adresse = adresse;
    }

    // Getters & Setters
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // toString
    @Override
    public String toString() {
        return "Client [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
    }

    public Collection<Compte> getListeComptes() {
        return listeComptes;
    }

    public void addCompte(Compte c) {
        listeComptes.add(c);
    }

    public void setListeComptes(Compte compte) {
        addCompte(compte);
    }
}