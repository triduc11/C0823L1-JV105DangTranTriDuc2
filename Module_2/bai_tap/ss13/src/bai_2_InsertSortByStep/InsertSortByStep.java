package bai_2_InsertSortByStep;

import java.util.Scanner;

public class InsertSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter list size:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " values:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.print("Your input list: ");
        for (int j : list) {
            System.out.print(j + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertSort(list);
    }

    public static void insertSort(int[] list) {

        for (int i = 1; i < list.length; i++) { //đoạn array[0] đã sắp xếp
            int x = list[i];
            int pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("Swap " + list[pos] + " with " + list[pos-1]);
                list[pos] = list[pos - 1]; // đổi chỗ
                pos--;
            }
            list[pos] = x;
            System.out.print("List after the  " + i + " sort: ");
            for (int j : list) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }

    }
}
