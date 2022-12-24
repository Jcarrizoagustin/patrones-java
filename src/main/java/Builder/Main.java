package Builder;

public class Main {

  public static void main(String[] args){
    Vehiculo vehiculo = new Vehiculo();
    vehiculo.setMarca("Toyota");
    vehiculo.setTipo("Sedan");
    vehiculo.setMotor("Nafta 1.6");
    vehiculo.setPuertas(5);

    System.out.println(vehiculo);

    Vehiculo vehiculo2 = new CocheBuilder().setMarca("Chevrolet").setMotor("Diesel 1.6").setPuertas(3).setTipo("Coupe").build();

    System.out.println(vehiculo2);
  }
}
