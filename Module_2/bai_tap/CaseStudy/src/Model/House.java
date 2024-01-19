package Model;

public class House extends Facility {
    //Tiêu chuẩn phòng
    private String roomStandard;
    //Số tầng
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, double area, double rentalCost, int maxCapacity, String rentalType, int maintenanceThreshold, String roomStandard, int numberOfFloors) {
        super(serviceCode, serviceName, area, rentalCost, maxCapacity, rentalType, maintenanceThreshold);
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String roomStandard, int numberOfFloors) {
        this.roomStandard = roomStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House() {
    }

    public House(String serviceName) {
        super(serviceName);
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "roomStandard='" + roomStandard + '\'' +
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
