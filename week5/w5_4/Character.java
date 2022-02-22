package week5.w5_4;

import java.util.Scanner;

public class Character {
    public Character characterType;

    public void fight() {
        characterType.fight();
        System.out.print(" fights with a weapon ");
        WeaponBehavior weapon = new WeaponBehavior();
        weapon.selectWeapon();
    }
}

class WeaponBehavior {
    public void selectWeapon() {

        int choice = 0;
        System.out.print("Choose your weapon:\n" +
                "1) Knife\n" +
                "2) Axe\n" +
                "3) Sword\n" +
                "4) CLub\n" +
                "Your choice: ");
        Scanner scanner = new Scanner(System.in);
        choice = scanner.nextInt();
        switch (choice) {
            case 1:
                KnifeBehavior knife = new KnifeBehavior();
                knife.useWeapon();
                break;
            case 2:
                AxeBehavior axe = new AxeBehavior();
                axe.useWeapon();
                break;
            case 3:
                SwordBehavior sword = new SwordBehavior();
                sword.useWeapon();
                break;
            case 4:
                ClubBehavior club = new ClubBehavior();
                club.useWeapon();
                break;
        }
        scanner.close();
    }
}

class King extends Character {
    public void fight() {
        System.out.print("King");
    }
}

class Knight extends Character {
    public void fight() {
        System.out.print("Knight");
    }
}

class Queen extends Character {
    public void fight() {
        System.out.print("Queen");
    }
}

class Troll extends Character {
    public void fight() {
        System.out.print("Troll");
    }
}

class KnifeBehavior extends WeaponBehavior {
    public void useWeapon() {
        System.out.println("Knife");
    }
}

class AxeBehavior extends WeaponBehavior {
    public void useWeapon() {
        System.out.println("Axe");
    }
}

class SwordBehavior extends WeaponBehavior {
    public void useWeapon() {
        System.out.println("Sword");
    }
}

class ClubBehavior extends WeaponBehavior {
    public void useWeapon() {
        System.out.println("Club");
    }
}