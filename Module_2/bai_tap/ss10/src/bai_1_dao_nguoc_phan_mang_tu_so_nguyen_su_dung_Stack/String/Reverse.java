package bai_1_dao_nguoc_phan_mang_tu_so_nguyen_su_dung_Stack.String;

import java.util.Scanner;

public class Reverse {
    public static String checkPalindrome(String inputString) {
        StringBuilder reversedString = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedString.append(inputString.charAt(i));
        }
        return reversedString.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        String reversedString = checkPalindrome(inputString);
        System.out.println("Chuỗi đảo ngược: " + reversedString);
    }
}
