package Prototype;

public class Coche {
    private String patente;
    private String marca;
    private String modelo;
    private Integer puertas;

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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getPuertas() {
        return puertas;
    }

    public void setPuertas(Integer puertas) {
        this.puertas = puertas;
    }

    public Coche clonar(){
        Coche clon = new Coche();
        clon.patente = this.patente;
        clon.marca = this.marca;
        clon.modelo = this.modelo;
        clon.puertas = this.puertas;
        return clon;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "patente='" + patente + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", puertas=" + puertas +
                '}';
    }
}
