package ss8_mvc.reposiotry;

import ss8_mvc.model.Student;

public interface IStudentRepository {
    Student[] findAll();

    Student findById(int id);

    void add(Student student);

    void delete(int id);

    void update(Student student);
}
