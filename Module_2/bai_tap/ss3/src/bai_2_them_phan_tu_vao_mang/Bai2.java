package bai_2_them_phan_tu_vao_mang;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số lượng phần từ trong mảng");
        Scanner scanner1 = new Scanner(System.in);
        int n = Integer.parseInt(scanner1.nextLine());
        System.out.println("Hãy nhập số bạn muốn chèn của bạn");
        int number = Integer.parseInt(scanner1.nextLine());
        System.out.println("Hãy nhập index bạn muốn chèn của bạn");
        int index = Integer.parseInt(scanner1.nextLine());
        int[] a = new int[n];
        int[] b = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.println("Hãy nhập mang tai vi tri thu " + i);
            a[i] = Integer.parseInt(scanner1.nextLine());
        }
        int count = 0;
        for (int i = 0; i < b.length; i++) {
            if (i == index) {
                b[index] = number;
            } else {
                b[i] = a[count];
                count++;
            }
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
}
