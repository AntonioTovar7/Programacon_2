package JavaPrimerTrimestre.EjerciciosTema3;

public class Ejercicio6 {
 
    public static void main(String[] args) {
        int base;
        int h;

        System.out.println("Área de un triángulo:\n---------------------");

        System.out.println("Introduzca la longitud de la base(cm):");
        base=Integer.parseInt(System.console().readLine());
        
        System.out.println("Introduzca la altura(cm):");
        h=Integer.parseInt(System.console().readLine());

        System.out.printf("El área de un rectángulo es %d cm²", (base*h/2));

    }
}


