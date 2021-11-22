public class CurrentAccount {
    private double balance = 1000000;
    //molodec  serega, zarabotal
    public void putMoney(double amount) {
        this.balance += amount;
    }

    public boolean getMoney(double amount) {
        if(balance < amount) {
            return false;
        }
        return true;
    }
}
