package Decorator;

public class SMSNotificador extends NotificadorDecorator{

    public SMSNotificador(Notificador notificador){
        super(notificador);
    }
    @Override
    public String notificar() {
        return super.notificar() + "Via SMS ";
    }
}
