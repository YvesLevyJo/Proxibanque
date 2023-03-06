package persistance;

import entities.Client;
import entities.CompteCourant;

import java.util.List;
import java.util.Optional;

public interface IDaoCompte {

    void save (CompteCourant c);

    Optional<CompteCourant> findById(Long id);

    void delete (CompteCourant compte);
}
