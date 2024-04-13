package Controller;

import Model.TaiKhoanTK;
import Model.TaiKhoanTT;
import Service.impl.TaiKhoanTKService;

import java.util.ArrayList;
import java.util.List;

public class TaiKhoanTKController {
    private final TaiKhoanTKService taiKhoanTKService=new TaiKhoanTKService();
    public ArrayList<TaiKhoanTK> findAll() {
        return taiKhoanTKService.display();
    }

    public TaiKhoanTK findById(String id) {
        return taiKhoanTKService.findById(id);
    }

    public void add(TaiKhoanTK taiKhoanTK) {
        taiKhoanTKService.add(taiKhoanTK);
    }

    public String delete(String id) {
        TaiKhoanTK taiKhoanTK = taiKhoanTKService.findById(id);
        if (taiKhoanTK != null) {
            taiKhoanTKService.delete(id);
            return "Delete successfully";
        } else {
            return "Code does not exist";
        }
    }
    public List<TaiKhoanTK> searchName (String name){
        return taiKhoanTKService.searchName(name);
    }
}
