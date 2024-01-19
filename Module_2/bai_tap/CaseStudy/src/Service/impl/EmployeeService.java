package Service.impl;

import Model.Employee;
import Repository.impl.EmployeeRepository;
import Service.IEmployeeService;
import Utils.Valid;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeService implements IEmployeeService<Employee> {
    private final EmployeeRepository employeeRepository = new EmployeeRepository();
    static Scanner scanner = new Scanner(System.in);


    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public ArrayList<Employee> display() {
        return employeeRepository.display();
    }

    @Override
    public Employee update(String id) {
        ArrayList<Employee> list = display();
        System.out.println("1.Update fullName");
        System.out.println("2.Update dateOfBirth");
        System.out.println("3.Update gender");
        System.out.println("4.Update phoneNumber");
        System.out.println("5.Update email");
        System.out.println("6.Update qualification");
        System.out.println("7.Update position");
        System.out.println("8.Update salary");
        System.out.println("Choose option");
        for (Employee employee : list) {
            if (employee.getEmployeeCode().equals(id)) {
                int n = Integer.parseInt(scanner.nextLine());
                switch (n) {
                    case 1:
                        System.out.println("-Update fullName");
                        employee.setFullName(Valid.validName());
                        break;
                    case 2:
                        System.out.println("-Update dateOfBirth");
                        employee.setDateOfBirth(Valid.validDateOfBirth());
                        break;
                    case 3:
                        System.out.println("-Update gender");
                        employee.setGender(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("-Update phoneNumber");
                        employee.setPhoneNumber(Valid.validPhoneNumber());
                        break;
                    case 5:
                        System.out.println("-Update email");
                        employee.setEmail(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("-Update qualification");
                        employee.setQualification(Employee.Qualification.valueOf(scanner.nextLine()));
                        break;
                    case 7:
                        System.out.println("-Update position");
                        employee.setPosition(Employee.Position.valueOf(scanner.nextLine()));
                        break;
                    case 8:
                        System.out.println("-Update salary");
                        employee.setSalary(Valid.validSalary());
                        break;
                    default:
                        break;
                }
                return employeeRepository.update(employee);
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        employeeRepository.delete(id);
    }

    @Override
    public Employee findById(String id) {
        return employeeRepository.findById(id);
    }
}
