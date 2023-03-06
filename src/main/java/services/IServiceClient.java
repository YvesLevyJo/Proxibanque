package services;

import entities.Client;

import java.util.List;
import java.util.Optional;

public interface IServiceClient {
    void addClient(Client c);
    Optional<Client> getValidatedClient(int id);

    List<Client> getAllClient();
}
