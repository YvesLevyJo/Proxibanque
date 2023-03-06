package persistance;

import entities.Client;

import java.util.*;

public class MemoryDao  implements IDao{

    private static final Map<Integer, Client> DB = new HashMap<>();

    private static Integer id =0;
    @Override
    public void save(Client c) {

    }

    @Override
    public Optional<Client> findById(int id) {
        return Optional.ofNullable(DB.get(id));
    }

    @Override
    public void delete(int id) {
        DB.remove(id);
    }

    @Override
    public List<Client> findAll() {
        return new ArrayList<>(DB.values());
    }
}
