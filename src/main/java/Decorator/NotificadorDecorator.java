package Decorator;

public class NotificadorDecorator implements Notificador{

    private Notificador wrapee;

    public NotificadorDecorator(Notificador notificador){
        this.wrapee = notificador;
    }
    @Override
    public String notificar() {
        return wrapee.notificar();
    }
}
