/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */

package tema05;

import java.util.Scanner;
import tema05.Librerias.Funciones;

public class EJ60 {

    public static void main(String[] args) {
        
        long numero  ;
        Scanner sc = new Scanner(System.in) ;

        try { 
            System.out.print("Introduce un número: ") ;
            numero = sc.nextLong() ;

            // Mostramos el resultado
            System.out.printf("Dislocando el %d obtenemos el %d\n", numero,  dislocar(numero)) ;

        } catch(NumberFormatException excepcion) {
            System.out.println("Se ha producido un error. Introduce únicamente números enteros.") ;
        } finally {
            sc.close() ; 
        }
    }

    /**
     * Disloca un valor numérico sumando 1 a los dígitos pares y restando 1 a los impares.
     * @param numero
     * @return
     */
    public static long dislocar(long numero) {

        long digito ;
        long invertido ;
        long resultado = 0 ;

         // invertimos el número
         invertido = Funciones.invertir(numero) ;

         // dislocamos
         for ( ; invertido > 0; invertido /= 10) {
 
             // obtenemos el resto
             digito = invertido%10 ;  
 
             // comprobamos si el número es par o impar
             digito += (digito%2==0)?1:-1 ;
             
             //if (digito%2==0) { digito++ ; }
             //else                     { digito-- ;   }
 
             // construimos el número resultado
             resultado = (resultado * 10) + digito ;
         }
 
         return resultado ;
    }

}
