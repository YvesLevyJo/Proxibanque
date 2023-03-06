package services;

import entities.Client;
import persistance.IDaoCompte;
import persistance.DaoCompte;

import java.util.List;
import java.util.Optional;

public class ServiceClient implements IServiceClient {
    private IDaoCompte dao= new DaoCompte();

    @Override
    public void addClient(Client c) {

    }

    @Override
    public Optional<Client> getValidatedClient(int id) {
        return Optional.empty();
    }

    @Override
    public List<Client> getAllClient() {
        return null;
    }
}
