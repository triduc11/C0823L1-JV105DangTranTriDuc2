package model;

public class Car extends Vehicle {
    private int seatingCapacity;
    private String carType;

    public Car(String licensePlate, String manufacturerName, int manufactureYear, String owner, int seatingCapacity, String carType) {
        super(licensePlate, manufacturerName, manufactureYear, owner);
        this.seatingCapacity = seatingCapacity;
        this.carType = carType;
    }

    public Car() {
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seatingCapacity=" + seatingCapacity +
                ", carType='" + carType + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", manufactureYear=" + manufactureYear +
                ", owner='" + owner + '\'' +
                '}';
    }

    public String getInfor() {
        return licensePlate + ","
                + manufacturerName + ","
                + manufactureYear + ","
                + owner + ","
                + seatingCapacity + ","
                + carType;
    }

}
