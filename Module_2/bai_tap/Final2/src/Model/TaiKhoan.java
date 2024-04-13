package Model;

import java.util.Objects;

public abstract class TaiKhoan {
    protected String id;
    protected String code;
    protected String name;
    protected String date;

    public TaiKhoan() {
    }

    public TaiKhoan(String id, String code, String name, String date) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" +
                "id='" + id + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TaiKhoan)) return false;
        TaiKhoan taiKhoan = (TaiKhoan) o;
        return Objects.equals(getCode(), taiKhoan.getCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode());
    }

    public  String getInfor() {
        return id + ","
                + code + ","
                + name + ","
                + date;
    }
}
