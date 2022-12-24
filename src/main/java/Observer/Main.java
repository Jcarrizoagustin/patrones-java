package Observer;

public class Main {
    public static void main(String [] args){
        Emisora emisora = new Emisora();

        emisora.meteReceptor(new ReceptorRadio());
        emisora.meteReceptor(new ReceptorSatelite());
        emisora.meteReceptor(new ReceptorTV());

        emisora.notificar();
    }
}
