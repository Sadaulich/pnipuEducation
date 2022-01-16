import Bank.ATMCard;
import Bank.BankCustomer;

public class Main {

    public static void main(String[] args) {
        // Создание TCompany
        BankCustomer TCompanyBankCustomer = new BankCustomer("TCompany", "dedukina 24", "lisa@mail.ru");
        ATMCard TCompanyATMCard = TCompanyBankCustomer.getAccounts().get(0).getCards().get(0);

        TransportCompany TCompany = new TransportCompany(33, TCompanyATMCard);

        // Создание Сани с картой без поездок
        Human sanya = new Human();
        // Карта
        BankCustomer SanyaBankCustomer = new BankCustomer("Sanya", "dedukina 24", "sanya@mail.ru");
        ATMCard SanyaATMCard = TCompanyBankCustomer.getAccounts().get(0).getCards().get(0);
        SanyaATMCard.setBalance(25);
        // Транспортная
        TransportCard transportCard = new TransportCardLimit(0, sanya);

        sanya.setCash(500);
        sanya.setATMCard(SanyaATMCard);
        sanya.setTCard(transportCard);

        // Создание Оли с безлимиткой
        Human oli = new Human();
        TransportCard transportCardOli = new TransportCardNoLimit(oli);
        oli.setTCard(transportCardOli);

        // Оплата транспортной картой без поезок
        boolean payment = sanya.payByTCard();
        if (payment) {
            System.out.println("Оплата транспортной картой без поездок успешно прошла");
        } else {
            System.out.println("Оплата транспортной картой без поездок не прошла");
        }

        // Оплата транспортной без лимита
        payment = oli.payByTCard();
        if (payment) {
            System.out.println("Оплата транспортной картой без лимита успешно прошла");
        } else {
            System.out.println("Оплата транспортной картой без лимита не прошла");
        }

        // Оплата налом
        payment = sanya.payByCash(TCompany);
        if (payment) {
            System.out.println("Оплата налом успешно прошла");
        } else {
            System.out.println("Оплата налом не прошла");
        }

        // Оплата картой банка
        payment = sanya.payByBCard(TCompany);
        if (payment) {
            System.out.println("Оплата картой успешно прошла");
        } else {
            System.out.println("Оплата картой не прошла");
        }
    }
}

