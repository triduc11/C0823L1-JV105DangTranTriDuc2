package Service.impl;

import Model.TaiKhoanTK;
import Repository.impl.TaiKhoanTKRepository;
import Service.IService;

import java.util.ArrayList;
import java.util.List;

public class TaiKhoanTKService implements IService<TaiKhoanTK> {
    private final TaiKhoanTKRepository taiKhoanTKRepository =new TaiKhoanTKRepository();
    @Override
    public void add(TaiKhoanTK taiKhoanTK) {
        taiKhoanTKRepository.add(taiKhoanTK);
    }

    @Override
    public ArrayList<TaiKhoanTK> display() {
        return taiKhoanTKRepository.display();
    }

    @Override
    public TaiKhoanTK update(TaiKhoanTK taiKhoanTK) {
        return null;
    }

    @Override
    public void delete(String id) {
        taiKhoanTKRepository.delete(id);
    }

    @Override
    public TaiKhoanTK findById(String id) {
        return taiKhoanTKRepository.findById(id);
    }
    public List<TaiKhoanTK> searchName (String name){
        return taiKhoanTKRepository.searchName(name);
    }
}
