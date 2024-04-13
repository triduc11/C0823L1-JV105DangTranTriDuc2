package view;

import controller.BenhNhanVIPController;
import model.BenhNhanThuong;
import model.BenhNhanVIP;
import utils.Valid;

import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        displayMenu();
    }

    public static void displayMenu() {
//        BenhNhanThuongController benhNhanThuongController = new BenhNhanThuongController();
        BenhNhanVIPController benhNhanVIPController = new BenhNhanVIPController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayMenuAdd();
                    break;
                case 2:
                    displayMenuDelete();
                    break;
                case 3:
//                    List<BenhNhanThuong> benhNhanThuongs = benhNhanThuongController.findAll();
                    List<BenhNhanVIP> benhNhanVIPS = benhNhanVIPController.findAll();
                    System.out.println("---List thuong---");
//                    displayThuong(benhNhanThuongs);
                    System.out.println("---List VIP---");
                    displayVIP(benhNhanVIPS);
                    break;
                case 4:
                    System.out.println("Exiting the program...");
                    flag = false;
            }
        } while (flag);
        scanner.close();
    }

//    public static void displayThuong(List<BenhNhanThuong> benhNhanThuongs) {
//        for (int i = 0; i < benhNhanThuongs.size(); i++) {
//            BenhNhanThuong benhNhanThuong = benhNhanThuongs.get(i);
//            if (benhNhanThuong != null) {
//                System.out.println(i + 1 + "." + benhNhanThuong);
//            } else {
//                break;
//            }
//        }
//    }

    public static void displayVIP(List<BenhNhanVIP> benhNhanVIPS) {
        for (int i = 0; i < benhNhanVIPS.size(); i++) {
            BenhNhanVIP benhNhanVIP = benhNhanVIPS.get(i);
            if (benhNhanVIP != null) {
                System.out.println(i + 1 + "." + benhNhanVIP);
            } else {
                break;
            }
        }
    }

    public static void displayMenuAdd() {
//        BenhNhanThuongController benhNhanThuongController = new BenhNhanThuongController();
        BenhNhanVIPController benhNhanVIPController = new BenhNhanVIPController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---Add Menu---");
            System.out.println("1.Binh Thuong");
            System.out.println("2.VIP");
            System.out.println("3.Return to main menu");
            System.out.println("Enter your option");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
//                    System.out.println("Them moi benh nhan thuong");
//                    BenhNhanThuong addBenhNhanThuong = inputDataThuong();
//                    benhNhanThuongController.add(addBenhNhanThuong);
                    break;
                case 2:
                    System.out.println("Them moi benh nhan VIP");
                    BenhNhanVIP addbenhNhanVIP = inputDataVIP();
                    benhNhanVIPController.add(addbenhNhanVIP);
                    break;
                case 3:
                    System.out.println("Returning to the main menu");
                    displayMenu();
                    break;
            }

        } while (choice != 3);
        scanner.close();
    }

//    public static BenhNhanThuong inputDataThuong() {
//        Scanner scanner = new Scanner(System.in);
//        BenhNhanThuong addBenhNhanThuong = new BenhNhanThuong();
//        System.out.println("-Nhap stt");
//        addBenhNhanThuong.setStt(Integer.parseInt(scanner.nextLine()));
//        System.out.println("-Nhap code");
//        addBenhNhanThuong.setCode(scanner.nextLine());
//        System.out.println("-Nhap ten");
//        addBenhNhanThuong.setName(scanner.nextLine());
//        System.out.println("-Nhap ngay nhap vien");
//        addBenhNhanThuong.setStartDate(scanner.nextLine());
//        System.out.println("-Nhap ngay ra vien");
//        addBenhNhanThuong.setEndDate(scanner.nextLine());
//        System.out.println("-Nhap ly do nhap vien");
//        addBenhNhanThuong.setLyDo(scanner.nextLine());
//        System.out.println("-Nhap phi nam vien");
//        addBenhNhanThuong.setPrice(Double.parseDouble(scanner.nextLine()));
//        return addBenhNhanThuong;
//    }

    public static BenhNhanVIP inputDataVIP() {
        Scanner scanner = new Scanner(System.in);
        BenhNhanVIP addBenhNhanVIP = new BenhNhanVIP();
        System.out.println("-Nhap stt");
        addBenhNhanVIP.setStt(Integer.parseInt(scanner.nextLine()));
        System.out.println("-Nhap code");
        addBenhNhanVIP.setCode(scanner.nextLine());
        System.out.println("-Nhap ten");
        addBenhNhanVIP.setName(scanner.nextLine());
        System.out.println("-Nhap ngay nhap vien");
        addBenhNhanVIP.setStartDate(scanner.nextLine());
        System.out.println("-Nhap ngay ra vien");
        addBenhNhanVIP.setEndDate(scanner.nextLine());
        System.out.println("-Nhap ly do nhap vien");
        addBenhNhanVIP.setLyDo(scanner.nextLine());
        System.out.println("-Nhap thoi han VIP");
        addBenhNhanVIP.setDate(scanner.next());
        System.out.println("-Nhap loai VIP");
        addBenhNhanVIP.setPosition(scanner.next());
        return addBenhNhanVIP;
    }

    public static void displayMenuDelete() {
//        BenhNhanThuongController benhNhanThuongController = new BenhNhanThuongController();
        BenhNhanVIPController benhNhanVIPController = new BenhNhanVIPController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("---Delete Menu---");
            System.out.println("1.Binh Thuong");
            System.out.println("2.VIP");
            System.out.println("3.Return to main menu");
            System.out.println("Enter your option");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
//                    System.out.println("Xoa benh nhan thuong");
//                    benhNhanThuongController.delete(scanner.nextLine());
                    break;
                case 2:
                    System.out.println("Xoa benh nhan VIP");
                    benhNhanVIPController.delete(scanner.nextLine());
                    break;
                case 3:
                    System.out.println("Returning to the main menu");
                    displayMenu();
                    break;
            }

        } while (choice != 3);
        scanner.close();
    }
}
