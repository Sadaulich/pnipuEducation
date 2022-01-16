package Bank;

import java.util.*;

public class BankCustomer {
    private String name;
    private String address;
    private String email;
    private ArrayList<Account> accounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BankCustomer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        accounts.add(new CurrentAccount(this, 0));
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void addNewCurrentAccount(CurrentAccount currentAccount) {
        accounts.add(currentAccount);
    }

    public void addNewSavingAccount(SavingsAccount savingsAccount) {
        accounts.add(savingsAccount);
    }

    public void showAccounts() {
        accounts.forEach(account -> {
            System.out.println();
            System.out.println(account);
        });
    }

    public void showTransaction() {
        transactions.forEach(transaction -> {
            System.out.println();
            System.out.println(transaction);
        });
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}

