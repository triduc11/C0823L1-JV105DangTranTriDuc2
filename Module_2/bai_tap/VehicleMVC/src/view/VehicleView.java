package view;

import java.util.Scanner;

public class VehicleView {
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {

    }
    public static void displayMainMenu (){
        int choice ;
        boolean flag = true;
        do {
            System.out.println("----Main Menu----");
            System.out.println("1.Add a new vehicle");
            System.out.println("2.Display vehicle list");
            System.out.println("3.Delete a vehicle");
            System.out.println("4.Exit");
            System.out.println("Choose option:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    displayListAddVehicle();
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    System.out.println("Exiting the program...");
                    flag = false;
            }
        }while (flag);
        scanner.close();
    }
    public static void displayListAddVehicle (){
        int choice ;
        boolean flag = true;
        do {
            System.out.println("----Add Vehicle Menu----");
            System.out.println("1.Add a car");
            System.out.println("2.Add a truck");
            System.out.println("3.Add a motorbike");
            System.out.println("4.Return main menu");
            System.out.println("Choose option:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1 :
                    break;
                case 2 :
                    break;
                case 3 :
                    break;
                case 4 :
                    System.out.println("Returning to the main menu");
                    flag = false;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break ;
            }
        }while (flag);
        scanner.close();
    }
}
