package JavaPrimerTrimestre.EjerciciosTema3;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double num1;
        double iva;

        Scanner sc = new Scanner(System.in);

        
        System.out.print("Introduzca la base imponible (precio del artículo sin IVA): ");
        num1 = sc.nextDouble();

        iva = num1 * 0.21;

        System.out.printf("Base imponible:\t\t%.2f\n", num1);
        System.out.printf("IVA (21%%):\t\t%.2f\n", iva);
        System.out.println("-------------------------------");
        System.out.printf("Total:\t\t\t%.2f\n", (num1 + iva));

        sc.close();
    }
}