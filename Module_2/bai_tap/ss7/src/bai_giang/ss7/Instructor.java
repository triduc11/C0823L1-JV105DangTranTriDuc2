package ss6;

public class Instructor extends Employee implements IAttendance{

    @Override
    public void getBonus() {
        System.out.println("nhận 1 triệu");
    }

    @Override
    public void doTask() {
        System.out.println("điểm danh và giảng dạy tại trung tâm");
    }

    @Override
    public void attendance() {
        System.out.println("giảng viên điểm danh trước giờ học");
    }
}
