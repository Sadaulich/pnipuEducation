import java.util.*;

public class BankCustomer {
    private String name;
    private String address;
    private String email;
    private ArrayList<SavingsAccount> savingsAccounts = new ArrayList<>();
    private ArrayList<CurrentAccount> currentAccounts = new ArrayList<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();

    public BankCustomer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        currentAccounts.add(new CurrentAccount(this, 0));
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void addNewCurrentAccount(CurrentAccount currentAccount) {
        currentAccounts.add(currentAccount);
    }

    public void addNewSavingAccount(SavingsAccount savingsAccount) {
        savingsAccounts.add(savingsAccount);
    }

    public void showSavingsAccounts() {
        savingsAccounts.forEach(savingsAccount -> {
            System.out.println();
            System.out.println(savingsAccount);
        });
    }

    public void showCurrentAccount() {
        currentAccounts.forEach(currentAccount -> {
            System.out.println();
            System.out.println(currentAccount);
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

    public ArrayList<SavingsAccount> getSavingsAccounts() {
        return savingsAccounts;
    }

    public ArrayList<CurrentAccount> getCurrentAccounts() {
        return currentAccounts;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}

