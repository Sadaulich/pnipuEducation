public class ATMCard extends CardScanner{
    private int pin;
    private long cardID;
    private Account acc;

    public ATMCard(int pin, long cardID, Account acc) {
        this.pin = pin;
        this.cardID = cardID;
        this.acc = acc;
    }

    public void changePIN(int newPIN) {
        pin = newPIN;
    }

    public int getPin() {
        return pin;
    }

    public long getCardID() {
        return cardID;
    }

    public Account getAcc() {
        return acc;
    }
}
