package Bank;

import java.util.Random;
import java.util.Scanner;

public class ATM  {
    private String location;
    private String branchName;
    private ATMCard currentCard;
    private int enterPIN;
    Scanner in = new Scanner(System.in);
    private ATMCard bankomatCard = new ATMCard(new CurrentAccount(new BankCustomer("ATM", location, "email"), 0));
    private double cash = 100000000;

    public ATM(String location, String branchName) {
        this.location = location;
        this.branchName = branchName;
    }

    public void readCard(ATMCard card) {
        currentCard = card;
        System.out.println("Enter PIN");
        enterPIN = Integer.parseInt(in.nextLine());
        if (!acceptCard()) {
            System.out.println("Error! Wrong pin-code");
            ejectCard();
            return;
        }
        //work();
        ejectCard();
    }

    public boolean acceptCard() {
        return enterPIN == currentCard.getPIN();
    }

    public void ejectCard() {
    }

    private void show() {
        System.out.println("function: \n1.Show balance\n2.Get money\n3.Put money\n4.Escape\n5.Transaction\nEnter num");
    }

    private void showBalance() {
        System.out.println("Balance: " + currentCard.getBalance());
    }

    public void getMoney(double amount) {  // транзакция
        if (cash < amount) {
            System.out.println("Нет денег в банкомате");
            return;
        }
        Transaction transaction = new Transaction(amount, currentCard, bankomatCard);
        transaction.startTransaction();

        if (transaction.getState() == 1) {

            System.out.println("Возьмите деньги");
        } else {
            System.out.println("Недоступно:(");
        }
    }

    /*private void work(){
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
                case 5:
                    showTransaction();
                    break;
                default:
                    System.out.println();
                    System.out.println("Введите верную цифру");
                    System.out.println();
            }
        }
    }*/

    public void putMoney(double amount) {
        bankomatCard.setBalance(100000000);
        System.out.println("Положите деньги");
        if (cancelOperation()) {
            System.out.println("Возьмите деньги");
            return;
        }
        cash -= amount;
        System.out.println(amount);
        Transaction transaction = new Transaction(amount, bankomatCard, currentCard);
        transaction.startTransaction();
        if (transaction.getState() == -1) {
            cashBack();
            return;
        }
    }

    public void showTransaction() {
        for (Transaction transaction : currentCard.getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }
    }

    public void cashBack() {
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

    public void setBankomatCard(ATMCard bankomatCard) {
        this.currentCard = bankomatCard;
    }
}
