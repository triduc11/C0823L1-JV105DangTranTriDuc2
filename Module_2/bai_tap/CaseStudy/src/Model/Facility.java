package Model;

import java.util.Objects;

public abstract class Facility {

    //Mã dịch vụ
    protected String serviceCode;
    //Tên dịch vụ
    protected String serviceName;
    //Diện tích sử dụng
    protected double area;
    //Chi phí thuê
    protected double rentalCost;
    //Số lượng người tối đa
    protected int maxCapacity;
    //Kiểu thuê
    protected String rentalType;
    protected int maintenanceThreshold;

    public Facility(String serviceCode, String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, int maintenanceThreshold) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.area = area;
        this.rentalCost = rentalCost;
        this.maxCapacity = maxCapacity;
        this.rentalType = rentalType;
        this.maintenanceThreshold = maintenanceThreshold;

    }
    public Facility(String serviceName){
        this.serviceName = serviceName;
    }

    public Facility() {
    }

    public int getMaintenanceThreshold() {
        return maintenanceThreshold;
    }

    public void setMaintenanceThreshold(int maintenanceThreshold) {
        this.maintenanceThreshold = maintenanceThreshold;
    }

    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Facility{" +
                "serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentalCost=" + rentalCost +
                ", maxCapacity=" + maxCapacity +
                ", rentalType='" + rentalType + '\'' +
                ", maintenanceThreshold=" + maintenanceThreshold +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facility facility = (Facility) o;
        return Objects.equals(serviceCode, facility.serviceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceCode);
    }
}
