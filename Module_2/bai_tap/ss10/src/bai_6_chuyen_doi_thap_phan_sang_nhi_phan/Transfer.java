package bai_6_chuyen_doi_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Transfer {

    public static String decimalTransferToBinary(int n) {
        Stack<Integer> stack = new Stack<>();
        while (n > 0) {
            int r = n % 2;
            stack.push(r);
            n = n / 2;
        }
        StringBuilder reversedString = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedString.append(stack.pop());
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = Integer.parseInt(scanner.nextLine());
        String binary = decimalTransferToBinary(n);
        System.out.println("Day nhi phan la: " + binary);

    }
}
