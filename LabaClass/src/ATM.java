import java.util.Random;
import java.util.Scanner;

public class ATM implements CardScanner {
    private String location;
    private String branchName;
    private ATMCard currentCard;
    private int enterPIN;
    Scanner in = new Scanner(System.in);

    public ATM(String location, String branchName) {
        this.location = location;
        this.branchName = branchName;
    }

    @Override
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

    @Override
    public boolean acceptCard() {
        return enterPIN == currentCard.getPIN();
    }

    @Override
    public void validatePIN() {

    }

    @Override
    public void ejectCard() {
    }

    private void show() {
        System.out.println("function: \n1.Show balance\n2.Get money\n3.Put money\n4.Escape\nEnter num");
    }

    private void showBalance() {
        currentCard.getBalance();
    }

    private void getMoney() {
        double amount = in.nextDouble();
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
                case 2:
                    getMoney();
                case 3:
                    putMoney();
                case 4:
                    whileBool = false;
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
        return new Random().nextFloat(100000);
    }

    private boolean cancelOperation() {
        return in.nextLine().equalsIgnoreCase("cancel");
    }
}
