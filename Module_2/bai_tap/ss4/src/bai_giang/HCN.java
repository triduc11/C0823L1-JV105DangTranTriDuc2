package bai_giang;


import java.awt.*;

public class HCN {
    double width, height;

    public HCN() {
    }

    public HCN(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public String display() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }


}
