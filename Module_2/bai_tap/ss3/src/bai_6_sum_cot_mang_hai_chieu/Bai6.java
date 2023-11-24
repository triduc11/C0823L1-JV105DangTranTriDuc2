package bai_6_sum_cot_mang_hai_chieu;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        Scanner scanner1 = new Scanner(System.in);
        int n = Integer.parseInt(scanner1.nextLine());
        System.out.println("Nhập m: ");
        int m = Integer.parseInt(scanner1.nextLine());
        System.out.println("Nhâp vị trí cột muốn tính tổng");
        int indexC = Integer.parseInt(scanner1.nextLine());
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Hãy nhập mang  tai vi tri thu " + i + " " + j);
                a[i][j] = Integer.parseInt(scanner1.nextLine());
            }
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (indexC == j) {
                    sum += a[i][indexC];
                }
            }
        }
        System.out.println("Tổng cột " + indexC + " là: " + sum);
    }
}
