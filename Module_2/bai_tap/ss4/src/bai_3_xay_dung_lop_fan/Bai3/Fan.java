package bai_3_xay_dung_lop_fan.Bai3;


public class Fan {
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    byte speed = SLOW;
    boolean On;
    private double radius = 5;
    private String color = "BLUE";

    public Fan() {

    }

    public Fan(byte speed, boolean On, double radius, String color) {
        this.speed = speed;
        this.On = On;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String displaySpeed() {
        if (this.speed == 1) {
            return "SLOW";
        } else if (this.speed == 2) {
            return "MEDIUM";
        } else {
            return "FAST";
        }
    }


    public void display() {
        if (this.On) {
            System.out.println("Speed: " + displaySpeed() + " Color: " + color + " Radius: " + radius + " Fan is on");
        } else {
            System.out.println("Speed: " + displaySpeed() + " Color: " + color + " Radius: " + radius + " Fan is off");
        }
    }

}
