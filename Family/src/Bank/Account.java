package Bank;

import java.util.ArrayList;

public abstract class Account {
    private float interestRate;
    private static long lastID = 0;
    private final long ID;
    private BankCustomer bankCustomer;
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private ArrayList<ATMCard> cards = new ArrayList<>();

    public Account(BankCustomer bankCustomer) {
        ID = ++lastID;
        this.bankCustomer = bankCustomer;
        cards.add(new ATMCard(this));
    }

    public void addTransaction(Transaction transaction) {
        bankCustomer.addTransaction(transaction);
        transactions.add(transaction);
    }

    public void addNewCard(ATMCard card) {
        cards.add(card);
    }

    public boolean getMoney(double amount) {
        return cards.get(0).getMoney(amount);
    }

    public void putMoney(double amount) {
        cards.get(0).putMoney(amount);
    }

    public BankCustomer getBankCustomer() {
        return bankCustomer;
    }

    public long getID() {
        return ID;
    }

    public abstract void setInterestRate(float interestRate);

    public double getBalance() {
        double balance = 0;
        for (ATMCard card : cards) {
            balance += card.getBalance();
        }
        return balance;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public ArrayList<ATMCard> getCards() {
        return cards;
    }

    public String toString() {
        return "Account" +
                "\nID='" + ID + '\'' +
                "\nbalance=" + getBalance() +
                "\nbankCustomer=" + bankCustomer.getName();
    }
}
