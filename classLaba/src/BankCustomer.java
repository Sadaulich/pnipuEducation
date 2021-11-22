import java.util.ArrayList;
import java.util.List;

public class BankCustomer {
    private String customerName;
    private String address;
    private String email;
    private ATMCard card;
    private Account acc;
    List<Transaction> transactions;

    public BankCustomer(String customerName, String address, String email, ATMCard card, Account acc) {
        this.customerName = customerName;
        this.address = address;
        this.email = email;
        this.card = card;
        this.acc = acc;
        transactions = new ArrayList<>();
    }

    public void selectTransaction() {

    }

    public boolean enterPIN(int number) {
        return number == card.getPin();
    }

    public void changePIN(int newPIN) {
        card.changePIN(newPIN);
    }

    public void withdrawCash() {
        System.out.println(acc.getBalance());
    }

    public Transaction requestTransactionSummary(int amount, BankCustomer customer2) {
        return new Transaction(amount, this, customer2);
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ATMCard getCard() {
        return card;
    }

    public void setCard(ATMCard card) {
        this.card = card;
    }

    public Account getAcc() {
        return acc;
    }

    public void setAcc(Account acc) {
        this.acc = acc;
    }

    /*
    acceptAmount(
    );*/
}
