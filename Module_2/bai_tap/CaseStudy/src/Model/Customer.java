package Model;

import java.util.Objects;

public class Customer extends Person {
    private String customerCode;
    private CustomerType type;
    private String address;
    public Customer(){}


    public Customer(String customerCode, String fullName, String dateOfBirth, String gender, String idNumber, String phoneNumber, String email, CustomerType type, String address) {
        super(fullName, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.customerCode = customerCode;
        this.type = type;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerCode, customer.customerCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerCode);
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public CustomerType getType() {
        return type;
    }

    public void setType(CustomerType type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "type=" + type +
                ", address='" + address + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getInfor() {
        return customerCode + ","
                + fullName + ","
                + dateOfBirth + ","
                + gender + ","
                + idNumber + ","
                + phoneNumber + ","
                + email + ","
                + type + ","
                + address;
    }
}
