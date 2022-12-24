package Iterator;

public class Main {
    public static void main(String[] args){
        Usuarios usuarios = new Usuarios();

        usuarios.crear(new Usuario("Agustin",25));
        usuarios.crear(new Usuario("Pablo",20));
        usuarios.crear(new Usuario("Laura",28));
        usuarios.crear(new Usuario("Gimena",31));



        System.out.println(usuarios.siguiente());
        System.out.println(usuarios.siguiente());
        usuarios.reinicia();
        System.out.println(usuarios.siguiente());
        System.out.println(usuarios.siguiente());
        System.out.println(usuarios.hayMas());
    }
}
