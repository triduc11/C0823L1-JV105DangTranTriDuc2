package View;

import Controller.*;
import Model.*;
import Utils.Valid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class FuramaView {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean flag = true;
        do {
            System.out.println("Main Menu:");
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking Management");
            System.out.println("5. Promotion Management");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayEmployeeManagementMenu();
                    break;
                case 2:
                    displayCustomerManagementMenu();
                    break;
                case 3:
                    displayFacilityManagementMenu();
                    break;
                case 4:
                    displayBookingManagementMenu();
                    break;
                case 5:
                    displayPromotionManagementMenu();
                    break;
                case 6:
                    System.out.println("Exiting the program...");
                    flag = false;
            }
        } while (flag);
        scanner.close();
    }

    public static void displayEmployeeManagementMenu() {
        EmployeeController employeeController = new EmployeeController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Employee Management Menu:");
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return to main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Displaying list of employees");
                    List<Employee> employees = employeeController.findAll();
                    displayEmployee(employees);
                    break;
                case 2:
                    System.out.println("Adding a new employee");
                    Employee addEmployee = inputDataEmployee();
                    employeeController.add(addEmployee);
                    break;
                case 3:
                    System.out.println("Editing an employee");
                    employeeController.update(Valid.validEmployeeCode());
                    break;
                case 4:
                    System.out.println("Returning to the main menu");
                    displayMainMenu();
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }

    public static Employee inputDataEmployee() {
        Scanner scanner = new Scanner(System.in);
        Employee addEmployee = new Employee();
//        System.out.println("-Enter employeeCode:");
        addEmployee.setEmployeeCode(Valid.validEmployeeCode());
//        System.out.println("-Add new fullName");
        addEmployee.setFullName(Valid.validName());
//        System.out.println("-Add new dateOfBirth");
        addEmployee.setDateOfBirth(Valid.validDateOfBirth());
        System.out.println("-Add new gender");
        addEmployee.setGender(scanner.nextLine());
//        System.out.println("-Add new idNumber");
        addEmployee.setIdNumber(Valid.validIdNumber());
//        System.out.println("-Add new phoneNumber");
        addEmployee.setPhoneNumber(Valid.validPhoneNumber());
        System.out.println("-Add new email");
        addEmployee.setEmail(scanner.nextLine());
        System.out.println("-Add new qualification");
        addEmployee.setQualification(Employee.Qualification.valueOf(scanner.nextLine()));
        System.out.println("-Add new position");
        addEmployee.setPosition(Employee.Position.valueOf(scanner.nextLine()));
//        System.out.println("-Add new salary");
        addEmployee.setSalary(Valid.validSalary());
        return addEmployee;
    }

    public static void displayEmployee(List<Employee> employees) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee != null) {
                System.out.println(i + 1 + "." + employees);
            } else {
                break;
            }
        }
    }


    public static void displayCustomerManagementMenu() {
        CustomerController customerController = new CustomerController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Customer Management Menu:");
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customer");
            System.out.println("3. Edit customer");
            System.out.println("4. Search by name");
            System.out.println("5. Delete name");
            System.out.println("6. Return to main menu");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Displaying list of customers");
                    List<Customer> customers = customerController.findAll();
                    displayCustomer(customers);
                    break;
                case 2:
                    System.out.println("Adding a new customer");
                    Customer customer = inputDataCustomer();
                    customerController.add(customer);
                    break;
                case 3:
                    System.out.println("Editing a customer");
                    customerController.update(Valid.validCustomerCode());
                    break;
                case 4:
                    System.out.println("Searching a name");
                    System.out.println("Enter findName");
                    String searchName = scanner.nextLine();
                    List<Customer> searchList = customerController.searchName(searchName);
                    if (searchList.isEmpty()) {
                        System.out.println("Not Found");
                    }
                    displayCustomer(searchList);
                    break;
                case 5:
                    System.out.println("Deleting a name");
                    customerController.delete(Valid.validCustomerCode());
                    break;
                case 6:
                    System.out.println("Returning to the main menu");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);
        scanner.close();
    }

    public static Customer inputDataCustomer() {
        Scanner scanner = new Scanner(System.in);
        Customer addCustomer = new Customer();
//        System.out.println("-Enter customerCode:");
        addCustomer.setCustomerCode(Valid.validCustomerCode());
//        System.out.println("-Add new fullName");
        addCustomer.setFullName(Valid.validName());
//        System.out.println("-Add new dateOfBirth");
        addCustomer.setDateOfBirth(Valid.validDateOfBirth());
        System.out.println("-Add new gender");
        addCustomer.setGender(scanner.nextLine());
//        System.out.println("-Add new idNumber");
        addCustomer.setIdNumber(Valid.validIdNumber());
//        System.out.println("-Add new phoneNumber");
        addCustomer.setPhoneNumber(Valid.validPhoneNumber());
        System.out.println("-Add new email");
        addCustomer.setEmail(scanner.nextLine());
        System.out.println("-Add new type");
        addCustomer.setType(CustomerType.valueOf(scanner.nextLine()));
        System.out.println("-Add new address");
        addCustomer.setAddress(scanner.nextLine());
        return addCustomer;
    }

    public static void displayCustomer(List<Customer> customers) {
        for (int i = 0; i < customers.size(); i++) {
            Customer customer = customers.get(i);
            if (customer != null) {
                System.out.println(i + 1 + "." + customer);
            } else {
                break;
            }
        }
    }

    public static void displayFacilityManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        FacilityController facilityController = new FacilityController();
        int choice;
        do {
            System.out.println("Facility Management Menu");
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Edit facility");
            System.out.println("4. Display list facility maintenance");
            System.out.println("5. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Displaying list of facility");
                    List<Facility> facilityList = facilityController.displayFacilities();
                    displayFacilities(facilityList);
                    break;
                case 2:
                    System.out.println("Adding a new facility");
                    displayListAddType();
                    break;
                case 3:
                    System.out.println("Editing a facility");
                    displayListUpdateType();
                    break;
                case 4:
                    System.out.println("Displaying list of MaintenanceFacility");
                    break;
                case 5:
                    System.out.println("Returning to the main menu");
                    displayMainMenu();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void displayFacilities(List<Facility> facilityList) {
        for (int i = 0; i < facilityList.size(); i++) {
            Facility facility = facilityList.get(i);
            if (facility != null) {
                System.out.println(i + 1 + "." + facility);
            } else {
                break;
            }
        }
    }

    public static void displayListAddType() {
        FacilityController facilityController = new FacilityController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Add new Villa");
            System.out.println("2.Add new House");
            System.out.println("3.Add new Room");
            System.out.println("4.Return back");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Adding a new villa");
                    facilityController.add(inputDataVilla());
                    break;
                case 2:
                    System.out.println("Adding a new house");
                    facilityController.add(inputDataHouse());
                    break;
                case 3:
                    System.out.println("Adding a new room");
                    facilityController.add(inputDataRoom());
                    break;
                case 4:
                    System.out.println("Returning to the  FacilityMenu");
                    displayFacilityManagementMenu();
                    break;
                default:
                    break;
            }
        } while (choice != 4);
    }

    public static void displayListUpdateType() {
        FacilityController facilityController = new FacilityController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("1.Update Villa");
            System.out.println("2.Update House");
            System.out.println("3.Update Room");
            System.out.println("4.Return back");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("-Updating a villa");
                    facilityController.update(Valid.validServiceCodeVilla());
                    break;
                case 2:
                    System.out.println("-Updating a house");
                    facilityController.update(Valid.validServiceCodeHouse());
                    break;
                case 3:
                    System.out.println("-Updating a room");
                    facilityController.update(Valid.validServiceCodeRoom());
                    break;
                case 4:
                    System.out.println("Returning to the FacilityMenu");
                    displayFacilityManagementMenu();
                    break;
                default:
                    break;
            }
        } while (choice != 4);
    }

    public static Villa inputDataVilla() {
        Scanner scanner = new Scanner(System.in);
        Villa newVilla = new Villa();
//        System.out.println("-Add new serviceCode ");
        newVilla.setServiceCode(Valid.validServiceCodeVilla());
//        System.out.println("-Add new serviceName");
        newVilla.setServiceName(Valid.validName());
        System.out.println("-Add new area");
        newVilla.setArea(Double.parseDouble(scanner.nextLine()));
//        System.out.println("-Add new rentalCost");
        newVilla.setRentalCost(Valid.validRentCost());
//        System.out.println("-Add new maxCapacity");
        newVilla.setMaxCapacity(Valid.validMaxCapacity());
        System.out.println("-Add new rentalType");
        newVilla.setRentalType(scanner.nextLine());
        System.out.println("-Add new maintenanceThreshold");
        newVilla.setMaintenanceThreshold(Integer.parseInt(scanner.nextLine()));
        System.out.println("-Add new roomStandard");
        newVilla.setRoomStandard(scanner.nextLine());
//        System.out.println("-Add new poolArea");
        newVilla.setPoolArea(Valid.validArea());
//        System.out.println("-Add new numberOfFloors");
        newVilla.setNumberOfFloors(Valid.validNumberOfFloors());
        return newVilla;
    }

    public static House inputDataHouse() {
        Scanner scanner = new Scanner(System.in);
        House newHouse = new House();
//        System.out.println("-Add new serviceCode ");
        newHouse.setServiceCode(Valid.validServiceCodeHouse());
//        System.out.println("-Add new serviceName");
        newHouse.setServiceName(Valid.validName());
        System.out.println("-Add new area");
        newHouse.setArea(Double.parseDouble(scanner.nextLine()));
//        System.out.println("-Add new rentalCost");
        newHouse.setRentalCost(Valid.validRentCost());
//        System.out.println("-Add new maxCapacity");
        newHouse.setMaxCapacity(Valid.validMaxCapacity());
        System.out.println("-Add new rentalType");
        newHouse.setRentalType(scanner.nextLine());
        System.out.println("-Add new maintenanceThreshold");
        newHouse.setMaintenanceThreshold((Integer.parseInt(scanner.nextLine())));
        System.out.println("-Add new roomStandard");
        newHouse.setRoomStandard(scanner.nextLine());
//        System.out.println("-Add new numberOfFloors");
        newHouse.setNumberOfFloors(Valid.validNumberOfFloors());
        return newHouse;
    }

    public static Room inputDataRoom() {
        Scanner scanner = new Scanner(System.in);
        Room newRoom = new Room();
//        System.out.println("-Add new serviceCode ");
        newRoom.setServiceCode(Valid.validServiceCodeRoom());
//        System.out.println("-Add new serviceName");
        newRoom.setServiceName(Valid.validName());
        System.out.println("-Add new area");
        newRoom.setArea(Double.parseDouble(scanner.nextLine()));
//        System.out.println("-Add new rentalCost");
        newRoom.setRentalCost(Valid.validRentCost());
//        System.out.println("-Add new maxCapacity");
        newRoom.setMaxCapacity(Valid.validMaxCapacity());
        System.out.println("-Add new rentalType");
        newRoom.setRentalType(scanner.nextLine());
        System.out.println("-Add new maintenanceThreshold");
        newRoom.setMaintenanceThreshold(Integer.parseInt(scanner.nextLine()));
//        System.out.println("-Add new freeServices");
        newRoom.setFreeServices(Valid.freeServices());
        return newRoom;
    }

    public static void displayBookingManagementMenu() {
        BookingController bookingController = new BookingController();
        CustomerController customerController = new CustomerController();
        FacilityController facilityController = new FacilityController();
        ContractController contractController = new ContractController();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Booking Management Menu");
            System.out.println("1. Add a new booking");
            System.out.println("2. Display list of booking");
            System.out.println("3. Create a new contracts");
            System.out.println("4. Display list of contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Adding a new booking");
                    System.out.println("----List of Customers----");
                    List<Customer> customers = customerController.findAll();
                    displayCustomer(customers);
                    System.out.println("----List of Facility----");
                    List<Facility> facilityList = facilityController.displayFacilities();
                    displayFacilities(facilityList);
                    bookingController.add(inputDataBooking());
                    break;
                case 2:
                    System.out.println("Displaying list of booking");
                    TreeSet<Booking> bookingList = bookingController.findAll();
                    displayListBooking(bookingList);
                    break;
                case 3:
                    System.out.println("Creating a new contracts");
                    contractController.add(inputDataContract());
                    break;
                case 4:
                    System.out.println("Displaying list of contracts");
                    Queue<Contract> contractList = contractController.display();
                    displayListContract(contractList);
                    break;
                case 5:
                    System.out.println("Editing contracts");
                    System.out.println("-Enter bookingID:");
                    contractController.update(scanner.nextLine());
                    break;
                case 6:
                    System.out.println("Returning to the main menu");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);
    }

    public static Booking inputDataBooking() {
        Scanner scanner = new Scanner(System.in);
        Booking newBooking = new Booking();
        System.out.println("-Enter new BookingID");
        newBooking.setBookingId(scanner.nextLine());
        System.out.println("-Enter new bookingDate");
        String stringDate = scanner.nextLine();
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        } catch (ParseException e) {
            System.out.println("Invalid Date");
        }
        newBooking.setBookingDate(date);
        System.out.println("-Enter new StartDate");
        String stringStartDate = scanner.nextLine();
        Date startDate = null;
        try {
            startDate = new SimpleDateFormat("dd/MM/yyyy").parse(stringStartDate);
        } catch (ParseException e) {
            System.out.println("Invalid Date");
        }
        newBooking.setStartDate(startDate);
        System.out.println("-Enter new EndDate");
        String stringEndDate = scanner.nextLine();
        Date endDate = null;
        try {
            endDate = new SimpleDateFormat("dd/MM/yyyy").parse(stringEndDate);
        } catch (ParseException e) {
            System.out.println("Invalid Date");
        }
        newBooking.setEndDate(endDate);
        System.out.println("-Enter new CustomerID");
        newBooking.setCustomerId(scanner.nextLine());
        System.out.println("-Enter new ServiceID");
        newBooking.setServiceId(scanner.nextLine());
        return newBooking;
    }

    public static Contract inputDataContract() {
        Scanner scanner = new Scanner(System.in);
        Contract newcontract = new Contract();
        System.out.println("-Enter new contractNumber");
        newcontract.setContractNumber(scanner.nextLine());
        System.out.println("-Enter new bookingID");
        newcontract.setBookingId(scanner.nextLine());
        System.out.println("-Enter new depositAmount");
        newcontract.setDepositAmount(Double.parseDouble(scanner.nextLine()));
        System.out.println("-Enter new totalAmount");
        newcontract.setTotalAmount(Double.parseDouble(scanner.nextLine()));
        System.out.println("-Enter new contractDate");
        String stringDate = scanner.nextLine();
        Date date = null;
        try {
            date = new SimpleDateFormat("dd/MM/yyyy").parse(stringDate);
        } catch (ParseException e) {
            System.out.println("Invalid Date");
        }
        newcontract.setContractDate(date);
        return newcontract;
    }

    public static void displayListBooking(TreeSet<Booking> bookingList) {
        int i = 1;
        for (Booking booking : bookingList) {
            if (booking != null) {
                System.out.println(i + booking.toString());
                i++;
            } else {
                break;
            }
        }
    }

    public static void displayListContract(Queue<Contract> contractList) {
        int i = 1;
        for (Contract contract : contractList) {
            if (contract != null) {
                System.out.println(i + contract.toString());
                i++;
            } else {
                break;
            }
        }
    }

    public static void displayPromotionManagementMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Promotion  Management Menu");
            System.out.println("1. Display list customers use service");
            System.out.println("2. Display list customers get voucher");
            System.out.println("3. Return main menu");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Displaying list customers use service");
                    break;
                case 2:
                    System.out.println("Displaying list customers get voucher");
                    break;
                case 3:
                    System.out.println("Returning main menu");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }
}

