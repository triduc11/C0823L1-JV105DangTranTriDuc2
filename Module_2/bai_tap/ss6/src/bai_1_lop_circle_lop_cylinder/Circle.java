package bai_1_lop_circle_lop_cylinder;

public class Circle {
    private final double PI=3.14 ;
    private double radius ;
    private String color ;

    public Circle() {
    }

    public Circle(double radius, String color) {
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
    public double Area (){
        return (this.radius*this.radius*PI) ;
    }

    @Override
    public String toString() {
        return "Circle{" +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                ", area=" + Area() +
                '}';
    }
}
