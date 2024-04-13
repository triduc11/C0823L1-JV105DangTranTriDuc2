package model;

public class BenhNhanVIP extends BenhNhan {
    public enum Position {
        VIP_I,
        VIP_II,
        VIP_III,
    }

    private String date;
    private String position;


    public BenhNhanVIP() {
    }

    public BenhNhanVIP(int stt, String code, String name, String startDate, String endDate, String lyDo, String date, String position) {
        super(stt, code, name, startDate, endDate, lyDo);
        this.date = date;
        this.position = position;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public String toString() {
        return "BenhNhanVIP{" +
                "date='" + date + '\'' +
                ", position='" + position + '\'' +
                ", stt=" + stt +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    public String getInfor() {
        return stt + "," +
                code + "," +
                name + "," +
                startDate + "," +
                endDate + "," +
                lyDo + "," +
                date + "," +
                position;
    }

}
