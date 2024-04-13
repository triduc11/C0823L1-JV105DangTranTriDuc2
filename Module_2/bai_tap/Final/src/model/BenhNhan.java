package model;

import java.util.Objects;

public abstract class BenhNhan {
    protected int stt;
    protected String name;
    protected String startDate;
    protected String endDate;
    protected String lyDo;
    protected String code ;

    public BenhNhan() {
    }

    public BenhNhan(int stt,String code, String name, String startDate, String endDate, String lyDo) {
        this.stt = stt;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lyDo = lyDo;
        this.code=code;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getLyDo() {
        return lyDo;
    }

    public void setLyDo(String lyDo) {
        this.lyDo = lyDo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "BenhNhan{" +
                "stt=" + stt +
                ", name='" + name + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", lyDo='" + lyDo + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BenhNhan)) return false;
        BenhNhan benhNhan = (BenhNhan) o;
        return Objects.equals(getCode(), benhNhan.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }
    public String getInfor() {
        return stt + "," +
                code + "," +
                name + "," +
                startDate + "," +
                endDate + "," +
                lyDo ;

    }
}
