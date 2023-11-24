package bai_4_max_mang_hai_chieu;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        System.out.println("Nhập n: ");
        Scanner scanner1 = new Scanner(System.in);
        int n = Integer.parseInt(scanner1.nextLine());
        System.out.println("Nhập m: ");
        int m = Integer.parseInt(scanner1.nextLine());
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Hãy nhập mang  tai vi tri thu " + i +" "+ j) ;
                a[i][j] = Integer.parseInt(scanner1.nextLine());
            }
        }
        int max= a[0][0] ;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(max < a[i][j]) {
                    max= a[i][j] ;
                }
            }
        }
        System.out.println("Số lớn nhất là :"+ max );
    }
}
