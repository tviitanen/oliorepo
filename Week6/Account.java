package week6;

public abstract class Account {
        String accountNumber;
        int balance;
        public Account(String acc, int bal) {
            accountNumber = acc;
            balance = bal;
            System.out.println("Account created.");
    }
    public String getAccount(){
        return accountNumber;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int diff){
        if (0 <= balance - diff){
            this.balance += diff;
        }
    }
}

    class debitAccount extends Account {
        public debitAccount(String acc, int bal){
        super(acc, bal);
        }
    }

    class creditAccount extends Account {
        private int creditLimit;
        public creditAccount(String acc, int bal, int credit){
        super(acc, bal);
        creditLimit = credit;        
        }
    }

