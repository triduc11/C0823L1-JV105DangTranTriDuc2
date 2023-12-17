package ss8_mvc.reposiotry.impl;

import ss8_mvc.model.Student;
import ss8_mvc.reposiotry.IStudentRepository;

import java.util.Scanner;

public class StudentRepository implements IStudentRepository {
    public static Student[] students = new Student[10];
    static Scanner scanner = new Scanner(System.in);

    // khối static
    static {
        students[0] = new Student(1, "Chánh");
        students[1] = new Student(2, "Chánh2");
        students[2] = new Student(3, "Chánh3");
    }

    @Override
    public Student[] findAll() {
        // đọc file hoặc kết nối DB
        return students;
    }

    @Override
    public Student findById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

    @Override
    public void add(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == id) {
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
            }
        }
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getId() == student.getId()) {
                students[i].setName(student.getName());
            }
        }
    }
}
