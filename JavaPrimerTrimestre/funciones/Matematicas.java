package JavaPrimerTrimestre.funciones;

public class Matematicas {
    public static void main(String[] args) {
        int numero;
        int potencia;
        int n;
        int numero_elegido;
        int numeros_quitar;
        int numero_pega;
        int inicio;
        int fin;

        System.out.print("introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());

        // if (esCapicua(numero)) {
        //     System.out.println("Es capicúa");
        // }else{
        //     System.out.println("No es capicúa");
        // }

        // if (esPrimo(numero)) {
        //     System.out.println("Es primo");
        // }else{
        //     System.out.println("No es primo");
        // }

        // System.out.println(siguientePrimo(numero));

        // System.out.printf("a que numero deseas elevar el %d ",  numero);
        // potencia = Integer.parseInt(System.console().readLine());

        // System.out.println(numeroElevado(numero, potencia));

        // System.out.printf("El %d tiene %d digitos\n",numero, digitos(numero));

        // System.out.printf("El %d volteado es %d\n",numero, voltea(numero));

        // System.out.print("Qué dígito le gustaría exponer: ");
        // n = Integer.parseInt(System.console().readLine());

        // System.out.println(digitoN(numero, n));

        // System.out.print("Que dígito desea ubicar: ");
        // numero_elegido = Integer.parseInt(System.console().readLine());

        // System.out.println(posicionDeDigito(numero, numero_elegido));


        // System.out.print("Cuantos dígitos desea quitar por detras: ");
        // numeros_quitar = Integer.parseInt(System.console().readLine());

        // System.out.println(quitaPorDetras(numero, numeros_quitar));


        // System.out.print("Cuantos dígitos desea quitar por delante: ");
        // numeros_quitar = Integer.parseInt(System.console().readLine());

        // System.out.println(quitaPorDelante(numero, numeros_quitar));


        // System.out.print("Cuantos dígitos desea pegar por detras: ");
        // numero_pega = Integer.parseInt(System.console().readLine());

        // System.out.println(pegaPorDetras(numero, numero_pega));


        // System.out.print("Cuantos dígitos desea pegar por delante: ");
        // numero_pega = Integer.parseInt(System.console().readLine());

        // System.out.println(pegaPorDelante(numero, numero_pega));


        System.out.print("Que posición de inicio desea obetener: ");
            inicio = Integer.parseInt(System.console().readLine());
        System.out.print("Que posición de final desea obetener: ");
            fin = Integer.parseInt(System.console().readLine());


        System.out.println(trozoDeNumero(numero, inicio, fin));
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

    public static int posicionDeDigito(int numero, int numero_elegido){
        int posicion = 0;
        int numerin;
        int temporal;
        boolean es = false;

        numerin = voltea(numero);
        
        while ((posicion<digitos(numero)) && (!es)) {
            temporal=numerin%10;
            numerin/=10;

            if (temporal == numero_elegido) {
                es = true;
                posicion++;
            }else{
                posicion++;
            }

            if ((posicion == digitos(numero)) && (temporal!=numero_elegido)) {
                posicion = -1;
                es = true;
            }
        }
        
        return posicion;
    }

    /**
     * 
     * @param numero
     * @param numeros_quitar
     * @return
     */
    public static int quitaPorDetras(int numero, int numeros_quitar){

        for(int i = 0; i<numeros_quitar;i++){
            numero/=10;
        }

        return numero;
    }

    /**
     * 
     * @param numero
     * @param numeros_quitar
     * @return
     */
    public static int quitaPorDelante(int numero, int numeros_quitar){
        
        numero = voltea(numero);
        for(int i = 0;i<numeros_quitar;i++){
            numero/=10;
        }
        numero = voltea(numero);

        return numero;

    }

    /**
     * 
     * @param numero
     * @param numero_pega
     * @return
     */
    public static int pegaPorDetras(int numero, int numero_pega){
        for(int i = 0;i<digitos(numero_pega);i++){
            numero*=10;
        }

        return numero+numero_pega;
    }

    /**
     * 
     * @param numero
     * @param numero_pega
     * @return
     */
    public static int pegaPorDelante(int numero, int numero_pega){
            for(int i = 0;i<digitos(numero);i++){
                numero_pega*=10;
        }
        return numero+numero_pega;
    }   
     

    public static int trozoDeNumero(int numero, int inicio, int fin){
        
        int posicion = 0;

    for(int i = 0;i<digitos(numero);i++){
            posicion++;
        if(fin!=inicio){
            if (posicion==inicio) {
            numero = voltea(numero);
            posicion = 0;
            while (posicion<inicio) {
                numero/=10;
                posicion++;
            }
            }else if(posicion==fin){
            numero = voltea(numero);
            posicion = (fin-inicio);
            while (posicion<=fin) {
                numero/=10;
                posicion++;
            }
            }
        }else{
            numero = digitoN(numero, inicio);
        }
    }
        return numero;
    }
    
}


