package Decorator;

public class EmailNotificador extends NotificadorDecorator{

    public EmailNotificador(Notificador notificador){
        super(notificador);
    }
    @Override
    public String notificar() {
        return super.notificar() +"Via Email ";
    }
}
