package task6;

public class BankAccount {
    private int balance;

    public BankAccount() {

    }
    public BankAccount (int balance) {
        this.balance = balance;
    }

    public void addBalance(int addBalance) {
     balance+=addBalance;
    }

    public void takeBalance(int takeBalance) {
       balance-= takeBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank account information [" +
                "balance: " + balance + ']';
    }
}
