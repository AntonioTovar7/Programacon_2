/**
 * PROGRAMACIÓN
* Tema 5 - Bucles
 * Antonio J. Sánchez
 * curso 2024|25
 */

package tema05;

public class EJ45 {

    public static void main(String[] args) {
        
        int digito ;
        long numero ;

        System.out.print("Introduzca un número entero: ") ;
        numero = Long.parseLong(System.console().readLine()) ;

        // mostrar los dígitos que aparecen
        System.out.print("Dígitos que aparecen en el número: ") ;
        for(digito=0; digito <= 9; digito++) {            
            if (buscarDigito(numero, digito)) { System.out.printf("%d ", digito) ; }
        }
        
        // mostrar los dígitos que no aparecen
        System.out.print("\nDígitos que no aparecen en el número: ") ;
        for(digito=0; digito <= 9; digito++) {         
            if (!buscarDigito(numero, digito)) { System.out.printf("%d ", digito) ; }
        }

    }

    /**
     * Comprueba que el dígito indicado forma parte del número. Devuelve TRUE si
     * lo encuentra; FALSE en otro caso.
     * @param numero
     * @param digito
     * @return
     */
    public static boolean buscarDigito(long numero, int digito) {

        while((numero > 0) && (digito!=numero%10)) { numero = numero / 10 ; }        
        return (numero > 0) ;
    }
    
}
