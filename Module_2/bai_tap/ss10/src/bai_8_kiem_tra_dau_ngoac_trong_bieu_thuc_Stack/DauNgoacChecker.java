package bai_8_kiem_tra_dau_ngoac_trong_bieu_thuc_Stack;

import java.util.Scanner;
import java.util.Stack;

public class DauNgoacChecker {
    public static boolean kiemTraDauNgoac(String dauNgoac) {
        Stack<Character> stack = new Stack<>();

        for (char sym : dauNgoac.toCharArray()) {
            if (sym == '(' || sym == '[' || sym == '{') {
                stack.push(sym);
            } else if (sym == ')' || sym == ']' || sym == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if (!isMatching(left, sym)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatching(char left, char right) {
        // Kiểm tra xem left và right có khớp nhau hay không
        return (left == '(' && right == ')')
                || (left == '[' && right == ']')
                || (left == '{' && right == '}');
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        String dauNgoac = scanner.nextLine();
        boolean hopLe = kiemTraDauNgoac(dauNgoac);
        if (hopLe) {
            System.out.println("Dau ngoac hop le");
        } else {
            System.out.println("Dau ngoac khong hop le");
        }
    }
}
