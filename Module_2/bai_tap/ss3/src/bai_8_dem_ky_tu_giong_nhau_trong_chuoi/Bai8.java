package bai_8_dem_ky_tu_giong_nhau_trong_chuoi;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi:");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Nhập ký tự bạn muốn kiểm tra: ");
        char s1 = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) ==  s1) {
                count++;
            }
        }
        System.out.println("Số ký tự trùng với ký tự " + s1 + " là: "+ count);
    }
}
