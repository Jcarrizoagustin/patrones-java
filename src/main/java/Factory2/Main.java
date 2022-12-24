package Factory2;


public class Main {
    public static void main(String[] args){
        String logistcsName = "sea";

        try {
            Logistics logistics = LogisticsFactory.getLogistics(logistcsName);

            String result = logistics.createTransport().deliver();

            System.out.println("Exito: " + result);
        }catch (NullPointerException e){
            System.out.println("ERROR !!!:  Ocurrio un error en la factory");
        }finally {
            System.out.println("Saliendo...");
        }
    }
}
