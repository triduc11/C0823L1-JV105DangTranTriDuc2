package controller;

import model.BenhNhanVIP;
import service.impl.BenhNhanVIPService;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class BenhNhanVIPController {
    private final BenhNhanVIPService benhNhanVIPService = new BenhNhanVIPService();

    public ArrayList<BenhNhanVIP> findAll() {
        return benhNhanVIPService.display();
    }

    public BenhNhanVIP findByID(String id) {
        return benhNhanVIPService.findById(id);
    }

    public void add(BenhNhanVIP benhNhanVIP) {
        benhNhanVIPService.add(benhNhanVIP);
    }

    public String delete(String id) {
        Scanner scanner = new Scanner(System.in);
        BenhNhanVIP benhNhanVIP = benhNhanVIPService.findById(id);
        System.out.println("Yes or No");
        String choose = scanner.nextLine();
        if (benhNhanVIP != null) {
            if (Objects.equals(choose, "Yes")) {
                benhNhanVIPService.delete(id);
                return "Delete successfully";
            } else {
                return "Return menu ...";
            }
        } else {
            return "Code does not exist";
        }
    }
}
