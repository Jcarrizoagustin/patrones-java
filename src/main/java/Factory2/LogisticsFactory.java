package Factory2;

public class LogisticsFactory {

    public static Logistics getLogistics(String logistics){
        if(logistics.equalsIgnoreCase("Road")){
            return new RoadLogistics();
        }else if(logistics.equalsIgnoreCase("Sea")){
            return new SeaLogistics();
        }else{
            return null;
        }
    }
}
