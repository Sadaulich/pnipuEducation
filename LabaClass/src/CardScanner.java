public interface CardScanner {
    boolean acceptCard();
    void readCard(ATMCard card);
    void ejectCard();
    void validatePIN();
}
