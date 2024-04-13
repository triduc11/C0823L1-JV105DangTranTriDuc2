package Model;

public class TaiKhoanTT extends TaiKhoan {
    private int soThe;
    private int tienTK;

    public TaiKhoanTT() {
    }

    public TaiKhoanTT(String id, String code, String name, String date, int soThe, int tienTK) {
        super(id, code, name, date);
        this.soThe = soThe;
        this.tienTK = tienTK;
    }

    public int getSoThe() {
        return soThe;
    }

    public void setSoThe(int soThe) {
        this.soThe = soThe;
    }

    public int getTienTK() {
        return tienTK;
    }

    public void setTienTK(int tienTK) {
        this.tienTK = tienTK;
    }

    @Override
    public String toString() {
        return "TaiKhoanTT{" +
                "soThe='" + soThe + '\'' +
                ", tienTK='" + tienTK + '\'' +
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
                soThe + "," +
                tienTK;
    }
}
