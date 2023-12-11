package ss6;

public class Ministry extends Employee implements IAttendenceAndGame{
    @Override
    public void getBonus() {
        System.out.println("nhận 2 triệu");
    }

    @Override
    public void doTask() {
        System.out.println("điểm danh, tổ chức chơi trò chới");
    }

    @Override
    public void attendance() {
        System.out.println("giáo vụ điểm danh khi giảng viên nghỉ làm");
    }

    @Override
    public void organizeGame() {

    }
}
