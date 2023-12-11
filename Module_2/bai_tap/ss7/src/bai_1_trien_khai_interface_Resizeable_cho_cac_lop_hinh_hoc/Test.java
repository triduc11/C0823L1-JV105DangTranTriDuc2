package bai_1_trien_khai_interface_Resizeable_cho_cac_lop_hinh_hoc;

public class Test {
    public static void main(String[] args) {
        Circle circle= new Circle(5.0) ;
        System.out.println("Before: "+circle.getArea());
        circle.resize(50);
        System.out.println("After: "+circle.getArea());
    }
}
