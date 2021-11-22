import java.util.Calendar;
import java.util.Date;

public class SavingAccount {
    private Calendar dateLastChange;
    private float interestRate;
    private double amount = 0;

    public SavingAccount(float interestRate) {
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        return;
    }

    public void putMoney() {
        dateLastChange.setTimeInMillis(new Date());
    }

    public void getMoney() {

    }
}
