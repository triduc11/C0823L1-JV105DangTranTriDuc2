package service;

import model.BenhAn;
import repository.IRepository;

import java.util.ArrayList;

public class Service implements IService {
    private IRepository repository;

    public Service(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public void add(BenhAn benhAn) {
        repository.add(benhAn);
    }

    @Override
    public void update(BenhAn benhAn) {
        repository.update(benhAn);
    }
    @Override
    public void delete(String id) {
        repository.delete(id);
    }

    @Override
    public BenhAn get(String id) {
        return repository.get(id);
    }

    @Override
    public ArrayList<BenhAn> getAll() {
        return repository.getAll();
    }
}
