package bai_3_hien_thi_SNT_be_hon_100;

public class Bai3 {
    public static boolean checkSNT(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for (int i = 2; i<100; i++) {
            if (checkSNT(i)) {
                    System.out.println(i + " ");
            }
        }
    }
}
