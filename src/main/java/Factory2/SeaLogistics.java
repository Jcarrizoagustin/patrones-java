package Factory2;

public class SeaLogistics implements Logistics{

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
