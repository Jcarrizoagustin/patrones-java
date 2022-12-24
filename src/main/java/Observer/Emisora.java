package Observer;

import java.util.ArrayList;
import java.util.List;

public class Emisora {

    public List<Receptor> receptores = new ArrayList<>();

    public void meteReceptor(Receptor receptor){
        receptores.add(receptor);
    }

    public void notificar(){
        for(Receptor receptor : receptores){
            receptor.recibe();
        }
    }
}
