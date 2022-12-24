package Builder;

public class CocheBuilder {
  Vehiculo vehiculo;

  public CocheBuilder(){
    vehiculo = new Vehiculo();
  }

  public CocheBuilder setPuertas(int puertas){
    vehiculo.setPuertas(puertas);
    return this;
  }

  public CocheBuilder setMarca(String marca){
    vehiculo.setMarca(marca);
    return this;
  }

  public CocheBuilder setTipo(String tipo){
    vehiculo.setTipo(tipo);
    return this;
  }

  public CocheBuilder setMotor(String motor){
    vehiculo.setMotor(motor);
    return this;
  }

  public Vehiculo build(){
    return vehiculo;
  }


}
