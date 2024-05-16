package session11.model;

public interface ServiceFunction<T> {
    void create(T object);
    void update(T object);
    void delete(T object);
    void getAll(T object);

}
