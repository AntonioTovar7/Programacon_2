package EjerciciosClase;
public class Ej06 {
    public static void main(String[] args) {
        
        float base;
        float altura;
        int opcion;

        System.out.println("Seleccione una opción:");

        System.out.println("0. Salir.");
        System.out.println("1. Calcular área de un rectángulo.");
        System.out.println("2. Calcular área de un triángulo.");
        System.out.println("3. Calcular área de un cuadrado.");
        opcion = Integer.parseInt(System.console().readLine());


        switch (opcion) {
            case 0:
            break;

            case 1:
                
                System.out.println("Ingrese la base de su rectangulo (cm):");
                base = Integer.parseInt(System.console().readLine());
                
                System.out.println("Ingrese la altura de su rectangulo (cm):");
                altura = Integer.parseInt(System.console().readLine());

                System.out.printf("El área de su rectángulo es : %.2f", (base*altura));
            break;

            case 2:
                System.out.println("Ingrese la base de su triángulo (cm):");
                base = Integer.parseInt(System.console().readLine());
                
                System.out.println("Ingrese la altura de su triángulo (cm):");
                altura = Integer.parseInt(System.console().readLine());

                System.out.printf("El área de su triángulo es : %.2f", (base*altura/2));
            break;

            case 3:
            System.out.println("Ingrese la base de su rectangulo (cm):");
                base = Integer.parseInt(System.console().readLine());
                System.out.printf("El área de su rectángulo es : %.2f", (base*base));
                break;
        
            default:
            System.out.println("Opcion no válida.");
                break;
        }



    }
}
