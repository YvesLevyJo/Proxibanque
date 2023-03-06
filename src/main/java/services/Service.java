package services;

import entities.Client;
import persistance.IDao;
import persistance.MemoryDao;

import java.util.List;
import java.util.Optional;

public class Service implements IService{
    private IDao dao= new MemoryDao();
    @Override
    public void addClient(Client c) {
        if (c!= null ){
            dao.save(c);

        };
    }

    @Override
    public Optional<Client> getValidatedClient(int id) {
        Optional<Client> optionalClient= dao.findById(id);

        return optionalClient;
    }

    @Override
    public List<Client> getAllClient() {
        return dao.findAll();
    }
}
