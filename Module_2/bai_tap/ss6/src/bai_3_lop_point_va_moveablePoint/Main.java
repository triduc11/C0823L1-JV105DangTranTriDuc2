package bai_3_lop_point_va_moveablePoint;

public class Main {
    public static void main(String[] args) {
        Point point=new Point(5,9);
        System.out.println(point);
        MoveablePoint moveablePoint=new MoveablePoint(5,9,4,3);
        moveablePoint.move() ;
        moveablePoint.move() ;
        System.out.println(moveablePoint);
    }
}
