package vistas;

import java.util.ArrayList;
import modelos.Atleta;

public class AtletaView {
    
    /**
     * @param datos
     */
    public void mostrarAtletas(ArrayList<Atleta> datos) {

        System.out.println("\nLISTADO DE ATLETAS\n=============================================================");
        for(Atleta item: datos) {
            System.out.println(item);
        }
    }

}