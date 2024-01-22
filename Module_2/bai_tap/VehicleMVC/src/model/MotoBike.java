package model;

public class MotoBike extends Vehicle {
    private double horsePower;

    public MotoBike(String licensePlate, String manufacturerName, int manufactureYear, String owner, double horsePower) {
        super(licensePlate, manufacturerName, manufactureYear, owner);
        this.horsePower = horsePower;
    }

    public MotoBike() {
    }

    public double getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(double horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String toString() {
        return "MotoBike{" +
                "horsePower=" + horsePower +
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
                + horsePower;
    }
}
