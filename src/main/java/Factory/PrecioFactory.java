package Factory;


public class PrecioFactory {
  Precio precio;
  private PrecioFactory(){}

  public PrecioFactory(String pais){
    if(pais.equalsIgnoreCase("España")){
      System.out.println("España, precio en EURO");
      this.precio = new PrecioEURO();
    }else{
      System.out.println("Otro pais, precio en USD");
      this.precio = new PrecioUSD();
    }
  }
}
