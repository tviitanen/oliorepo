package week6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Mainclass {
    public static void main(String[] args){
        boolean jatka = true;
        String account = null;
        int amount;
        Bank bank = new Bank();
        while (jatka){      
            System.out.println("\n*** BANK SYSTEM ***");
            System.out.println("1) Add a regular account");
            System.out.println("2) Add a credit account");
            System.out.println("3) Deposit money");
            System.out.println("4) Withdraw money");
            System.out.println("5) Remove an account");
            System.out.println("6) Print account information");
            System.out.println("7) Print all accounts");
            System.out.println("0) Quit");
            System.out.print("Your choice: ");

            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int choice = sc.nextInt();
            switch(choice) {
            case 1:
                System.out.print("Give an account number: ");
                    try {
                        account = br.readLine().trim();
                    } catch (IOException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                System.out.print("Amount of money to deposit: ");
                amount = sc.nextInt();
                bank.addAccount(account, amount);
                break;
            case 2:
                System.out.print("Give an account number: ");
                try {
                    account = br.readLine().trim();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.print("Amount of money to deposit: ");
                amount = sc.nextInt();
                System.out.print("Give a credit limit: ");
                int creditLimit = sc.nextInt();
                System.out.println("Adding to bank: " + account + "," + amount + "," + creditLimit);
                bank.addCreditAccount(account, amount, creditLimit);
                break;
            case 3:
                System.out.print("Give an account number: ");
                try {
                    account = br.readLine().trim();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.print("Amount of money to deposit: ");
                amount = sc.nextInt();
                System.out.println("Depositing to the account: " + account + " the amount " + amount);
                bank.deposit(account, amount);
                break;
            case 4:
                System.out.print("Give an account number: ");
                try {
                    account = br.readLine().trim();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.print("Amount of money to withdraw: ");
                amount = sc.nextInt();
                bank.withdraw(account, amount);
                break;
            case 5:
                System.out.print("Give the account number of the account to delete: ");
                try {
                    account = br.readLine().trim();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                System.out.println("Account removed.");
                bank.removeAccount(account);
                break;
            case 6:
                System.out.print("Give the account number of the account to print information from: ");
                try {
                    account = br.readLine().trim();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                bank.searchAccount(account);
                break;
            case 7:
                System.out.println("All accounts:");
                bank.printAccounts();
                break;            
            case 0:
                jatka = false;
                sc.close();
                break;
            default:
                System.out.println("Invalid choice.");
            }
        }
    }
}