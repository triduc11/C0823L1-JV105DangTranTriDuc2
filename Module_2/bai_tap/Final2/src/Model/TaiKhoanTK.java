package Model;

public class TaiKhoanTK extends TaiKhoan {
    private int tien;
    private String dateTK;
    private String laiSuat;
    private String kiHan;

    public TaiKhoanTK() {
    }

    public TaiKhoanTK(String id, String code, String name, String date, int tien, String dateTK, String laiSuat, String kiHan) {
        super(id, code, name, date);
        this.tien = tien;
        this.dateTK = dateTK;
        this.laiSuat = laiSuat;
        this.kiHan = kiHan;
    }

    public int getTien() {
        return tien;
    }

    public void setTien(int tien) {
        this.tien = tien;
    }

    public String getDateTK() {
        return dateTK;
    }

    public void setDateTK(String dateTK) {
        this.dateTK = dateTK;
    }

    public String getLaiSuat() {
        return laiSuat;
    }

    public void setLaiSuat(String laiSuat) {
        this.laiSuat = laiSuat;
    }

    public String getKiHan() {
        return kiHan;
    }

    public void setKiHan(String kiHan) {
        this.kiHan = kiHan;
    }

    @Override
    public String toString() {
        return "TaiKhoanTK{" +
                "tien=" + tien +
                ", dateTK='" + dateTK + '\'' +
                ", laiSuat='" + laiSuat + '\'' +
                ", kiHan='" + kiHan + '\'' +
                ", id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public String getInfor() {
        return id + "," +
                code + "," +
                name + "," +
                date + "," +
                tien + "," +
                dateTK + "," +
                laiSuat + "," +
                kiHan;
    }
}
