package T05;

public class Ej13 {
    public static void main(String[] args) {

        int numero;
        int contador = 2;
        boolean esprimo = true;

        System.out.print("Introduzca un número para comprobar si es primo: ");
            numero = Integer.parseInt(System.console().readLine());

        while ((contador<(numero/2)) && (esprimo)){
            if(numero%contador==0){
                esprimo = false;
            }
            contador++;
        }
        if (esprimo == true){
            System.out.printf("El %d, es primo",numero);
        }else{
            System.out.printf("El %d, no es primo",numero);
        }
    }   
}
