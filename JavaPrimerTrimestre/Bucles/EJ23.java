/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */

 package tema05;

import tema05.Librerias.Funciones;

public class EJ23 {

    public static void main(String[] args) {
        
        long numero ;        
        long digito ;
        int total ;
        int posicion = 1 ;

        System.out.print("Introduzca un número entero:") ;
        numero = Integer.parseInt(System.console().readLine()) ;

        System.out.print("Introduzca un número digito:") ;
        digito = Long.parseLong(System.console().readLine()) ;

        // calculamos                
        System.out.printf("Contando de izquierda a derecha, el dígito %d aparece dentro de %d en las siguientes posiciones: ", digito, numero) ;

        // obtenemos el total de dígitos
        total = Funciones.longitud(numero) ;

        // invertimos el número
        numero = Funciones.invertir(numero) ;

        // buscamos las posiciones del dígito
        for( ; total > 0; total--) { 
            if ((numero%10)==digito) { System.out.printf("%d  ", posicion) ; }
            numero = numero / 10 ;
            posicion++ ;
         }
    }
    
}
