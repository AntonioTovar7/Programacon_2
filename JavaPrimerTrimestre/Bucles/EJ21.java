
/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */
package tema05;

public class EJ21 {

    public static void main(String[] args) {
        
        int fil ;
        int col ;
        int altura ;

        System.out.println("\033[1mPIRÁMIDE NUMÉRICA\033[0m") ;
        System.out.print("Introduce la altura de la pirámide: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;

        for (fil = 1; fil <= altura; fil++) {

            // dibujamos espacios
            for(col = 1; col <= (altura - fil); col++) { System.out.print(" ") ; }

            // dibujamos numeritos (izquierda)
            for(col=1; col <= fil; col++) { System.out.print(col) ; }

            // dibujamos numeritos (derecha)
            for(col=(fil - 1); col >= 1; col--) { System.out.print(col) ; }

            // damos un salto de línea al final de cada fila
            System.out.println("");

        }

    }
    
}
