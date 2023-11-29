package bai_3_xay_dung_lop_fan.Bai3;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan((byte) 3, true, 10, "YELLOW");
        Fan fan2 = new Fan((byte) 2, false, 5, "BLUE");
        Fan fan3 = new Fan();
        fan1.display();
        fan2.display();
        fan3.display();
    }
}
