package week6;

import java.util.ArrayList;

public class Bank{
    private ArrayList<Account> accountList = new ArrayList<Account>();
    public Bank(){

    }
    
    public void addAccount(String account, int amount) {
        debitAccount newAccount = new debitAccount(account, amount);
        accountList.add(newAccount);
    }
    
    public void addCreditAccount(String account, int amount, int credit) {

    }

    public void withdraw(String account, int amount) {
        for (Account a : accountList){
            if (a.getAccount() == account){
                a.setBalance(amount);
            } 
        }
    }
    
    public void deposit(String account, int amount) {
        for (Account a : accountList) {
            if (a.getAccount() == account) {
                a.setBalance(-amount);
            }
        }
    }
    
    public void removeAccount(String account) {
        int i = 0;
        for (Account a : accountList) {
            if (a.getAccount() == account) {
            accountList.remove(i);
            }
        i++;
        }
    }

    public void searchAccount(String account) {
        System.out.println("works2");
        for (Account a : accountList) {
            System.out.println("works3");
            if (a.getAccount().equals(account)) {
                System.out.println("Account number: " + account + " Amount of money: " + a.getBalance());
            }
        }
    }    

    public void printAccounts() {
        for (Account a : accountList) {
            System.out.println("Account number: " + a.getAccount());
            }
        }  
}