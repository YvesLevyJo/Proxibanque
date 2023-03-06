package persistance;

import entities.Client;

import java.util.List;
import java.util.Optional;

public interface IDaoClient {

    void save (Client c);

    Optional<Client> findById(Long id);

    void delete (Client id);
}
