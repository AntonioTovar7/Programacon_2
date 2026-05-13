/**
 * Programación
 * Modelo Vista Controlador - Gestión Calistenia
 * @author Antonio J. Sánchez (Adaptado por SUPERMAN)
 */

import controladores.FrontController;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) throws Exception {

        int opcion;
        
        try {
            // creamos el CONTROLADOR FRONTAL
            FrontController controlador = new FrontController();

            do {
                menu();   // mostramos el menú de parques
                
                String entrada = System.console().readLine();
                opcion = Integer.parseInt(entrada);
                
                controlador.despachar(opcion);
                
                if (opcion != 0) {
                    pausa();
                }

            } while(opcion != 0);

        } catch (SQLException sqle) {
            System.out.println("Se ha producido un error con la base de datos.\n" + sqle.getMessage());
        } catch (NumberFormatException nfe) {
            System.out.println("Error: Por favor, introduce un número válido.\n");
            pausa();
        }
    }

    /**
     * Pausa la ejecución hasta pulsar ENTER
     */
    private static void pausa() {
        System.out.println("\nPULSA ENTER PARA CONTINUAR....");
        System.console().readLine();
    }

    /**
     * Menú principal del sistema
     */
    private static void menu() {
        // Limpia la pantalla (depende del terminal)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("GESTIÓN DE PARQUES\n===========================================");
        System.out.println("1. Listar parques de entrenamiento");
        System.out.println("2. Registrar nuevo parque");
        System.out.println("3. Buscar parque por código");
        System.out.println("4. Editar información del parque (Próximamente)");
        System.out.println("5. Eliminar parque");
        System.out.println("");
        System.out.println("6. Listar atletas");
        System.out.println("0. Salir");
        System.out.print("\nOpcion? ");
    }
}