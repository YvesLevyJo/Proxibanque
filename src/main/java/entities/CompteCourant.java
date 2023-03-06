package entities;

import javax.persistence.*;
import java.util.List;

@Entity
public class CompteCourant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numero;
    static int nbCompte;
    static List<CompteCourant> comptes;

    double autorisaiotnDecouvert;

    public CompteCourant(double autorisaiotnDecouvert, double solde, String dateOuverture, Client client) {
        this.autorisaiotnDecouvert = autorisaiotnDecouvert;
        this.solde = solde;
        this.dateOuverture = dateOuverture;
        this.client = client;
    }

    double solde;
    String dateOuverture;

    @ManyToOne
    @JoinColumn(name = "client_id")
    Client client;

    public CompteCourant(Long numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.dateOuverture = "today";
        this.client = client;
    }

    private static void ajoutCompteListe(CompteCourant compte) {
        comptes.add(compte);
    }

    private void incrementeId() {
        nbCompte++;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public double getSolde() {
        return solde;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(String dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public static List<CompteCourant> getComptes() {
        return comptes;
    }

    public static void setComptes(List<CompteCourant> comptes) {
        CompteCourant.comptes = comptes;
    }

    @Override
    public String toString() {
        return "CompteCourant{" +
                "autorisaiotnDecouvert=" + autorisaiotnDecouvert +
                ", numero=" + numero +
                ", solde=" + solde +
                ", dateOuverture='" + dateOuverture + '\'' +
                '}';
    }
}
