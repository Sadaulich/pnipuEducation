package Bank;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankCustomer danyaKrylov = new BankCustomer("Danya", "dedukina 24", "pokaBoka@junior.zoro");
        BankCustomer korchaDanya = new BankCustomer("Sergey", "dedukina 24", "MomHunter@deti.cum");
        BankCustomer sergetPeretyga = new BankCustomer("Sergey", "dedukina 24", "guccipromegakrut@adidas.nike");

        danyaKrylov.addNewCurrentAccount(new CurrentAccount(danyaKrylov, 0));
        danyaKrylov.addNewSavingAccount(new SavingsAccount(danyaKrylov, 10));
        danyaKrylov.addNewCurrentAccount(new CurrentAccount(danyaKrylov, 0));
        korchaDanya.addNewCurrentAccount(new CurrentAccount(korchaDanya, 0));

        danyaKrylov.getAccounts().get(1).putMoney(10000);
        korchaDanya.getAccounts().get(1).putMoney(100005);


        CurrentAccount danyaKr = (CurrentAccount) danyaKrylov.getAccounts().get(1);
        CurrentAccount danyaKor = (CurrentAccount) korchaDanya.getAccounts().get(1);

        Transaction transaction1 = new Transaction(50000, danyaKor.getCards().get(0), danyaKr.getCards().get(0));
        transaction1.startTransaction();
        Transaction transaction2 = new Transaction(70000, danyaKr.getCards().get(0), danyaKor.getCards().get(0));
        transaction2.startTransaction();

        danyaKrylov.showAccounts();
        System.out.println();
        danyaKrylov.showTransaction();
        System.out.println();
        danyaKrylov.showAccounts();
        System.out.println();

        korchaDanya.showAccounts();
        System.out.println();
        korchaDanya.showTransaction();
        System.out.println();

        korchaDanya.showAccounts();
        System.out.println();

        danyaKr.addNewCard(new ATMCard(5555, danyaKr));
        Transaction transaction3 = new Transaction(30000, danyaKr.getCards().get(0), danyaKr.getCards().get(1));
        transaction3.startTransaction();

        ////////////////////////////////////////////

        /////////////////////////////////////

        CurrentAccount danyaKr2 = (CurrentAccount) danyaKrylov.getAccounts().get(3);
        Transaction transactionNew = new Transaction(1000, danyaKor.getCards().get(0), danyaKr2.getCards().get(0));
        transactionNew.startTransaction();

        danyaKrylov.showTransaction();
        System.out.println();
        System.out.println("danyaKr");
        for (Transaction transaction : danyaKr.getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }
        System.out.println();
        System.out.println("danyaKr2");
        for (Transaction transaction : danyaKr2.getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }

        System.out.println();
        System.out.println("Карта с тридцаткой");
        for (Transaction transaction : danyaKr.getCards().get(1).getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }

        ATM atm =new ATM("gagsg", "gagsags");
        atm.setBankomatCard(danyaKr.getCards().get(1));
        atm.getMoney(20000);

        atm.setBankomatCard(danyaKr2.getCards().get(0));
        atm.putMoney(20000);


        System.out.println();
        System.out.println("Карта с тридцаткой");
        for (Transaction transaction : danyaKr.getCards().get(1).getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }

        System.out.println();
        System.out.println("danyaKr2");
        for (Transaction transaction : danyaKr2.getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }

        System.out.println();
        System.out.println("danyaKr");
        for (Transaction transaction : danyaKr.getTransactions()) {
            System.out.println();
            System.out.println(transaction);
        }
    }
}
