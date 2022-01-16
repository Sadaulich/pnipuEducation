import Bank.ATMCard;

public class TransportCompany {
    private double ticketCost = 33;
    private ATMCard card;
    private double cash;

    public TransportCompany(double ticketCost, ATMCard card) {
        this.ticketCost = ticketCost;
        this.card = card;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }

    public ATMCard getCard() {
        return card;
    }

    public void setCard(ATMCard card) {
        this.card = card;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
