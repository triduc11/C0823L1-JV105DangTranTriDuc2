package repository;

import model.BenhNhan;

import java.util.ArrayList;

    public interface IRepository<T> {
        void add (T entity) ;
        ArrayList<T> display();
        void delete (String code);
        T findById(String code);
    }

