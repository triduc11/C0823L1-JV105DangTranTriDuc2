package bai_1_xoa_phan_tu_trong_mang;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số lượng phần từ trong mảng");
        Scanner scanner1 = new Scanner(System.in);
        int n = Integer.parseInt(scanner1.nextLine());
        System.out.println("Hãy nhập số bạn muốn xóa của bạn");
        int number = Integer.parseInt(scanner1.nextLine());
        int[] a = new int[n];
        int lengthB = 0;


        for (int i = 0; i < n; i++) {
            System.out.println("Hãy nhập mang tai vi tri thu " + i);
            a[i] = Integer.parseInt(scanner1.nextLine());
        }
        for (int i = 0; i < n; i++) {
            if (number != a[i]) {
                lengthB++;
            }
        }

        int[] b = new int[lengthB];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (number != a[i]) {
                b[count] = a[i];
                count++;
            }
        }
        for (int j : b) {
            System.out.println(j);
        }
    }
}
