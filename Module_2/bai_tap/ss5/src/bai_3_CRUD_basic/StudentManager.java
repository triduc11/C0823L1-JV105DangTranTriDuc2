package bai_3_CRUD_basic;

import java.util.Scanner;

public class StudentManager {
    public static Student[] students = new Student[10];
    static Scanner scanner = new Scanner(System.in);

    static {
        students[0] = new Student(1, "DUC", 18);
        students[1] = new Student(2, "DUCK", 19);
        students[2] = new Student(3, "KYRIE", 18);
    }

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng\n" +
                    "1.Danh Sách\n" +
                    "2.Thêm Mới\n" +
                    "3.Xóa\n" +
                    "4.Chỉnh Sửa\n" +
                    "5.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Hiển thị danh sách");
                    studentManager.showList();
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    studentManager.add();
                    break;
                case 3:
                    System.out.println("Xóa");
                    studentManager.delete();
                    break;
                case 4:
                    System.out.println("Chỉnh sửa");
                    studentManager.update();
                    break;
                case 5:
                    System.out.println("Đã Thoát");
                    flag = false;
                    break;
            }
        } while (flag);
    }

    public void showList() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println((i + 1) + "." + students[i]);
            }
        }
    }

    public void add() {
        System.out.println("Nhập ID:");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        Student newStudent = new Student(id, name, age);
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = newStudent;
                break;
            }
        }
        showList();
    }

    public void delete() {
        System.out.println("Nhập ID bạn muốn xóa:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == idDelete) {
                    index = i;
                }
            }
        }
        if (index != -1) {
            for (int i = index; i < students.length - 1; i++) {
                students[i] = students[i + 1];
            }
            students[students.length - 1] = null;
        }
        showList();
    }

    public void update() {
        System.out.println("Nhập ID của học sinh bạn muốn chỉnh sửa:");
        int idDelete = Integer.parseInt(scanner.nextLine());
        int index = -1;
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                if (students[i].getId() == idDelete) {
                    index = i;
                }
            }
        }
        if (index != -1) {
            System.out.println("Chỉnh sửa tên:");
            String nameChange = scanner.nextLine();
            System.out.println("Chỉnh sửa tuổi:");
            int ageChange = Integer.parseInt(scanner.nextLine());
            students[index].setName(nameChange);
            students[index].setAge(ageChange);
            showList();
        } else {
            System.out.println("ID không hợp lệ");
        }

    }
}