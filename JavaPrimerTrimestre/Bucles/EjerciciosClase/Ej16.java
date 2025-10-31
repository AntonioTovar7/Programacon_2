public class Ej16 {
    public static void main(String[] args) {
        
        int numero;
        // String numerocadena;
        // char primer;

        System.out.println("Introduce un numero entero (máximo 5 cifras) :");
        numero = Integer.parseInt(System.console().readLine());
        numero = Math.abs(numero);


    //FORMA CADENA
    //     if (numero >= -99999 && numero<=99999){

        
    //     numerocadena = Integer.toString(numero);
    //     primer = numerocadena.charAt(0);
            
    //          System.out.printf("El primer dígito del número introducido es el %c.\n", primer);
    //         }
    
    
    
    /*FORMA MATEMATICA CON WHILE
    while (numero>10) {
            numero = numero/10;
        
    }
            System.out.printf("El primer dígito del número introducido es el %d.\n", numero);*/



    /*FORMA MATEMATICA IF*/
    if (numero<=99999){

        if (numero>=10000){
            numero = numero/10000;
            
            System.out.printf("El primer dígito del número introducido es el %d.\n", numero);
        }else if (numero>=1000){
            numero = numero/1000;

            System.out.printf("El primer dígito del número introducido es el %d.\n", numero);
        }else if (numero >= 100){
            numero = numero/100;
            
            System.out.printf("El primer dígito del número introducido es el %d.\n", numero);
        }else if (numero>=10){
            numero = numero/10;

            System.out.printf("El primer dígito del número introducido es el %d.\n", numero);
        }


    }

 }
}


