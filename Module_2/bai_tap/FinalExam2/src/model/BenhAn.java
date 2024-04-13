package model;

public class BenhAn {
    private static int incr = 1;
    private String no;
    private String id;
    private String name;

    private String inDate;
    private String outDate;
    private String reason;

    public BenhAn() {
    }

    public BenhAn(String no, String id, String name, String inDate, String outDate, String reason) {
        this.no = no;
        this.id = id;
        this.name = name;
        this.inDate = inDate;
        this.outDate = outDate;
        this.reason = reason;

    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getOutDate() {
        return outDate;
    }

    public void setOutDate(String outDate) {
        this.outDate = outDate;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "BenhAn{" +
                "no=" + no +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", inDate='" + inDate + '\'' +
                ", outDate='" + outDate + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String toCsv() {
        return  no + ','
                + id + ','
                + name + ','
                + inDate + ','
                + outDate + ','
                + reason;
    }
}
