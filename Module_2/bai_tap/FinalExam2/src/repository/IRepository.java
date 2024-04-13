package repository;

import model.BenhAn;

import java.util.ArrayList;

public interface IRepository {
    public void add(BenhAn benhAn);
    public void delete(String id);
    public void update(BenhAn benhAn);
    public BenhAn get(String id);
    public ArrayList<BenhAn> getAll() ;
}
