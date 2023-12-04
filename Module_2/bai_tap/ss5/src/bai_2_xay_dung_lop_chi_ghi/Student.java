package bai_2_xay_dung_lop_chi_ghi;

public class Student {
    private String name="John";
    private String classes="CO2";

    public Student() {

    }

    public Student(String name, String classes) {
        this.classes = classes;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
