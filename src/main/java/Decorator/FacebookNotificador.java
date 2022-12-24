package Decorator;

public class FacebookNotificador extends NotificadorDecorator{

    public FacebookNotificador(Notificador notificador){
        super(notificador);
    }
    @Override
    public String notificar() {
        return super.notificar() + "Via Facebook ";
    }
}
