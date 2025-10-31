
public class EJ17 {
    
    public static void main(String[] args) {
        
        int col ;
        int fil ;            
        int altura ;
        char caracter ;
        int simbolos = 1 ;

        System.out.print("Introduce la altura de la pirámide: ") ;
        altura = Integer.parseInt(System.console().readLine()) ;

        System.out.print("Introduce el carácter de relleno: ") ;
        caracter = System.console().readLine().charAt(0) ;

        for(fil = 1; fil <= altura; fil++) {

            // dibujamos los espacios
            for(col = 1; col <= (altura - fil); col++) { System.out.print(" ") ; }

            // dibujamos el símbolo
            for(col = 1; col <= simbolos; col++) { 
                System.out.printf("%c", ((col == 1) || (col == simbolos) || (fil == altura))?caracter:' ');
                //if ((col == 1) || (col == simbolos) || (fil == altura)) { System.out.print(caracter) ;  }                
                //else                                                                         { System.out.print(" ") ;}
            }
            
            // incrementamos el total de símbolos a imprimir
            simbolos += 2 ;

            System.out.println("") ;
        }
    }
}
