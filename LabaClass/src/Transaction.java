import java.util.Date;

public class Transaction {
    private Date beginDate;
    private Date endDate;
    private double amount;
    private BankCustomer customer1;
    private BankCustomer customer2;
    private int state;

    public Transaction(double amount, BankCustomer customer1, BankCustomer customer2) {
        this.amount = amount;
        this.customer1 = customer1;
        this.customer2 = customer2;
    }

    public boolean cancelTransaction() {
        state = -1;
        customer1.getAcc().changeBalance(amount);
        return true;
    }

    public void startTransaction() {
        beginDate = new Date();
        state = 0;
        if (customer1.getAcc().changeBalance(-amount)) {
            state = -1;
            endDate = new Date();
        } else {
            if (cancelTransaction()) { return; }
            customer2.getAcc().changeBalance(amount);
        }
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public double getAmount() {
        return amount;
    }

    public BankCustomer getCustomer1() {
        return customer1;
    }

    public BankCustomer getCustomer2() {
        return customer2;
    }

    public int getState() {
        return state;
    }
}
