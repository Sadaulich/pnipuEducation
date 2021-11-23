import java.util.Date;

public class Transaction {
    private String name;
    private Date beginDate;
    private Date endDate;
    private double amount;
    private ChangeBalance customer1;
    private ChangeBalance customer2;
    private int state;  // -1 отклонена -- 0 в работе -- 1 успешно

    public Transaction(String name, double amount, ChangeBalance customerCard1, ChangeBalance customerCard2) {
        this.name = name;
        this.amount = amount;
        this.customer1 = customerCard1;
        this.customer2 = customerCard2;
    }

    public boolean cancelTransaction() {
        state = -1;
        customer1.putMoney(amount);
        return true;
    }

    public void startTransaction() {
        beginDate = new Date();
        state = 0;
        if (!customer1.getMoney(amount)) {
            state = -1;
            endDate = new Date();
        } else {
            if (cancelTransaction()) {
                return;
            }
            customer2.putMoney(amount);
        }
        state = 1;
    }

    @Override
    public String toString() {
        return "Transaction: " + name
                + "\nBegin Date: " + beginDate
                + "\nEndDate: " + endDate
                + "\nAmount: " + amount
                + "\nState: " + state
                + "\nBank Customer 1: " + customer1.getBankCustomer()
                + "\nBank Customer 2: " + customer1.getBankCustomer();
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

    public ChangeBalance getCustomer1() {
        return customer1;
    }

    public ChangeBalance getCustomer2() {
        return customer2;
    }
}
