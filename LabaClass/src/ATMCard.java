import java.util.ArrayList;
import java.util.List;

public class ATMCard {
    private int PIN;
    private static long ID = 0;
    private final long this_ID;
    private double balance;
    private Account account;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public ATMCard(int PIN, Account account) {
        this.PIN = PIN;
        this.account = account;
        balance = 0;
        this_ID = ++ID;
    }

    public ATMCard(Account account) {
        this.PIN = 1234;
        this.account = account;
        balance = 0;
        this_ID = ++ID;
    }

    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    public long getID() {
        return ID;
    }

    public boolean getMoney(double amount) {
        if (amount > balance) {
            return false;
        }
        balance -= amount;
        return true;
    }

    public long getThis_ID() {
        return this_ID;
    }

    public void putMoney(double amount) {
        balance += amount;
    }

    public void addTransaction(Transaction transaction) {
        account.addTransaction(transaction);
        transactions.add(transaction);
    }

    public double getBalance() {
        return balance;
    }

    public Account getAccount() {
        return account;
    }

    public void showTransaction() {
        transactions.forEach(transaction -> {
            System.out.println();
            System.out.println(transaction);
        });
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return  "ATMCard"
                + "\nID: " + ID
                + "\nbalance: " + balance;
    }
}