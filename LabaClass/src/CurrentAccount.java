public class CurrentAccount extends Account{
    private float interestRate;

    public CurrentAccount(String number, BankCustomer bankCustomer, float interestRate) {
        super(number, bankCustomer);
        this.interestRate = interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {

        return "SavingsAccount:\n" + super.toString() +
                "\ninterestRate=" + interestRate;
    }
}
