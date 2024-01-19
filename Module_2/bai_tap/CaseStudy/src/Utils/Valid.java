package Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
    static Scanner scanner = new Scanner(System.in);

    public static String validEmployeeCode() {
        String regex = "NV-[0-9]{4}";
        do {
            System.out.println("-Enter employeeCode:");
            String employeeCode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(employeeCode);
            if (matcher.matches()) {
                System.out.println("->EmployeeCode is Valid.");
                return employeeCode;
            } else {
                System.out.println("->Employee code is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validName() {
        String regex = "^[A-Z][a-z]*(\\s[A-Z][a-z]*)*$";
        do {
            System.out.println("-Add new fullName");
            String fullName = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(fullName);
            if (matcher.matches()) {
                System.out.println("->EmployeeName is Valid.");
                return fullName;
            } else {
                System.out.println("->EmployeeName is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validDateOfBirth() {
        String regex = "^\\d{2}/\\d{2}/\\d{4}$";
        do {
            System.out.print("-Add new dateOfBirth (dd/MM/yyyy): ");
            String dateOfBirth = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(dateOfBirth);

            if (matcher.matches()) {
                LocalDate ngaySinhDate = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                LocalDate today = LocalDate.now();
                // Tính tuổi
                int age = today.getYear() - ngaySinhDate.getYear();
                if (today.getMonthValue() < ngaySinhDate.getMonthValue() ||
                        (today.getMonthValue() == ngaySinhDate.getMonthValue() && today.getDayOfMonth() < ngaySinhDate.getDayOfMonth())) {
                    age--;
                }
                if (age >= 18) {
                    System.out.println("->DateOfBirth is Valid.");
                    return dateOfBirth;
                } else {
                    System.out.println("->DateOfBirth is Invalid. Please re-enter !");
                }
            } else {
                System.out.println("->DateOfBirth is Invalid. Please re-enter in dd/MM/yyyy format !");
            }
        } while (true);
    }

    public static String validIdNumber() {
        String regex = "^\\d{9}$|^\\d{12}$";
        do {
            System.out.println("-Add new idNumber");
            String IdNumber = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(IdNumber);
            if (matcher.matches()) {
                System.out.println("->idNumber is Valid.");
                return IdNumber;
            } else {
                System.out.println("->idNumber is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validPhoneNumber() {
        String regex = "^0\\d{9}$";
        do {
            System.out.println("-Add new phoneNumber");
            String phoneNumber = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.matches()) {
                System.out.println("->PhoneNumber is Valid.");
                return phoneNumber;
            } else {
                System.out.println("->PhoneNumber is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static Double validSalary() {
        do {
            System.out.println("-Add new salary");
            double salary = Double.parseDouble(scanner.nextLine());
            if (salary > 0) {
                System.out.println("->Salary is Valid.");
                return salary;
            } else {
                System.out.println("->Salary is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validCustomerCode() {
        String regex = "KH-[0-9]{4}";
        do {
            System.out.println("-Enter customerCode:");
            String customerCode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(customerCode);
            if (matcher.matches()) {
                System.out.println("->CustomerCode is Valid.");
                return customerCode;
            } else {
                System.out.println("->CustomerCode code is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validServiceCodeVilla() {
        String regex = "SVVL-[0-9]{4}";
        do {
            System.out.println("-Enter ServiceCode:");
            String ServiceCode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ServiceCode);
            if (matcher.matches()) {
                System.out.println("->ServiceCode is Valid.");
                return ServiceCode;
            } else {
                System.out.println("->ServiceCode  is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validServiceCodeHouse() {
        String regex = "SVHO-[0-9]{4}";
        do {
            System.out.println("-Enter ServiceCode:");
            String ServiceCode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ServiceCode);
            if (matcher.matches()) {
                System.out.println("->ServiceCode is Valid.");
                return ServiceCode;
            } else {
                System.out.println("->ServiceCode  is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static String validServiceCodeRoom() {
        String regex = "SVRO-[0-9]{4}";
        do {
            System.out.println("-Enter ServiceCode:");
            String ServiceCode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(ServiceCode);
            if (matcher.matches()) {
                System.out.println("->ServiceCode is Valid.");
                return ServiceCode;
            } else {
                System.out.println("->ServiceCode  is Invalid. Please re-enter !");
            }
        } while (true);
    }


    public static Double validRentCost() {
        do {
            System.out.println("-Add new Rent Cost");
            double RentCost = Double.parseDouble(scanner.nextLine());
            if (RentCost > 0) {
                System.out.println("->RentCost is Valid.");
                return RentCost;
            } else {
                System.out.println("->RentCost is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static Integer validMaxCapacity() {
        do {
            System.out.println("-Add new Capacity");
            int Capacity = Integer.parseInt(scanner.nextLine());
            if (Capacity > 0 && Capacity < 20) {
                System.out.println("->Capacity is Valid.");
                return Capacity;
            } else {
                System.out.println("->Capacity is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static Integer validNumberOfFloors() {
        do {
            System.out.println("-Add new Number Of Floors");
            int floors = Integer.parseInt(scanner.nextLine());
            if (floors > 0) {
                System.out.println("->floors is Valid.");
                return floors;
            } else {
                System.out.println("->floors is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static Double validArea() {
        do {
            System.out.println("-Add new area");
            double area = Double.parseDouble(scanner.nextLine());
            if (area > 30) {
                System.out.println("->area is Valid.");
                return area;
            } else {
                System.out.println("->area is Invalid. Please re-enter !");
            }
        } while (true);
    }

    public static List<String> freeServices() {
        List<String> freeServiceList = new ArrayList<>();
        int choice ;
        do {
            System.out.println("-How many option:");
            choice = Integer.parseInt(scanner.nextLine());
            if (choice==0) return freeServiceList ;
            for (int i = 0; i < choice; i++) {
                freeServiceList.add(scanner.nextLine());
            }
        } while (choice < 0);
        return freeServiceList;
    }
}
