package dao;

import java.util.Collection;
import java.util.HashMap;

public class DAOCityHashMap implements DAO<City> {
    private final HashMap<Integer, City> storage = new HashMap<>();

    @Override
    public void store(City city) {
        storage.put(city.id(), city);
    }

    @Override
    public City get(int pk) {
        return storage.get(pk);
    }

    @Override
    public Collection<City> getAll() {
        return storage.values();
    }

    @Override
    public void remove(int pk) {
        storage.remove(pk);
    }
}
