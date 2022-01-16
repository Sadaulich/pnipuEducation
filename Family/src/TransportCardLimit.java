public class TransportCardLimit extends TransportCard {
    private int maxTrip;

    public TransportCardLimit(int maxTrip, Human owner) {
        super(owner);
        this.maxTrip = maxTrip;
    }

    @Override
    public boolean pay() {
        if (maxTrip > 0) {
            maxTrip--;
            return true;
        }
        return false;
    }
}
