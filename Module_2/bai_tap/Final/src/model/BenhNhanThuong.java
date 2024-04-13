package model;

import java.util.Objects;

public class BenhNhanThuong extends BenhNhan {
    private double price;
    private String code ;

    public BenhNhanThuong() {
    }

    public BenhNhanThuong(int stt, String code, String name, String startDate, String endDate, String lyDo, double price) {
        super(stt,code, name, startDate, endDate, lyDo);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "BenhNhanThuong{" +
                "price=" + price +
                ", stt=" + stt +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", lyDo='" + lyDo + '\'' +
                '}';
    }

    public String getInfor() {
        return stt + "," +
                code + "," +
                name + "," +
                startDate + "," +
                endDate + "," +
                lyDo + "," +
                price ;
    }


}
