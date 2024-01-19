package Controller;

import Model.Customer;
import Model.Employee;
import Service.impl.CustomerService;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private CustomerService customerService = new CustomerService();

    public ArrayList<Customer> findAll() {
        return customerService.display();
    }

    public Customer findByID(String id) {
        return customerService.findById(id);
    }

    public void add(Customer customer) {
        customerService.add(customer);
    }

    public String update(String id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            customerService.update(id);
            return "Update successfully";
        } else {
            return "employeeCode does not exist";
        }
    }

    public String delete(String id) {
        Customer customer = customerService.findById(id);
        if (customer != null) {
            customerService.delete(id);
            return "Update successfully";
        } else {
            return "employeeCode does not exist";
        }
    }

    public List<Customer> searchName(String searchName) {
        return customerService.searchName(searchName);
    }
}
