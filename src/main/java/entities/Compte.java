package entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;
public abstract class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numero;
    static int nbCompte;
    static List<Compte> comptes;

    double solde;
    String dateOuverture;

    @ManyToOne
    Client client;

    public Compte(Long numero, double solde, Client client) {
        this.numero = numero;
        this.solde = solde;
        this.dateOuverture = "today";
        this.client = client;
    }

    private static void ajoutCompteListe(Compte compte) {
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

    public static List<Compte> getComptes() {
        return comptes;
    }

    public static void setComptes(List<Compte> comptes) {
        Compte.comptes = comptes;
    }

    @Override
    public String toString() {
        return "Compte{" + "numero=" + numero + ", solde=" + solde + ", dateOuverture='" + dateOuverture + '\'' + '}';
    }
}
