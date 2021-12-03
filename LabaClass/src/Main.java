public class Main {

    public static void main(String[] args) {
        BankCustomer danyaKrylov = new BankCustomer("Danya", "dedukina 24", "pokaBoka@junior.zoro");
        BankCustomer korchaDanya = new BankCustomer("DanyaK", "dedukina 24", "MomHunter@deti.cum");
        BankCustomer sergetPeretyga = new BankCustomer("Sergey","dedukina 24", "guccipromegakrut@adidas.nike");

        danyaKrylov.addNewCurrentAccount(new CurrentAccount(danyaKrylov, 0));
        danyaKrylov.addNewSavingAccount(new SavingsAccount(danyaKrylov, 10));
        danyaKrylov.addNewCurrentAccount(new CurrentAccount(danyaKrylov, 0));
        korchaDanya.addNewCurrentAccount(new CurrentAccount(korchaDanya, 0));

        danyaKrylov.getCurrentAccounts().get(1).putMoney(10000);
        korchaDanya.getCurrentAccounts().get(1).putMoney(100005);

        CurrentAccount danyaKr = danyaKrylov.getCurrentAccounts().get(1);
        CurrentAccount danyaKor = korchaDanya.getCurrentAccounts().get(1);

        Transaction transaction1 = new Transaction(50000, danyaKor.getCards().get(0), danyaKr.getCards().get(0));
        transaction1.startTransaction();
        Transaction transaction2 = new Transaction(70000, danyaKr.getCards().get(0), danyaKor.getCards().get(0));
        transaction2.startTransaction();

        danyaKrylov.showCurrentAccount();
        System.out.println();
        danyaKrylov.showTransaction();
        System.out.println();
        danyaKrylov.showSavingsAccounts();
        System.out.println();

        korchaDanya.showCurrentAccount();
        System.out.println();
        korchaDanya.showTransaction();
        System.out.println();

        korchaDanya.showSavingsAccounts();
        System.out.println();

        danyaKr.addNewCard(new ATMCard(5555, danyaKr));
        Transaction transaction3 = new Transaction( 30000, danyaKr.getCards().get(0), danyaKr.getCards().get(1));
        transaction3.startTransaction();
        ATM atm = new ATM("petra 21", "mra");
        atm.readCard(danyaKr.getCards().get(1));
    }
}
