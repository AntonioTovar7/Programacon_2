package JavaPrimerTrimestre.EjerciciosTema3;

public class Ejercicio4 {
    public static void main(String[] args) {
        int x;
        int y;
        
        System.out.println("Introduzca el primer número:");
        x=Integer.parseInt(System.console().readLine());
        
        System.out.println("Introduzca el segundo número:");
        y=Integer.parseInt(System.console().readLine());
        
        System.out.printf("x = %d \n", x);
        System.out.printf(("y = %d \n"), y);
        System.out.printf(("x + y= %d \n"), (x + y));
        System.out.printf(("x - y= %d \n"),( x - y));
        System.out.printf(("x / y= %d \n"), (x / y));
        System.out.printf(("x * y= %d \n"), (x * y));
    }
}
