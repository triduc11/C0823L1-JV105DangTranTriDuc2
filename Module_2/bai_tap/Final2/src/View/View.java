package View;

import Controller.TaiKhoanTKController;
import Controller.TaiKhoanTTController;
import Model.TaiKhoanTK;
import Model.TaiKhoanTT;
import Utils.Valid;

import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        mainMenu();
    }

    public static void mainMenu() {
        TaiKhoanTTController taiKhoanTTController = new TaiKhoanTTController();
        TaiKhoanTKController taiKhoanTKController = new TaiKhoanTKController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("----Main Menu----");
            System.out.println("1. Add");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Search");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    menuAdd();
                    break;
                case 2:
                    menDelete();
                    break;
                case 3:
                    System.out.println("Danh sanh tai khoan Tiet Kiem");
                    List<TaiKhoanTK> taiKhoanTKS = taiKhoanTKController.findAll();
                    displayTK(taiKhoanTKS);
                    System.out.println("Danh sanh tai khoan Thanh Toan");
                    List<TaiKhoanTT> taiKhoanTTS = taiKhoanTTController.findAll();
                    displayTT(taiKhoanTTS);
                    break;
                case 4:
                    menuSearch();
                    break;
                case 5:
                    System.out.println("Exiting the program...");
                    flag = false;
            }
        } while (flag);
        scanner.close();
    }

    public static void menuAdd() {
        TaiKhoanTTController taiKhoanTTController = new TaiKhoanTTController();
        TaiKhoanTKController taiKhoanTKController = new TaiKhoanTKController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----Add Menu----");
            System.out.println("1. Tiet Kiem");
            System.out.println("2. Thanh Toan");
            System.out.println("3. Return to main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Adding a new Tiet Kiem");
                    TaiKhoanTK taiKhoanTK = inputDataTK();
                    taiKhoanTKController.add(taiKhoanTK);
                    break;
                case 2:
                    System.out.println("Adding a new Thanh Toan");
                    TaiKhoanTT taiKhoanTT = inputDataTT();
                    taiKhoanTTController.add(taiKhoanTT);
                    break;
                case 3:
                    System.out.println("Returning to the main menu");
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
        scanner.close();
    }

    public static TaiKhoanTK inputDataTK() {
        Scanner scanner = new Scanner(System.in);
        TaiKhoanTK addTaiKhoanTK = new TaiKhoanTK();
        System.out.println("-Them id");
        addTaiKhoanTK.setId(scanner.nextLine());
        System.out.println("-Them code");
        addTaiKhoanTK.setCode(scanner.nextLine());
        System.out.println("-Them ten");
        addTaiKhoanTK.setName(scanner.nextLine());
        System.out.println("-Them date");
        addTaiKhoanTK.setDate(scanner.nextLine());
        System.out.println("-Them tien");
        addTaiKhoanTK.setTien(Valid.validNumber());
        System.out.println("-Them dateTK");
        addTaiKhoanTK.setDateTK(scanner.nextLine());
        System.out.println("-Them laiSuat");
        addTaiKhoanTK.setLaiSuat(scanner.nextLine());
        System.out.println("-Them Ky Han");
        addTaiKhoanTK.setKiHan(scanner.nextLine());
        return addTaiKhoanTK;
    }

    public static TaiKhoanTT inputDataTT() {
        Scanner scanner = new Scanner(System.in);
        TaiKhoanTT addTaiKhoanTT = new TaiKhoanTT();
        System.out.println("-Them id");
        addTaiKhoanTT.setId(scanner.nextLine());
        System.out.println("-Them code");
        addTaiKhoanTT.setCode(scanner.nextLine());
        System.out.println("-Them ten");
        addTaiKhoanTT.setName(scanner.nextLine());
        System.out.println("-Them date");
        addTaiKhoanTT.setDate(scanner.nextLine());
        System.out.println("-Them so the");
        addTaiKhoanTT.setSoThe(Valid.validNumber());
        System.out.println("Them tien tai khoan");
        addTaiKhoanTT.setTienTK(Valid.validNumber());
        return addTaiKhoanTT;
    }

    public static void menDelete() {
        TaiKhoanTTController taiKhoanTTController = new TaiKhoanTTController();
        TaiKhoanTKController taiKhoanTKController = new TaiKhoanTKController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----Delete Menu----");
            System.out.println("1. Tiet Kiem");
            System.out.println("2. Thanh Toan");
            System.out.println("3. Return to main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Deleting a new Tiet Kiem");
                    System.out.println("-Ban co thuc su muon xoa tai khoan(Y/N)");
                    String option = scanner.nextLine();
                    if (Objects.equals(option, "Y")) {
                        System.out.println("Nhap code nguoi dung");
                        String idDelete = scanner.nextLine();
                        taiKhoanTKController.delete(idDelete);
                        List<TaiKhoanTK> taiKhoanTKS = taiKhoanTKController.findAll();
                        displayTK(taiKhoanTKS);
                    }else {
                        menDelete();
                    }
                    break;
                case 2:
                    System.out.println("Deleting a new Thanh Toan");
                    System.out.println("-Ban co thuc su muon xoa tai khoan(Y/N)");
                    String option1 = scanner.nextLine();
                    if (Objects.equals(option1, "Y")) {
                        System.out.println("Nhap code nguoi dung");
                        String idDelete1 = scanner.nextLine();
                        taiKhoanTTController.delete(idDelete1);
                        List<TaiKhoanTT> taiKhoanTTS = taiKhoanTTController.findAll();
                        displayTT(taiKhoanTTS);
                    }else {
                        menDelete();
                    }
                    break;
                case 3:
                    System.out.println("Returning to the main menu");
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
        scanner.close();
    }

    public static void menuSearch() {
        TaiKhoanTTController taiKhoanTTController = new TaiKhoanTTController();
        TaiKhoanTKController taiKhoanTKController = new TaiKhoanTKController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----Search Menu----");
            System.out.println("1. Tiet Kiem");
            System.out.println("2. Thanh Toan");
            System.out.println("3. Return to main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Searching a name");
                    System.out.println("Enter findName");
                    String searchName = scanner.nextLine();
                    List<TaiKhoanTK> searchList = taiKhoanTKController.searchName(searchName);
                    if (searchList.isEmpty()) {
                        System.out.println("Not Found");
                    }
                    displayTK(searchList);
                    break;
                case 2:
                    System.out.println("Searching a name");
                    System.out.println("Enter findName");
                    String searchName1 = scanner.nextLine();
                    List<TaiKhoanTT> searchList1 = taiKhoanTTController.searchName(searchName1);
                    if (searchList1.isEmpty()) {
                        System.out.println("Not Found");
                    }
                    displayTT(searchList1);
                    break;
                case 3:
                    System.out.println("Returning to the main menu");
                    mainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    public static void displayTK(List<TaiKhoanTK> taiKhoanTKS) {
        for (int i = 0; i < taiKhoanTKS.size(); i++) {
            TaiKhoanTK taiKhoanTK = taiKhoanTKS.get(i);
            if (taiKhoanTK != null) {
                System.out.println(i + 1 + "." + taiKhoanTK);
            } else {
                break;
            }
        }
    }

    public static void displayTT(List<TaiKhoanTT> taiKhoanTTS) {
        for (int i = 0; i < taiKhoanTTS.size(); i++) {
            TaiKhoanTT taiKhoanTT = taiKhoanTTS.get(i);
            if (taiKhoanTT != null) {
                System.out.println(i + 1 + "." + taiKhoanTT);
            } else {
                break;
            }
        }
    }
}
