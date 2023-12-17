package ss8_mvc.service;

import ss8_mvc.model.Student;

public interface IStudentService {
    Student[] findAll();
    Student findById(int id);
    void add(Student student);
    void delete(int id);
    void update(Student std);
}
