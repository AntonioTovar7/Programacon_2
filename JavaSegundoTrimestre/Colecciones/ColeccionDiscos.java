
import java.util.ArrayList;

public class ColeccionDiscos {
    
    static int tamañolista = 0;
        
    private ArrayList<Disco> lista;
   
    
    //INICIALIZA LA LISTA VACÍA
    public ColeccionDiscos() {
        this.lista = new ArrayList<>();
        }
    
    //METODO AÑADIR DISCO
    public void añadirDisco(Disco disco) {
        
        lista.add(disco);
        System.out.println("¡Disco guardado con éxito!");
        tamañolista++;
    }

    public void mostrarDiscos(){
        for(Disco d : lista){
            System.out.println(d.toString());
        }
    }

    public void buscarDisco(String codigo){
        for(int i = 0; i<=tamañolista;i++){
            
        }
    }
            
    
}
    

