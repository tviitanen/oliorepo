package Week3;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        boolean jatka = true;
        while (jatka){      
            System.out.println("\n*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
            System.out.print("Your choice: ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
                BottleDispenser.getInstance().addMoney();
                break;
            case 2:
                BottleDispenser.getInstance().printBottles();
                System.out.print("Your choice: ");
                Scanner scan = new Scanner(System.in);
                int purchace = scan.nextInt();
                BottleDispenser.getInstance().buyBottle(purchace);
                break;
            case 3:
                BottleDispenser.getInstance().returnMoney();
                break;
            case 4:
                BottleDispenser.getInstance().printBottles();
                break;
            case 0:
                jatka = false;
                sc.close();
                break;
            default:
                System.out.println("Unknown value.");
            }
        }
    }
}
