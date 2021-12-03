public class CurrentAccount extends Account{
    private float interestRate;

    public CurrentAccount(BankCustomer bankCustomer, float interestRate) {
        super(bankCustomer);
        this.interestRate = interestRate;
    }

    public void setInterestRate(float interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public String toString() {
        return "CurrentAccount:\n" + super.toString() +
                "\ninterestRate=" + interestRate;
    }
}
