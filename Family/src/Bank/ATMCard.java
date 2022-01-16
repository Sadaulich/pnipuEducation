package Bank;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ATMCard {
    public static final long WEEK = 24 * 60 * 60 * 1000 * 7;
    private int PIN;
    private static long ID = 0;
    private final long this_ID;
    private double balance;
    private Account account;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private Date lastChangeDate = new Date(new Date().getTime() - WEEK);

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

    public int getPIN() { return PIN; }

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

    public Date getLastChangeDate() {
        return lastChangeDate;
    }

    public void setLastChangeDate(Date lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}