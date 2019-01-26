package dao;

import java.util.Collection;

public interface DAO<T extends Identifiable> {
    void store(T item);
    T get(int pk);
    Collection<T> getAll();
    void remove(int pk);
    default void remove(T object) {
        remove(object.id());
    }
}
