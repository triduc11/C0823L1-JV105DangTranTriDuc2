package bai_2_hien_thi_day_SNT;

import java.util.Scanner;

public class Bai2 {
    public static boolean checkSNT(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printSNT(int n) {
        int count = 0;
        for (int i = 2; count < n; i++) {
            if (checkSNT(i)) {
                System.out.println(i + " ");
                count++;
            }
        }
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Hãy nhập số Số Nguyên Tố bạn muốn hiện ra: ");
        Scanner scanner1 = new Scanner(System.in);
        n = Integer.parseInt(scanner1.nextLine());
        printSNT(n);
    }
}
