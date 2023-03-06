package persistance;

import entities.Client;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.*;

public class DaoClient implements IDaoClient {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    EntityTransaction txn = em.getTransaction();
    @Override
    public void save(Client c) {
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
    public Optional<Client> findById(Long id) {
        Optional answer = Optional.empty();
            try {
                txn.begin();
                Client search = em.find(Client.class, id);
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
    public void delete(Client client) {
        try {
            txn.begin();
                em.remove(client);
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
