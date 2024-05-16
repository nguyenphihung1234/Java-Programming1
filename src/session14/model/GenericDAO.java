package session14.model;

import java.util.List;

public interface GenericDAO<T> {
    boolean insert(T entity);

    boolean update(T entity);

    boolean delete(int id);

    T getById(int id);

    List<T> getAll();
}
