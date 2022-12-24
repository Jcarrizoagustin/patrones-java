package Factory;

public class Main {

  public static void main(String[] args){

    PrecioFactory precio = new PrecioFactory("España");
    System.out.println(precio.precio.getPrecio());

    PrecioFactory precio2 = new PrecioFactory("Argentina");
    System.out.println(precio2.precio.getPrecio());

  }
}
