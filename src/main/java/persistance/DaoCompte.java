package persistance;

import entities.Client;
import entities.CompteCourant;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class DaoCompte implements IDaoCompte {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    EntityTransaction txn = em.getTransaction();
    @Override
    public void save(CompteCourant c) {
        if(c!=null){
            try {
                txn.begin();

                em.persist(c);

                txn.commit();
            } catch (Exception e) {
                if (txn != null) {
                    txn.rollback();
                }
                e.printStackTrace();
            } finally {
                if (em != null) {
                    em.close();
                }
                if (emf != null) {
                    emf.close();
                }
            }
        }
    }
    @Override
    public Optional<CompteCourant> findById(Long id) {
        Optional answer = Optional.empty();
        try {
            txn.begin();
            CompteCourant search = em.find(CompteCourant.class, id);
            if(search != null){
                answer = Optional.of(search);
            }
            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
        return answer;
    }
    @Override
    public void delete(CompteCourant compte) {
        try {
            txn.begin();
            em.remove(compte);
            txn.commit();
        } catch (Exception e) {
            if (txn != null) {
                txn.rollback();
            }
            e.printStackTrace();
        } finally {
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }
    }

}
