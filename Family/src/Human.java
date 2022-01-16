import Bank.ATMCard;
import Bank.BankCustomer;
import Bank.Transaction;

public class Human {
    private TransportCard tCard;
    private ATMCard ATMCard;
    private double cash;

    public boolean payByTCard() {
        return tCard.pay();
    }

    public boolean payByBCard(TransportCompany transportCompany) {
        Transaction transaction = new Transaction(transportCompany.getTicketCost(), ATMCard, transportCompany.getCard());
        transaction.startTransaction();
        if (transaction.getState() == 1) {
            return true;
        }
        return false;
    }

    public boolean payByCash(TransportCompany transportCompany) {
        if (cash - transportCompany.getTicketCost() >= 0) {
            cash -= transportCompany.getTicketCost();
            transportCompany.setCash(transportCompany.getCash() + transportCompany.getTicketCost());
            return true;
        }
        return false;
    }

    public TransportCard getTCard() {
        return tCard;
    }

    public void setTCard(TransportCard tCard) {
        this.tCard = tCard;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Bank.ATMCard getATMCard() {
        return ATMCard;
    }

    public void setATMCard(Bank.ATMCard ATMCard) {
        this.ATMCard = ATMCard;
    }
}
