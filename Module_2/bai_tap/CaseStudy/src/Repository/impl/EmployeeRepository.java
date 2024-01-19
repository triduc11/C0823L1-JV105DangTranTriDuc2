package Repository.impl;

import Model.Employee;
import Repository.IEmployeeRepository;
import Utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EmployeeRepository implements IEmployeeRepository<Employee> {


    private final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\CaseStudy\\src\\Data\\EmployeeFile.csv";


    @Override
    public void add(Employee employees) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employees.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);

    }

    public void convertToFile(ArrayList<Employee> employees) {
        List<String> stringList = new ArrayList<>();
        for (Employee line : employees) {
            stringList.add(line.getInfor());
            FileIO.WriteToFile(filePath, stringList, false);
        }
    }

    @Override
    public ArrayList<Employee> display() {
        ArrayList<Employee> employees = new ArrayList<>();
        List<String> stringList = FileIO.ReadFromFile(filePath);
        for (String line : stringList) {
            String[] fields = line.split(",");
            String employeeCode = fields[0];
            String fullName = fields[1];
            String dateOfBirth = fields[2];
            String gender = fields[3];
            String idNumber = fields[4];
            String phoneNumber = fields[5];
            String email = fields[6];
            Employee.Qualification qualification = Employee.Qualification.valueOf(fields[7]);
            Employee.Position position = Employee.Position.valueOf(fields[8]);
            double salary = Double.parseDouble(fields[9]);
            Employee employees1 = new Employee(employeeCode, fullName, dateOfBirth, gender, idNumber, phoneNumber, email, qualification, position, salary);
            employees.add(employees1);
        }
        return employees;
    }

    @Override
    public Employee update(Employee employee) {
        ArrayList<Employee> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(employee)) {
                list.set(i, employee);
                break;
            }
        }
        convertToFile(list);
        return employee;
    }

    @Override
    public void delete(String id) {
        ArrayList<Employee> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmployeeCode().equals(id)) {
                list.remove(i);
                break;
            }
        }
        convertToFile(list);
    }

    @Override
    public Employee findById(String id) {
        ArrayList<Employee> list = display();
        for (Employee employee : list) {
            if (Objects.equals(employee.getEmployeeCode(), id)) {
                return employee;
            }
        }
        return null;
    }
}
