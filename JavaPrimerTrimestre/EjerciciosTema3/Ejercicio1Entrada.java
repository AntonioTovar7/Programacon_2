package JavaPrimerTrimestre.EjerciciosTema3;

public class Ejercicio1Entrada {
    public static void main(String[] args) {
        int num1;
        int num2;
        System.out.println("Este programa multiplica dos número enteros.");
        System.out.println("Por favor, introduzca el primer número:");
        num1 = Integer.parseInt(System.console().readLine());
        
        System.out.println("Por favor, introduzca el segundo número:");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.println(num1 + ("*") + num2 + ("=") + num1*num2);
    }
}
