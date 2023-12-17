package ss8_mvc.view;

import ss8_mvc.controller.StudentController;
import ss8_mvc.model.Student;

import java.util.Scanner;

public class View {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        boolean flag = true;
        do {
            System.out.println("Chọn chức năng\n" +
                    "1.Danh sách\n" +
                    "2.Thêm mới\n" +
                    "3.Xoá\n" +
                    "4.Chỉnh sửa\n" +
                    "5.Hiển thị theo ID\n" +
                    "6.Thoát");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Hiển thị danh sách");
                    Student[] students = studentController.getAll();
                    displayStudent(students);
                    break;
                case 2:
                    System.out.println("Thêm mới");
                    Student newStudent = inputDataStudent();
                    studentController.add(newStudent);
                    break;
                case 3:
                    System.out.println("Chức năng xoá");
                    System.out.println("Nhập id cần xoá");
                    int deleteId = Integer.parseInt(scanner.nextLine());
                    String deleteMessage = studentController.delete(deleteId);
                    System.out.println(deleteMessage);
                    // code xoá
                    break;
                case 4:
                    System.out.println("Chức năng chỉnh sửa");
                    Student updateStudent = inputDataStudent();
                    String updateMessage = studentController.update(updateStudent);
                    System.out.println(updateMessage);
                    // code chỉnh sửa
                    break;
                case 5:
                    System.out.println("Chức năng hiển thị theo ID");
                    System.out.println("Nhâp id cần hiển thị");
                    int showID = Integer.parseInt(scanner.nextLine());
                    Student showStudent = studentController.getByID(showID);
                    displayStudentById(showStudent);
                default:
                    flag = false;
            }
        } while (flag);
        System.out.println("Kết thúc chương trình ");
    }

    public static void displayStudent(Student[] students) {
        for (Student student : students) {
            if (student != null) {
                System.out.println(student);
            } else {
                break;
            }
        }
    }

    public static Student inputDataStudent() {
        System.out.println("nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên");
        String name = scanner.nextLine();
        Student student = new Student(id, name);
        return student;
    }

    public static void displayStudentById(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == i) {
                System.out.println(students[i]);
            } else {
                break;
            }
        }
    }
}

