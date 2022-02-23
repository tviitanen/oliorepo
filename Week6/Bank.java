package week6;

import java.util.ArrayList;

public class Bank{
    protected ArrayList<Account> accountList = new ArrayList<Account>();
    protected Bank(){

    }
    
    protected void addAccount(String account, int amount) {
        debitAccount newAccount = new debitAccount(account, amount);
        accountList.add(newAccount);
    }
    
    protected void addCreditAccount(String account, int amount, int credit) {
        creditAccount newAccount = new creditAccount(account, amount, credit);
        accountList.add(newAccount);

    }

    protected void withdraw(String account, int amount) {
        for (Account a : accountList){
            if (a.getAccount().equals(account)){
                a.setBalance(-amount);
            } 
        }
    }
    
    protected void deposit(String account, int amount) {
        for (Account a : accountList) {
            if (a.getAccount().equals(account)) {
                a.setBalance(amount);
            }
        }
    }
    
    protected void removeAccount(String account) {
        int i = 0;
        for (Account a : accountList) {
            if (a.getAccount().equals(account)) {
            accountList.remove(i);
            break;
            }
        i++;
        }
    }

    protected void searchAccount(String account) {
        for (Account a : accountList) {
            if (a.getAccount().equals(account)) {
                System.out.print("Account number: " + account + " Amount of money: " + a.getBalance());
            }
        }
    }    

    protected void printAccounts() {
        for (Account a : accountList) {
            System.out.print("Account number: " + a.getAccount() + " Amount of money: " + a.getBalance());
            if (a instanceof creditAccount){
                System.out.print(" Credit limit: " + ((creditAccount)a).getCredit());
            }
        System.out.println();
        }  
    }
}