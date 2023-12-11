package ss6;

public class Seller extends Employee implements IGame{
    @Override
    public void getBonus() {
        System.out.println("nhận 2 triệu");
    }

    @Override
    public void doTask() {
        System.out.println("Tim kiếm khách hàng là sinh viên, có thể tổ chức chơi trò chới");
    }

    @Override
    public void organizeGame() {

    }
}
