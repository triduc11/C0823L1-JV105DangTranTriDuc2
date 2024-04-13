package service;

import java.util.ArrayList;

public interface IService<T> {
    void add (T entity);
    ArrayList<T> display();
    void delete (String id);
    T findById(String id);
}
