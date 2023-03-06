package presentation;

import entities.Client;
import entities.CompteCourant;
import persistance.DaoClient;
import persistance.DaoCompte;
import persistance.IDaoClient;
import persistance.IDaoCompte;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class Main {
    public static void main(String[] args) {

        IDaoClient daoClient = new DaoClient();
        IDaoCompte daoCompte = new DaoCompte();

        Client jon = new Client("Jon", "Do", "Mancity");
        CompteCourant compte1 = new CompteCourant(1200, 1000, "hier", jon);
        CompteCourant compte2 = new CompteCourant(100, 10, "avant-hier", jon);
        CompteCourant compte3 = new CompteCourant(300, 30, "demain", jon);
        //#TODO Delete non fonctionnel
        daoClient.delete(jon);
        daoCompte.delete(compte2);

    }

}
