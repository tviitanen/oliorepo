package week6;

public abstract class Account {
        String accountNumber;
        int balance;
        protected Account(String acc, int bal) {
            accountNumber = acc;
            balance = bal;
            System.out.println("Account created.");
    }
    protected String getAccount(){
        return accountNumber;
    }
    protected int getBalance(){
        return balance;
    }
    protected void setBalance(int diff){
        if (0 <= balance - diff){
            this.balance += diff;
        }
    }
}

    class debitAccount extends Account {
        protected debitAccount(String acc, int bal){
        super(acc, bal);
        }
    }

    class creditAccount extends Account {
        private int creditLimit;
        public creditAccount(String acc, int bal, int credit){
            super(acc, bal);
            creditLimit = credit;
        }
    protected int getCredit(){
        return creditLimit;
    }

    protected void setBalance(int diff){
        if (-creditLimit <= balance + diff){
            this.balance += diff;
        }
    }
}

