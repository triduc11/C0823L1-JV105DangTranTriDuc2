package Service.impl;

import Model.TaiKhoanTT;
import Repository.impl.TaiKhoanTTRepository;
import Service.IService;

import java.util.ArrayList;
import java.util.List;

public class TaiKhoanTTService implements IService<TaiKhoanTT> {
    private final TaiKhoanTTRepository taiKhoanTTRepository = new TaiKhoanTTRepository();

    @Override
    public void add(TaiKhoanTT taiKhoanTT) {
        taiKhoanTTRepository.add(taiKhoanTT);
    }

    @Override
    public ArrayList<TaiKhoanTT> display() {
        return taiKhoanTTRepository.display();
    }

    @Override
    public TaiKhoanTT update(TaiKhoanTT taiKhoanTT) {
        return null;
    }

    @Override
    public void delete(String id) {
        taiKhoanTTRepository.delete(id);
    }

    @Override
    public TaiKhoanTT findById(String id) {
        return taiKhoanTTRepository.findById(id);
    }
    public List<TaiKhoanTT> searchName (String name){
        return taiKhoanTTRepository.searchName(name);
    }
}
