package bai_giang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.println("Enter height: ");
        double height = Double.parseDouble(scanner.nextLine());
        HCN hcn = new HCN(width, height);
        System.out.println("Your HCN " + hcn.display());
        System.out.println("Perimeter of the Rectangle: " + hcn.getPerimeter());
        System.out.println("Area of the Rectangle: " + hcn.getArea());
    }
}

