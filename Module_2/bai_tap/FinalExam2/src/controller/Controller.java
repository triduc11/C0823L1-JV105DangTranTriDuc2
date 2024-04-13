package controller;

import model.BenhAn;
import service.IService;

import java.util.ArrayList;

public class Controller {
    private IService service;

    public Controller(IService service) {
        this.service = service;
    }

    public String add(BenhAn benhAn) {
        String id = benhAn.getId();
        System.out.println(get(id));
        if (service.get(id) == null) {
            service.add(benhAn);
            return "Add successfull";
        }
        return "Product already exist !";

    }
    public String update(BenhAn benhAn) {
        String id = benhAn.getId();
        System.out.println(get(id));
        if (service.get(id) != null) {
            service.update(benhAn);
            return "Update successfull";
        }
        return "Benh an khong ton tai !";
    }
    public String delete(String id) {
        if (service.get(id) != null) {
            service.delete(id);
            return "Delete successfull";
        }
        return "Benh an khong tồn tại !";
    }

    public ArrayList<BenhAn> getAll() {
        return service.getAll();
    }
    public BenhAn get(String id) {
        return service.get(id);
    }
}
