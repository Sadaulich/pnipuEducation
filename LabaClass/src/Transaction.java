import java.util.Date;

public class Transaction {
    private final String name;
    private Date beginDate;
    private Date endDate;
    private final double amount;
    private final ATMCard customer1;
    private final ATMCard customer2;
    private int state;  // -1 отклонена -- 0 в работе -- 1 успешно

    public Transaction(double amount, ATMCard customerCard1, ATMCard customerCard2) {
        this.name = "Перевод между " + customerCard1.getAccount().getBankCustomer().getName() + " и " + customerCard2.getAccount().getBankCustomer().getName();
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
        customer1.addTransaction(this);
        customer2.addTransaction(this);
        state = 0;
        if (!customer1.getMoney(amount)) {
            state = -1;
            endDate = new Date();
            return;
        } else {
            /*if (cancelTransaction()) {
                break;
            }*/
            customer2.putMoney(amount);
        }
        endDate = new Date();
        state = 1;
    }

    @Override
    public String toString() {
        return "Transaction: " + name
                + "\nBegin Date: " + beginDate
                + "\nEndDate: " + endDate
                + "\nAmount: " + amount
                + "\nState: " + state
                + "\nBank Customer 1: " + customer1.getAccount().getBankCustomer().getName()
                + "\nBank Customer 2: " + customer2.getAccount().getBankCustomer().getName();
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

    public String getName() {
        return name;
    }

    public ATMCard getCustomer1() {
        return customer1;
    }

    public ATMCard getCustomer2() {
        return customer2;
    }

    public int getState() {
        return state;
    }
}