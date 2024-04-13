package service;

import model.BenhAn;

import java.util.ArrayList;

public interface IService {
    public void add(BenhAn product);
    public void delete(String id);
    public void update(BenhAn benhAn);
    public BenhAn get(String id);
    public ArrayList<BenhAn> getAll() ;
}
