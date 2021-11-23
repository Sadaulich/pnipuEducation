import java.util.*;

public class BankCustomer {
    private String name;
    private String address;
    private String email;
    private ArrayList<ATMCard> cards = new ArrayList<>();
    private Hashtable<Integer, SavingsAccount> savingsAccounts = new Hashtable<>();
    private Hashtable<Integer, CurrentAccount> currentAccounts = new Hashtable<>();
    private ArrayList<Transaction> transactions = new ArrayList<>();
    private int idCurrentAccount = 1;
    private int idSavingAccount = 1;

    public BankCustomer(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        currentAccounts.put(idCurrentAccount++, new CurrentAccount(Integer.toString(idCurrentAccount),this, 0));
    }

    public void addNewCurrentAccount(CurrentAccount currentAccount) {
        currentAccounts.put(idCurrentAccount++, currentAccount);
    }

    public void addNewSavingAccount(SavingsAccount savingsAccount) {
        savingsAccounts.put(idSavingAccount++, savingsAccount);
    }

    public void addNewCard(ATMCard card) {
        cards.add(card);
    }

    public void showCards() {
        cards.forEach(System.out::println);
    }

    public void showSavingsAccounts() {
        Enumeration<SavingsAccount> savingsAccountEnumeration = savingsAccounts.elements();
        while (true) {
            try {
                System.out.println(savingsAccountEnumeration.nextElement());
            } catch (NoSuchElementException ex) {
                return;
            }
        }
    }

    public void showCurrentAccount() {
        Enumeration<CurrentAccount> currentAccountEnumeration = currentAccounts.elements();
        while (true) {
            try {
                System.out.println(currentAccountEnumeration.nextElement());
            } catch (NoSuchElementException ex) {
                return;
            }
        }
    }

    public void showTransaction() {
        transactions.forEach(System.out::println);
    }
}

