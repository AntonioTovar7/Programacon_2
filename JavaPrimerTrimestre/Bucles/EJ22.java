/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */

package tema05; // contenedor

public class EJ22 {

    public static void main(String[] args) {

        long numero ;
        long temporal ;
        long invertido = 0 ;

        System.out.print("Introduce un número entero: ") ;
        numero = Long.parseLong(System.console().readLine()) ;

        if (numero < 10) { invertido = numero ; }
        else {

            // hacemos una copia del número
            temporal = numero ;        

            while (temporal != 0) {
                invertido = invertido * 10 + (temporal%10) ;
                temporal = temporal / 10 ;
            } 
        }

        System.out.printf("Si le damos la vuelta al %d tenemos el %d.\n", numero, invertido) ;        
    }
}
