package repository;

import java.util.ArrayList;

public interface IRepository<T> {
    void add (T entity) ;
    ArrayList<T> findAll();
    void delete (String id);
    T findById(String id);
}
