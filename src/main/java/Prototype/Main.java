package Prototype;

public class Main {
    public static void main(String [] args){
        Coche coche = new Coche();
        coche.setPatente("AB-498-ST");
        coche.setMarca("Toyota");
        coche.setModelo("Etios 1.6");
        coche.setPuertas(5);

        Coche clonado = coche.clonar();
        clonado.setPuertas(3);

        System.out.println(coche.toString());
        System.out.println(clonado.toString());

        Moto moto = new Moto();
        moto.setMarca("Yamaha");
        moto.setPatente("AC-455");

        System.out.println(moto.toString());


        try{
            Moto clon = moto.clonar();
            clon.setPatente("AB-888");
            System.out.println(clon.toString());
        }catch (CloneNotSupportedException e){
            System.out.println(e.getMessage());
        }
    }
}
