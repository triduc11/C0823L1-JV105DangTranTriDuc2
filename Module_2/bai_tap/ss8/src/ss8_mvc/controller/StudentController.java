package ss8_mvc.controller;

import ss8_mvc.model.Student;
import ss8_mvc.service.IStudentService;
import ss8_mvc.service.impl.StudentService;

public class StudentController {
    private IStudentService studentService = new StudentService();

    public Student[] getAll() {
        return studentService.findAll();
    }
    public Student getByID(int id){
        return studentService.findById(id);
    }

    public void add(Student student) {
        studentService.add(student);
    }

    public String update(Student std) {
        Student student = studentService.findById(std.getId());
        if (student != null) {
            studentService.update(std);
            return "Chỉnh sửa thành công";
        } else {
            return "Id không tồn tại";
        }
    }

    public String delete(int id) {
        Student student = studentService.findById(id);
        if (student != null) {
            studentService.delete(id);
            return "Xoá thành công";
        } else {
            return "Id không tồn tại";
        }
    }

}
