public class TransportCardNoLimit extends TransportCard {
    public TransportCardNoLimit(Human owner) {
        super(owner);
    }

    @Override
    public boolean pay() {
        return true;
    }
}
