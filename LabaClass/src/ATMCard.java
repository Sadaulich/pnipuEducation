public class ATMCard implements ChangeBalance {
    private int PIN;
    private final long ID;
    private double balance;
    private BankCustomer bankCustomer;

    public ATMCard(int PIN, long ID, BankCustomer bankCustomer) {
        this.PIN = PIN;
        this.ID = ID;
        this.bankCustomer = bankCustomer;
        balance = 0;
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

    public void putMoney(double amount) {
        balance += amount;
    }

    @Override
    public BankCustomer getBankCustomer() {
        return bankCustomer;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return  "ATMCard"
                + "\nID: " + ID
                + "\nbalance: " + balance;
    }
}
