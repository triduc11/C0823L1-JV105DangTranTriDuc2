package bai_1_Access_modifier;

public class Circle {
    public static final double PI=3.14 ;
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(int radius){
        return (radius*radius*PI) ;
    }

}
