package entities;

import javax.persistence.Entity;

@Entity
public class CompteCourant extends Compte{

    double autorisaiotnDecouvert;

    public CompteCourant(Long numero, double solde, Client client) {
        super(numero, solde, client);
        this.autorisaiotnDecouvert = 1000.0;
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
