package model;

public class BenhAnVip extends BenhAn {
    private String vipType;
    private String vipTime;

    public BenhAnVip() {
    }

    public BenhAnVip(String no, String id, String name, String inDate, String outDate, String reason, String vipType, String vipTime) {
        super(no, id, name, inDate, outDate, reason);
        this.vipType = vipType;
        this.vipTime = vipTime;
    }

    public String getVipType() {
        return vipType;
    }

    public void setVipType(String vipType) {
        this.vipType = vipType;
    }

    public String getVipTime() {
        return vipTime;
    }

    public void setVipTime(String vipTime) {
        this.vipTime = vipTime;
    }

    @Override
    public String toString() {
        return super.toString() + "BenhAnVip{" +
                "vipType='" + vipType + '\'' +
                ", vipTime='" + vipTime + '\'' +
                '}';
    }
    @Override
    public String toCsv() {
        return "vip" + "," + super.toCsv() +
                ',' + vipType +
                ',' + vipTime;
    }
}
