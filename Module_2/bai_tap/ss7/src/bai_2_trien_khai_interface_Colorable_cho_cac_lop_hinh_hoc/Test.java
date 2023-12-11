package bai_2_trien_khai_interface_Colorable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(4.0);
        shapes[1] = new Rectangle(4.0, 5.0);
        shapes[2] = new Square(6.0);
        for (Shape shape : shapes) {

            System.out.println("Diện tích: " + shape.getArea());

            if (shape instanceof Colorable) {
                Colorable colorableShape = (Colorable) shape;
                colorableShape.howToColor();
            }
        }
    }
}
