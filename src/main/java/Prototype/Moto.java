package Prototype;

public class Moto implements Cloneable{
    private String patente;
    private String marca;

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Moto clonar() throws CloneNotSupportedException{
        return (Moto)this.clone();
    }

    @Override
    public String toString() {
        return "Moto{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}
