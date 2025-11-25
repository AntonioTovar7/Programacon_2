package JavaPrimerTrimestre.funciones;

public class Matematicas {
    public static void main(String[] args) {
        int numero;
        int potencia;
        int n;

        System.out.print("introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());

        if (esCapicua(numero)) {
            System.out.println("Es capicúa");
        }else{
            System.out.println("No es capicúa");
        }

        if (esPrimo(numero)) {
            System.out.println("Es primo");
        }else{
            System.out.println("No es primo");
        }

        System.out.println(siguientePrimo(numero));

        System.out.printf("a que numero deseas elevar el %d ",  numero);
        potencia = Integer.parseInt(System.console().readLine());

        System.out.println(numeroElevado(numero, potencia));

        System.out.printf("El %d tiene %d digitos\n",numero, digitos(numero));

        System.out.printf("El %d volteado es %d\n",numero, voltea(numero));

        System.out.print("Qué dígito le gustaría exponer: ");
        n = Integer.parseInt(System.console().readLine());

        System.out.println(digitoN(numero, n));
    }



    /**
     * COMPROBAMOS SI UN NÚMERO ES O NO CAPICÚA
     * @param numero
     * @return
     */ 
    public static boolean esCapicua(int numero){
         
        int orignal = numero;
        int invertido = 0;
        int digito;
        
            invertido = 0;
        
        while(numero>0){
            digito = numero%10;
            invertido = invertido*10 + digito;
            numero/=10;
            }

    return orignal == invertido;
}

/**
 * COMPROBAMOS SI UN NUMERO ES O NO PRIMO
 * @param numero
 * @return
 */
    public static boolean esPrimo(int numero){
        
        boolean primo = true;
        int contador = 2;
        
        if((numero==0) || (numero==1)){
            primo = false;
        }else{

        while ((contador <= numero/2) && (primo)) {

                if(numero%contador==0){
                    primo = false;
                    contador++;
                }else{
                    contador++;
                }
            }
        }
        return primo;
    }


    /**
     * 
     * SE MUESTRA EL SIGUIENTE PRIMO MÁS CERCANO A "numero"
     * @param numero
     * @return
     */
    public static int siguientePrimo(int numero){
        
        int siguiente;
        siguiente = numero+1;

        while(!esPrimo(siguiente)){
            siguiente++;
        }
        

        return siguiente;
    }

    /**
     * 
     * @param numero
     * @param potencia
     * @return
     * 
    */
    public static double numeroElevado(int numero, int potencia){
        
        //1º USANDO MATH POW
        //double resultado = Math.pow(numero, potencia) ;
        
        //2º USANDO BUCLES
        double resultado = numero;
        int contador = 1;

        while(contador<potencia){
            resultado = resultado*numero;
            contador++;
        }
        
        return resultado;
    }
    
    /**
     * 
     * @param numero
     * @return
     */
    public static int digitos(int numero){

        int digitos = 0;
        while (numero>0){
            numero/=10;
            digitos++;
        }

        return digitos;
    }

    /**
     * 
     * @param numero
     * @return
     */
    public static int voltea(int numero){
        
        int volteado = 0;
        int temporal;

        while (numero>0) {
        temporal = numero%10;    
        volteado = volteado*10 + temporal;
        numero/=10;
        }
        return volteado;
    }

    /**
     * DÍGITO EN POSICIÓN n         PREGUNTAR ANTONIO POR ERRATA POSICIONDIGITO -1.
     * @param numero
     * @param n
     * @return
     */
    public static int digitoN(int numero, int n){
        int contador = 1;
        int n_volt = voltea(numero);
        
        while (contador<n) {
        n_volt/=10; 
        contador++;   
        }
        
        return n_volt%10;
    }
}


