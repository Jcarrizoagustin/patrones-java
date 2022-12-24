package Decorator;

public class NotificadorBasico implements Notificador{
    @Override
    public String notificar() {
        return "Notificacion basica ";
    }
}
