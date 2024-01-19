package Model;

import java.util.List;

public class Room extends Facility {
    //Dịch vụ miễn phí
    private List<String> freeServices;

    public Room(String serviceCode, String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, int maintenanceThreshold, List<String> freeServices) {
        super(serviceCode, serviceName, area, rentalCost, maxCapacity, rentalType, maintenanceThreshold);
        this.freeServices = freeServices;
    }

    public Room() {
    }

    public Room(String serviceName) {
        super(serviceName);
    }

    public Room(List<String> freeServices) {
        this.freeServices = freeServices;
    }

    public List<String> getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(List<String> freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices=" + freeServices +
                ", serviceCode='" + serviceCode + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", area=" + area +
                ", rentalCost=" + rentalCost +
                ", maxCapacity=" + maxCapacity +
                ", rentalType='" + rentalType + '\'' +
                ", maintenanceThreshold=" + maintenanceThreshold +
                '}';
    }
}

