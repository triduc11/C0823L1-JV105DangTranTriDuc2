package Repository.impl;

import Model.Customer;
import Model.CustomerType;
import Model.Employee;
import Repository.ICustomerRepository;
import Utils.FileIO;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CustomerRepository implements ICustomerRepository<Customer> {

    private final String filePath = "D:\\C0823L1-JV105DangTranTriDuc\\C0823L1-JV105DangTranTriDuc2\\Module_2\\bai_tap\\CaseStudy\\src\\Data\\CustomerFile.csv";

    @Override
    public void classifyCustomer(Customer entity) {

    }

    @Override
    public void add(Customer customer) {
        List<String> stringList = new ArrayList<>();
        stringList.add(customer.getInfor());
        FileIO.WriteToFile(filePath, stringList, true);
    }

    public void convertToFile(ArrayList<Customer> customers) {
        List<String> stringList = new ArrayList<>();
        for (Customer line : customers) {
            stringList.add(line.getInfor());
        }
        FileIO.WriteToFile(filePath, stringList, false);
    }

    @Override
    public ArrayList<Customer> display() {
        ArrayList<Customer> customers = new ArrayList<>();
        List<String> stringList = FileIO.ReadFromFile(filePath);
        for (String line : stringList) {
            String[] fields = line.split(",");
            String customerCode = fields[0];
            String fullName = fields[1];
            String dateOfBirth = fields[2];
            String gender = fields[3];
            String idNumber = fields[4];
            String phoneNumber = fields[5];
            String email = fields[6];
            CustomerType customerType = CustomerType.valueOf(fields[7]);
            String address = fields[8];
            Customer customers1 = new Customer(customerCode, fullName, dateOfBirth, gender, idNumber, phoneNumber, email, customerType, address);
            customers.add(customers1);
        }
        return customers;
    }

    @Override
    public Customer update(Customer customer) {
        ArrayList<Customer> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(customer)) {
                list.set(i, customer);
                break;
            }
        }
        convertToFile(list);
        return customer;
    }

    @Override
    public void delete(String id) {
        ArrayList<Customer> list = display();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCustomerCode().equals(id)) {
                list.remove(i);
                break;
            }
        }
        convertToFile(list);
    }

    @Override
    public Customer findById(String id) {
        ArrayList<Customer> list = display();
        for (Customer customer : list) {
            if (Objects.equals(customer.getCustomerCode(), id)) {
                return customer;
            }
        }
        return null;
    }

    public List<Customer> SearchName(String searchName) {
        List<Customer> customerList = display();
        List<Customer> searchList = new ArrayList<>();
        for (Customer customer : customerList) {
            if (customer.getFullName().contains(searchName)) {
                searchList.add(customer);
            }
        }
        return searchList;
    }
}
