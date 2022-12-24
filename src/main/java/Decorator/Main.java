package Decorator;

public class Main {
    public static void main(String [] args){
        NotificadorDecorator notificador = new SMSNotificador(new FacebookNotificador(new EmailNotificador(new NotificadorBasico())));
        String result = notificador.notificar();
        System.out.println(result);
    }
}
