package EjerciciosClase;
public class EjSentenciaWhile{
    public static void main(String[] args) {
        
        int numleido = 0;
        int suma = 0;
        int contador = 0;

        System.out.println("Introduczca número y pulse ENTER. Para terminar introduzca un número negativo.");


        
        // while (numleido >= 0){
            
        //     suma = numleido + suma;
        //     System.out.print("-");
        //     numleido = Integer.parseInt(System.console().readLine());
           
        //     if(numleido>=0){
           
        //         contador++;
        //     }
        // } 


        do{
            
            suma = numleido + suma;
            System.out.print("-");
            numleido = Integer.parseInt(System.console().readLine());
           
            if(numleido>=0){
           
                contador++;
        }
        }while (numleido >= 0);


        System.out.printf("Se han introducido %d digitos, y la suma es un total de %d", contador, suma);
    }
}

// EL WHILE Y DO WHILE SE USA CUANDO NO TENEMOS CERTEZA DE CUANDO VA A ACABAR, O DE CUANTAS VECES SE DEBE REPETIR. 
// EN CAMBIO SI CONOCEMOS ESTO, SE UTILIZA EL FOR.