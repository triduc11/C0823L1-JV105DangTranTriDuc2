package service.impl;

import model.BenhNhanVIP;
import repository.impl.BenhNhanVIPRepository;
import service.IService;

import java.util.ArrayList;

public class BenhNhanVIPService implements IService<BenhNhanVIP> {
    private final BenhNhanVIPRepository benhNhanVIPRepository = new BenhNhanVIPRepository();

    @Override
    public void add(BenhNhanVIP benhNhanVIP) {
        benhNhanVIPRepository.add(benhNhanVIP);
    }

    @Override
    public ArrayList<BenhNhanVIP> display() {
        return benhNhanVIPRepository.display();
    }

    @Override
    public void delete(String id) {
        benhNhanVIPRepository.delete(id);
    }

    @Override
    public BenhNhanVIP findById(String id) {
        return benhNhanVIPRepository.findById(id);
    }


}
