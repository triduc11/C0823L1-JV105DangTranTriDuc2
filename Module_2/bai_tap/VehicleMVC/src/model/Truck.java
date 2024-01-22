package model;

public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String licensePlate, String manufacturerName, int manufactureYear, String owner, double payloadCapacity) {
        super(licensePlate, manufacturerName, manufactureYear, owner);
        this.payloadCapacity = payloadCapacity;
    }

    public Truck() {
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "payloadCapacity=" + payloadCapacity +
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
                + payloadCapacity;
    }
}
