package week5.w5_4;

import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args) {
        int choice = 0;
        do {
            choice = 0;
            System.out.print("*** BATTLESIMULATOR ***\n" +
                    "1) Create a character\n" +
                    "2) Fight with a character\n" +
                    "0) Quit\n" +
                    "Your choice: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Choose your character: \n" +
                            "1) King\n" +
                            "2) Knight\n" +
                            "3) Queen\n" +
                            "4) Troll\n" +
                            "Your choice: ");
                    choice = scanner.nextInt();
                    switch (choice) {
                        case 1:
                            Character myKing = new King();
                            WeaponBehavior myWeapon = new WeaponBehavior();
                            myKing.fight();
                            break;
                        case 2:
                            Character myKnight = new Knight();
                            myKnight.fight();
                            break;
                        case 3:
                            Character myQueen = new Queen();
                            myQueen.fight();
                            break;
                        case 4:
                            Character myTroll = new Troll();
                            myTroll.fight();
                            break;
                    }
                    break;
                case 2:

                    break;
                default:
                    break;
            }
        scanner.close();
        } while (choice != 0);
    }
}