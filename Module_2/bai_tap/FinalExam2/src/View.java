import controller.Controller;
import model.BenhAn;
import model.Factory;
import repository.Repository;
import service.Service;
import utils.Validate;
import utils.myexception.InvalidInput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class View {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository(("src/data/medical_records.csv"));
        Service service = new Service(repository);
        Controller controller = new Controller(service);
        boolean exitFlag;
        boolean returnFlag;
        do {
            exitFlag = false;
            System.out.println(" --- QUẢN LÝ BỆNH ÁN ---\n" +
                    "1.Thêm mới \n" +
                    "2.Hiển thị \n" +
                    "3.Xóa  theo Id\n" +
                    "4.Thoát");
            System.out.print("- Chọn chức năng :");
            String choose;
            do {
                choose = scanner.nextLine();
                if (choose.matches("[1234]")) {
                    break;
                } else {
                    System.out.println("Không đúng. Chọn lại !");
                }
            } while (true);
            switch (choose) {
                case "1":
                    do {
                        returnFlag = false;
                        System.out.println("--- THÊM MỚI ---");
                        System.out.println("---Chọn Loại bệnh án ---\n" +
                                "1.Thêm bệnh án Thường\n" +
                                "2.Thêm bệnh án VIP\n" +
                                "3.Thoát");
                        System.out.print("Chọn loại bệnh án: ");
                        int addType = Integer.parseInt(scanner.nextLine());
                        switch (addType) {
                            case 1:
                                System.out.println(controller.add(Factory.create("thuong", inputNormalRec().toArray(new String[0]))));
                                break;
                            case 2:
                                System.out.println(controller.add(Factory.create("vip", inputVipRec().toArray(new String[0]))));
                                break;

                            case 3:
                                returnFlag = true;
                                break;
                        }
                    } while (!returnFlag);
                    break;
                case "2":
                    System.out.println("--- HIỂN THỊ DANH SÁCH ---");
                    ArrayList<BenhAn> list = controller.getAll();
                    for (BenhAn benhAn : list) {
                        System.out.println(benhAn.toString());
                    }
                    break;
                case "3":
                    System.out.println("--- XÓA ---");
                    System.out.println("Nhập mã bệnh án:");
                    String deleteId = scanner.nextLine();
                    if (controller.get(deleteId) != null) {
                        System.out.println("Xác nhận xóa (Y/N): ");
                        String confirm = scanner.nextLine();
                        if (confirm.equals("Y")) {
                            if (controller.get(deleteId) != null)
                                System.out.println(controller.delete(deleteId));
                            System.out.println(controller.delete(deleteId));
                        } else System.out.println("Hủy xóa !");
                    } else System.out.println("Mã bệnh án không tồn tại !");
                    // code xoá
                    break;
                case "4":
                    exitFlag = true;
                    break;
            }
        } while (!exitFlag);
        System.out.println("Kết thúc chương trình ");
    }
    public static ArrayList<String> inputNormalRec() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = inputRec();
        data.addFirst("thuong");
        String cost;
        do {
            System.out.print("Nhập phí điều trị (>0):");

            cost = sc.nextLine();
            try {
                Validate.validatePositiveNumber(Double.parseDouble(cost));
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);
        data.add(cost);
//        System.out.print("Nhập phí điều trị :");
//        data.add(sc.nextLine());
        System.out.println(data);
        return data;
    }

    public static ArrayList<String> inputVipRec() {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> data = inputRec();
        data.addFirst("vip");
        String vip;
        do {
            System.out.print("Nhập Loại VIP (VIP1/VIP2/VIP3):");
            vip = sc.nextLine();
            try {
                Validate.validateVip(vip);
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);
        data.add(vip);

        String vipDate;
        do {
            System.out.print("Nhập thời hạn vip (dd/mm/YYY):");
            vipDate = sc.nextLine();
            try {
                Validate.validateDate(vipDate);
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);
        data.add(vipDate);
        return data;
    }

    public static ArrayList<String> inputRec() {
        ArrayList<String> data = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập Số thứ tự:");
        data.add(sc.nextLine());
        String recId;
        do {
            System.out.print("Nhập mã bệnh án (BA-xxxx):");
            recId = sc.nextLine();
            try {
                Validate.validateRecId(recId);
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);
        data.add(recId);
        System.out.print("Nhập tên bệnh nhân:");
        String name = sc.nextLine();
        data.add(name);
        String inDate;
        do {
            System.out.print("Nhập ngày vào viện (dd/mm/YYY):");
            inDate = sc.nextLine();
            try {
                Validate.validateDate(inDate);
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);
        data.add(inDate);
        String outDate;
        do {
            System.out.print("Nhập ngày ra viện (dd/mm/YYY):");
            outDate = sc.nextLine();
            try {
                Validate.validateDate(outDate);
                break;
            } catch (InvalidInput e) {
                System.out.println(e.getMessage());
            }
        }
        while (true);
        data.add(outDate);
        System.out.print("Nhập lý do điều trị :");
        data.add(sc.nextLine());
        return data;
    }

}