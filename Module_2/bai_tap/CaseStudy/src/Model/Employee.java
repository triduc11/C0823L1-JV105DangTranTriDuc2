package Model;

// Lớp Employee để lưu trữ thông tin về nhân viên

import java.util.Objects;

public class Employee extends Person {
    public enum Position {
        LE_TAN,
        PHUC_VU,
        CHUYEN_VIEN,
        GIAM_SAT,
        QUAN_LY,
        GIAM_DOC
    }
    public enum Qualification {
        TRUNG_CAP,
        CAO_DANG,
        DAI_HOC,
        SAU_DAI_HOC
    }
    private String employeeCode;
    private Qualification qualification;
    private Position position;
    private double salary;
    public Employee(){}

    public Employee(String employeeCode, String fullName, String dateOfBirth, String gender, String idNumber, String phoneNumber, String email, Qualification qualification, Position position, double salary) {
        super(fullName, dateOfBirth, gender, idNumber, phoneNumber, email);
        this.employeeCode = employeeCode;
        this.qualification = qualification;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "qualification=" + qualification +
                ", position=" + position +
                ", salary=" + salary +
                ", employeeCode='" + employeeCode + '\'' +
                ", fullName='" + fullName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(employeeCode, employee.employeeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeCode);
    }

    public String getInfor() {
        return employeeCode + ","
                + fullName + ","
                + dateOfBirth + ","
                + gender + ","
                + idNumber + ","
                + phoneNumber + ","
                + email + ","
                + qualification + ","
                + position + ","
                + salary;
    }

}

