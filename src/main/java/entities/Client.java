package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
    @Entity
    public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String prenom;
    private String nom;
    private String adresse;
    @OneToMany(mappedBy = "client")
    Collection<CompteCourant> listeComptes = new ArrayList<>();

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // toString
    @Override
    public String toString() {
        return "Client [prenom=" + prenom + ", nom=" + nom + ", adresse=" + adresse + "]";
    }

    public Collection<CompteCourant> getListeComptes() {
        return listeComptes;
    }

    public void addCompte(CompteCourant c) {
        listeComptes.add(c);
    }

    public void setListeComptes(CompteCourant compte) {
        addCompte(compte);
    }
}