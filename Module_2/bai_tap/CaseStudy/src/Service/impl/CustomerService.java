package Service.impl;

import Model.Customer;
import Model.CustomerType;
import Repository.impl.CustomerRepository;
import Service.ICustomerService;
import Utils.Valid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService<Customer> {
    private final CustomerRepository customerRepository = new CustomerRepository();
    Scanner scanner = new Scanner(System.in);

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public ArrayList<Customer> display() {
        return customerRepository.display();
    }

    @Override
    public Customer update(String id) {
        ArrayList<Customer> list = display();
        System.out.println("1.Update fullName");
        System.out.println("2.Update dateOfBirth");
        System.out.println("3.Update gender");
        System.out.println("4.Update phoneNumber");
        System.out.println("5.Update email");
        System.out.println("6.Update type");
        System.out.println("7.Update address");
        System.out.println("Choose option");
        for (Customer customer : list) {
            if (customer.getCustomerCode().equals(id)) {
                int n = Integer.parseInt(scanner.nextLine());
                switch (n) {
                    case 1:
                        System.out.println("Update fullName");
                        customer.setFullName(Valid.validName());
                        break;
                    case 2:
                        System.out.println("Update dateOfBirth");
                        customer.setDateOfBirth(Valid.validDateOfBirth());
                        break;
                    case 3:
                        System.out.println("Update gender");
                        customer.setGender(scanner.nextLine());
                        break;
                    case 4:
                        System.out.println("Update phoneNumber");
                        customer.setPhoneNumber(Valid.validPhoneNumber());
                        break;
                    case 5:
                        System.out.println("Update email");
                        customer.setEmail(scanner.nextLine());
                        break;
                    case 6:
                        System.out.println("Update type");
                        customer.setType(CustomerType.valueOf(scanner.nextLine()));
                        break;
                    case 7:
                        System.out.println("Update address");
                        customer.setAddress(scanner.nextLine());
                        break;
                    default:
                        break;
                }
                return customerRepository.update(customer);
            }
        }
        return null;
    }

    @Override
    public void delete(String id) {
        customerRepository.delete(id);
    }

    @Override
    public Customer findById(String id) {
        return customerRepository.findById(id);
    }
    public List<Customer> searchName (String searchName){return customerRepository.SearchName(searchName);}


}
