package utils;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Valid {
    static Scanner scanner=new Scanner(System.in);
    public static String validCode() {
        String regex = "BN-[0-9]{4}";
        do {
            System.out.println("-Enter Code:");
            String customerCode = scanner.nextLine();
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(customerCode);
            if (matcher.matches()) {
                System.out.println("->Code is Valid.");
                return customerCode;
            } else {
                System.out.println("->Code code is Invalid. Please re-enter !");
            }
        } while (true);
    }
}
