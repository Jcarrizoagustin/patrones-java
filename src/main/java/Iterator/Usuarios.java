package Iterator;

import java.util.ArrayList;

public class Usuarios implements UsuarioIterator{
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private int posicion = 0;
    public void crear(Usuario usuario){
        usuarios.add(usuario);
    }

    @Override
    public boolean hayMas() {
        return usuarios.size() > posicion;
    }

    @Override
    public void reinicia() {
        posicion = 0;
    }

    @Override
    public Usuario siguiente() {
        Usuario usuario = usuarios.get(posicion);
        posicion++;
        return usuario;
    }
}
