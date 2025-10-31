/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */

package tema05;

public class EJ32 {

    public static void main(String[] args) {
        
        int fila ;
        int altura ;   
        int espacios ;
        int incremento  ;
        int mitad ;

        System.out.print("Introduce la altura de la X: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;
        
        // dibujamos únicamente si la altura es  impar y mayor o igual que 3
        if ((altura >= 3) && (altura%2!=0)) {

            // inicializamos fila
            fila = 0 ;

            // inicializamos el incremento 
            incremento = 1 ;

            // inicializamos el número de espacios
            espacios = altura - 2 ;

            // bucle que "rebota"
            while(fila > -1) {

                // dibujamos los espacios iniciales
                dibujarEspacios(fila) ;

                // dibujar la estrella
                System.out.print("*") ;

                // dibujamos los espacios centrales
                dibujarEspacios(espacios);

                // dibujar la estrella
                if(fila!=(altura/2)) { System.out.print("*") ; }

                // hacemos un salto de línea
                System.out.println() ;                

                // decrementamos el número de espacios
                espacios = espacios - (2 * incremento) ;  
               
                // incrementamos o decrementamos la fila
                fila += incremento ;

                // cambiamos la direción de fila
                if (fila == (altura/2))  incremento = - 1 ;
            }       
        } else {
            System.out.println("ERROR: Introduce un valor impar y mayor o igual a tres.") ;
        }
    }

     /**
     * Dibuja tantos espacios como se indiquen
     * @param espacios
     */
    public static void dibujarEspacios(int espacios) {
        for(int i=1; i<=espacios; i++) { System.out.print(" ") ; }
    }
    
}
