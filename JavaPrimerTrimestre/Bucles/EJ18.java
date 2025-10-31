/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */

package tema05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EJ18 {

    public static void main(String[] args) {
        
        int numero ;
        int positivos = 0 ;
        int impares = 0 ;
        int sumaImpares = 0 ;
        int maximoPares = 0 ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Por favor, vaya introduciendo números enteros.") ;
        System.out.println("Puede terminar mediante la introducción de un número negativo.") ;

        try {
            do {
                numero = sc.nextInt() ;

                if (numero >= 0) { 
                
                    // contamos el total de positivos
                    positivos++ ; 
    
                    // si el número es impar contamos y sumamos para calcular la media.
                    if (numero%2!=0) {
                        impares++ ;
                        sumaImpares = sumaImpares + numero ;
                    } else if (numero > maximoPares) {
                        maximoPares = numero ; 
                    }
    
                    // comprobamos el valor máximo
                    //if ((numero%2==0) && (numero > maximoPares) ) { maximoPares = numero ; }                       
                }
            } while (numero >= 0)  ;

            System.out.printf("Ha introducido %d números positivos.\n", positivos) ;
            System.out.printf("La media de los impares es %.2f.\n", ((float) sumaImpares) / impares);
            System.out.printf("El máximo de los pares es %d.\n", maximoPares);

        } catch (InputMismatchException excepcion) {
            System.out.println("Se ha producido un error. Introduce únicamente valores enteros.") ;
        } finally {
            sc.close() ;
        }
    }
}
