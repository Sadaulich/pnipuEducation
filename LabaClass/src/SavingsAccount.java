import java.util.Date;

public class SavingsAccount extends Account{
    private float interestRate;
    private Date lastChangeDate;

    public SavingsAccount(BankCustomer bankCustomer, float interestRate) {
        super(bankCustomer);
        this.interestRate = interestRate;
    }

    public void CalculateInterest() {
        System.out.println(interestRate);
        return;
    }

    @Override
    public boolean getMoney(double amount) {
        Date thisDate = new Date();
        long milliseconds = lastChangeDate.getTime() - thisDate.getTime();
        int days = (int) (milliseconds / (24 * 60 * 60 * 1000));
        if (days >= 7) {
            return super.getMoney(amount);
        }
        return false;
    }

    @Override
    public void putMoney(double amount) {
        lastChangeDate = new Date();
        super.putMoney(amount);
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "SavingsAccount:\n" + super.toString() +
                "\ninterestRate=" + interestRate +
                "\nlastChangeDate: " + lastChangeDate;
    }
}
