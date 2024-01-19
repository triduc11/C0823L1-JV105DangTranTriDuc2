package Repository;

import Model.Employee;

import java.util.ArrayList;

public interface IRepository<T> {
    void add (T entity) ;
    ArrayList<T> display();
    T update(T entity);
    void delete (String id);
    T findById(String id);
}
