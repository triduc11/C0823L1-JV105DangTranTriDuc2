package bai_1_xay_dung_lop_pt_bac_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap a:");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap b:");
        int b = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap c:");
        int c = Integer.parseInt(scanner.nextLine());
        QuadraticEquation qEquation = new QuadraticEquation(a, b, c);
        System.out.println(qEquation.display());
        qEquation.getSolveTheEquation();
    }
}
