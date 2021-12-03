import java.util.Random;
import java.util.Scanner;

public class ATM  {
    private String location;
    private String branchName;
    private ATMCard currentCard;
    private int enterPIN;
    Scanner in = new Scanner(System.in);
    private ATMCard bankomatCard = new ATMCard(new CurrentAccount(new BankCustomer("bankomat", location, "email"), 0));

    public ATM(String location, String branchName) {
        this.location = location;
        this.branchName = branchName;
    }

    public void readCard(ATMCard card) {
        currentCard = card;
        System.out.println("Enter PIN");
        enterPIN = Integer.parseInt(in.nextLine());
        if (!acceptCard()) {
            ejectCard();
        }
        work();
        ejectCard();
    }

    public boolean acceptCard() {
        return enterPIN == currentCard.getPIN();
    }

    public void ejectCard() {
    }

    private void show() {
        System.out.println("function: \n1.Show balance\n2.Get money\n3.Put money\n4.Escape\nEnter num");
    }

    private void showBalance() {
        currentCard.getBalance();
    }

    private void getMoney() {  // транзакция
        double amount = in.nextDouble();
        if (currentCard.getAccount().getClass() == SavingsAccount.class) {
            Transaction transactionToAcc = new Transaction(amount, currentCard, currentCard.getAccount().getCards().get(0));
        }
        if (currentCard.getMoney(amount)) {
            System.out.println("Возьмите деньги");
        } else {
            System.out.println("Недостаточно средств");
        }
    }

    private void work(){
        boolean whileBool = true;
        while (whileBool) {
            show();
            switch (in.nextInt()) {
                case 1:
                    showBalance();
                    break;
                case 2:
                    getMoney();
                    break;
                case 3:
                    putMoney();
                    break;
                case 4:
                    whileBool = false;
                    break;
                default:
                    System.out.println("Введите верную цифру");
            }
        }
    }

    private void putMoney() {
        System.out.println("Положите деньги");
        float amount = calculateAmount();
        if (cancelOperation()) {
            System.out.println("Возьмите деньги");
            return;
        }
        currentCard.putMoney(amount);
    }

    public String getLocation() {
        return location;
    }

    public String getBranchName() {
        return branchName;
    }

    private float calculateAmount() {
        return (float) ( Math.random() * 100000 );
    }

    private boolean cancelOperation() {
        return in.nextLine().equalsIgnoreCase("cancel");
    }
}
