package EjerciciosClase;
public class Ej15 {
    public static void main(String[] args) {
        
        int numero;

        System.out.println("Introduce un numero entero:");
        numero = Integer.parseInt(System.console().readLine());

        numero = Math.abs(numero)%10;

        System.out.printf("El último dígito del nñumero introducido es el %d.\n", numero);
    }
}
