package Controller;

import Model.Employee;
import Service.impl.EmployeeService;

import java.util.ArrayList;

public class EmployeeController {
    private EmployeeService employeeService = new EmployeeService();

    public ArrayList<Employee> findAll() {
        return employeeService.display();
    }

    public Employee findByID(String id) {
        return employeeService.findById(id);
    }

    public void add(Employee employee) {
        employeeService.add(employee);
    }

    public String update(String id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            employeeService.update(id);
            return "Update successfully";
        } else {
            return "employeeCode does not exist";
        }
    }

    public String delete(String id) {
        Employee employee = employeeService.findById(id);
        if (employee != null) {
            employeeService.delete(id);
            return "Delete successfully";
        } else {
            return "employeeCode does not exist";
        }
    }
}
