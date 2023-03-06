package entities;

import javax.persistence.Entity;

@Entity

public class CompteEpargne extends Compte{

    double tauxDeRemuneration;

    public CompteEpargne(Long numero, double solde, Client client) {
        super(numero, solde, client);
        this.tauxDeRemuneration = 3/100;
    }

    @Override
    public String toString() {
        return "CompteEpargne{" +
                "tauxDeRemuneration=" + tauxDeRemuneration +
                ", numero=" + numero +
                ", solde=" + solde +
                ", dateOuverture='" + dateOuverture + '\'' +
                '}';
    }
}
