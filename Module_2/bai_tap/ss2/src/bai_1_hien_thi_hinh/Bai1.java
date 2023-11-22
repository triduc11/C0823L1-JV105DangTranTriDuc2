package bai_1_hien_thi_hinh;

import java.util.Scanner;

public class Bai1 {
    public static void printRec() {
        int cd, cr;
        System.out.println("Hãy nhập chiều dài :");
        Scanner scanner1 = new Scanner(System.in);
        cd = Integer.parseInt(scanner1.nextLine());
        Scanner scanner2 = new Scanner(System.in);
        cr = Integer.parseInt(scanner2.nextLine());
        for (int i = 0; i < cr; i++) {
            for (int j = 0; j < cd; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void printTri1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void printTri2(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void printTri4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void printTri3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k <= n; k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void printTri () {
        int n;
        System.out.println("Hãy nhập độ dài cạnh");
        Scanner scanner1 = new Scanner(System.in);
        n = Integer.parseInt(scanner1.nextLine());
        printTri1(n);
        printTri2(n);
        printTri3(n);
        printTri4(n);
    }

    public static void printIsoTri() {
        int n;
        System.out.println("Hãy nhập độ dài cạnh");
        Scanner scanner1 = new Scanner(System.in);
        n = Integer.parseInt(scanner1.nextLine());
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int n;
        do {
            System.out.println("1.Print the rectangle \n " +
                    "2.Print the square triangle \n " +
                    "3.Print isosceles triangle \n " +
                    "4.Exit \n");
            System.out.println("Hãy nhập số bạn muốn");
            Scanner scanner1 = new Scanner(System.in);
            n = Integer.parseInt(scanner1.nextLine());
            switch (n){
                case 1:
                    printRec() ;
                    break;
                case 2:
                    printTri();
                    break ;
                case 3:
                    printIsoTri();
                    break ;
                case 4:
                    break ;
            }
        }while (n<=0 || n>=5) ;
    }
}
