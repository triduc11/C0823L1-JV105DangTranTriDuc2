package Model;

public class Villa extends Facility {
    //Tiêu chuẩn phòng
    private String roomStandard;
    //Diện tích hồ bơi
    private double poolArea;
    //Số tầng
    private int numberOfFloors;


    public Villa(String serviceCode, String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, int maintenanceThreshold, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCost, maxCapacity, rentalType, maintenanceThreshold);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String roomStandard, double poolArea, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }
    public Villa(){}
    public Villa(String serviceName ){
        super(serviceName);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
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
