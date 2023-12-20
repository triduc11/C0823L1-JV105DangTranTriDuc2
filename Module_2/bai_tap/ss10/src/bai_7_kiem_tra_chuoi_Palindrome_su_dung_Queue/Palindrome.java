package bai_7_kiem_tra_chuoi_Palindrome_su_dung_Queue;

import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static boolean isPalindrome(String inputString) {
        Stack<Character> stack = new Stack<>();
        int length = inputString.length();
        int halfLength = length / 2;

        for (int i = 0; i < halfLength; i++) {
            stack.push(inputString.charAt(i));
        }


        int halfIndex = halfLength + (length % 2);  // Bỏ qua ký tự chính giữa nếu có
        for (int i = halfIndex; i < length; i++) {
            char currentChar = inputString.charAt(i);
            if (stack.isEmpty() || currentChar != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String inputString = scanner.nextLine();
        if (isPalindrome(inputString)) {
            System.out.println("Chuỗi là đối xứng.");
        } else {
            System.out.println("Chuỗi không đối xứng.");
        }
    }
}
