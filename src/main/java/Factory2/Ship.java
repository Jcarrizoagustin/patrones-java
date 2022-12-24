package Factory2;

public class Ship implements Transport{

    @Override
    public String deliver() {
        return "Deliver by Ship!!!";
    }
}
