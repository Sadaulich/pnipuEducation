import java.util.Random;

public abstract class TransportCard
{
    private long cardId;
    private static long cardCounter = 0;
    private Human owner;

    public TransportCard (Human owner)
    {
        this.owner = owner;
        cardId = cardCounter++;
    }

    abstract boolean pay();

    @Override
    public String toString()
    {
        return "Card_ID = '" + cardId + '\'';
    }

    public long getCardId() {
        return cardId;
    }

    public static long getCardCounter() {
        return cardCounter;
    }
}
