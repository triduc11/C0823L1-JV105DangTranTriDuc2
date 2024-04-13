package model;

public class BenhAnThuong extends BenhAn {
    private double cost;

    public BenhAnThuong() {
    }

    public BenhAnThuong(String no, String id, String name, String inDate, String outDate, String reason, double cost) {
        super(no, id, name, inDate, outDate, reason);
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return super.toString() + "BenhAnThuong{" +
                "cost=" + cost +
                '}';
    }

    @Override
    public String toCsv() {
        return "thuong" + "," + super.toCsv() +
                ',' + cost;
    }

}
