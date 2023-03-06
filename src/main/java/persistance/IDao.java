package persistance;

import entities.Client;

import java.util.List;
import java.util.Optional;

public interface IDao {

    void save (Client c);

    Optional<Client> findById(int id);

    void delete (int id);

    List<Client> findAll();
}
