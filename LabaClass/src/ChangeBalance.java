public interface ChangeBalance {
    boolean getMoney(double amount);
    void putMoney(double amount);
    BankCustomer getBankCustomer();
}
