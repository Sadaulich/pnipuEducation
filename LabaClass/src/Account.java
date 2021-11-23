public class Account implements ChangeBalance{
    private String number;
    private double balance = 0;
    private BankCustomer bankCustomer;

    public Account(String number, BankCustomer bankCustomer) {
        this.number = number;
        this.bankCustomer = bankCustomer;
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

    public String getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account" +
                "\nnumber='" + number + '\'' +
                "\nbalance=" + balance +
                "\nbankCustomer=" + bankCustomer;
    }
}
