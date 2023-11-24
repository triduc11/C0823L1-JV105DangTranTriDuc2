package bai_3_gop_mang;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Hãy nhập số lượng phần từ trong mảng 1");
        Scanner scanner1 = new Scanner(System.in);
        int n = Integer.parseInt(scanner1.nextLine());
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Hãy nhập mang 1 tai vi tri thu " + i);
            a[i] = Integer.parseInt(scanner1.nextLine());
        }
        System.out.println("Hãy nhập số lượng phần từ trong mảng 2");
        int m = Integer.parseInt(scanner1.nextLine());
        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            System.out.println("Hãy nhập mang 2 tai vi tri thu " + i);
            b[i] = Integer.parseInt(scanner1.nextLine());
        }
        int[] c = new int[m + n];
        int count = -1;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }

        for (int i = 0; i <b.length; i++) {
            count++;
            c[count] = b[i];
        }

        for (int i : c) {
            System.out.println(i);
        }
    }
}
