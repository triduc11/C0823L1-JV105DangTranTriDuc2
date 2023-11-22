package bai_2_quy_doi_tien_te;

import java.util.Scanner;

public class bai_2 {
    public static void main(String[] args) {
        double VND = 23000;
        double USA;
        System.out.println("Hãy nhập tiền đô bạn muốn quy đổi");
        Scanner scanner = new Scanner(System.in);
        USA = Double.parseDouble(scanner.nextLine());
        double result = USA * 23000;
        System.out.println("Giá tiền quy đổi là: " + result+" VNĐ");
    }
}
