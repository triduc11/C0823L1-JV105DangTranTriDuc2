package bai_1_hien_thi_loi_chao;

import java.util.Scanner;

public class bai_1 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập tên của bạn");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Hello" + name);
    }
}
