package Controller;

import Model.TaiKhoanTT;
import Service.impl.TaiKhoanTTService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaiKhoanTTController {
    private final TaiKhoanTTService taiKhoanTTService = new TaiKhoanTTService();

    public ArrayList<TaiKhoanTT> findAll() {
        return taiKhoanTTService.display();
    }

    public TaiKhoanTT findById(String id) {
        return taiKhoanTTService.findById(id);
    }

    public void add(TaiKhoanTT taiKhoanTT) {
        taiKhoanTTService.add(taiKhoanTT);
    }

    public String delete(String id) {
        TaiKhoanTT taiKhoanTT = taiKhoanTTService.findById(id);
        if (taiKhoanTT != null) {
            taiKhoanTTService.delete(id);
            return "Delete successfully";
        } else {
            return "Code does not exist";
        }
    }
    public List<TaiKhoanTT> searchName (String name){
        return taiKhoanTTService.searchName(name);
    }
}


