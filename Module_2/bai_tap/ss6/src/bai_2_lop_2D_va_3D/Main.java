package bai_2_lop_2D_va_3D;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(4, 5);
        System.out.println(point2D);
        Point3D point3D = new Point3D();
        point3D.setXYZ(4, 5, 6);
        System.out.println(point3D);
    }
}
