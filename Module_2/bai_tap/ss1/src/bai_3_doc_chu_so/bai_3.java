package bai_3_doc_chu_so;

import java.util.Scanner;

public class bai_3 {
    public static String docDV(int n) {
        switch (n) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String docChuc1(int n) {
        switch (n) {
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    public static String docChuc(int n) {
        switch (n) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    public static String docT(int n) {
        switch (n) {
            case 1:
                return "one hundred";
            case 2:
                return "two hundred";
            case 3:
                return "three hundred";
            case 4:
                return "four hundred";
            case 5:
                return "five hundred";
            case 6:
                return "six hundred";
            case 7:
                return "seven hundred";
            case 8:
                return "eight hundred";
            case 9:
                return "nine hundred";
            default:
                return "";
        }
    }

    public static void main(String[] args) {
        int number;
        System.out.println("Hãy nhập số cân nặng của bạn");
        Scanner scanner = new Scanner(System.in);
        number = Integer.parseInt(scanner.nextLine());
        int hangTram = number / 100;
        int hangChuc = (number / 10) % 10;
        int hangDV = number % 10;
//        String result = "";
//        if (hangTram > 0) {
//            result += docT(hangTram);
//        }
//
//        if (hangTram > 0 && hangChuc > 0) {
//            result += " and " + docChuc(hangChuc);
//        }else {
//            result +=docChuc(hangChuc);
//        }
//
//        if (hangDV > 0) {
//            result += " " + docDV(hangDV);
//        }
//        System.out.println("result : " + result);

        if (hangTram > 0) {
            if (hangChuc > 0) {
                if (hangChuc == 1) {
                    if (hangDV > 0) {
                        System.out.println(docT(hangTram) + " and " + docChuc1(hangDV));
                    } else {
                        System.out.println(docT(hangTram) + " and ten");
                    }
                } else {
                    if (hangDV > 0) {
                        System.out.println(docT(hangTram) + " and " + docChuc(hangChuc) + " " + docDV(hangDV));
                        //hangDVi<=0
                    } else {
                        System.out.println(docT(hangTram) + " and " + docChuc(hangChuc));
                    }
                }
                //hangChuc <= 0
            } else {
                if (hangDV > 0) {
                    System.out.println(docT(hangTram) + " and " + docDV(hangDV));
                } else {
                    System.out.println(docT(hangTram));
                }
            }
            //hangTram <=0
        } else {
            if (hangChuc > 0) {
                if (hangDV > 0) {
                    System.out.println(docChuc(hangChuc) + " " + docDV(hangDV));
                    //hangDV <=0
                } else {
                    System.out.println(docChuc(hangChuc));
                }
                //hangChuc <= 0
            } else {
                if (hangDV > 0) {
                    System.out.println(docDV(hangDV));
                    //hangDV <=0
                } else {
                    System.out.println("zero");
                }
            }
        }
    }
}