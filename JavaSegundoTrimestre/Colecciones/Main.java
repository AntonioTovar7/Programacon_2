
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ColeccionDiscos miEstanteria = new ColeccionDiscos(); // Instanciamos la colección
        int opcion = 0;

        do {
            System.out.println("\n=== GESTIÓN DE DISCOS ===");
            System.out.println("1. Añadir disco");
            System.out.println("2. Ver colección");
            System.out.println("3. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.print("Introduce el código: "); String c = sc.nextLine();
                    System.out.print("Introduce el título: "); String t = sc.nextLine();
                    System.out.print("Introduce el artista: "); String a = sc.nextLine();
                    System.out.print("Introduce el género: "); String g = sc.nextLine();
                    System.out.print("Introduce duración (min): "); int d = sc.nextInt();

                    // Creamos el objeto y lo mandamos a la colección
                    Disco nuevoDisco = new Disco(c, t, a, g, d);
                    miEstanteria.añadirDisco(nuevoDisco);
                    break;

                case 2:
                    miEstanteria.mostrarDiscos();
                    break;

                case 3:
                    System.out.println("Cerrando el programa. ¡Adiós!");
                    break;

                default:
                    System.out.println("Opción incorrecta, intenta de nuevo.");
            }
        } while (opcion != 3);

        sc.close();
    }
}