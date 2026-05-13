package vistas;

import java.util.ArrayList;
import modelos.Parque;

public class ParqueView {

    /**
     * Mostramos en pantalla los parques
     * @param parques
     */
    public void mostrarParques(ArrayList<Parque> parques) {

        System.out.println("\nLISTADO DE PARQUES\n=============================================================");
        for(Parque item: parques) {
            System.out.println(item);
        }
    }

    /**
     * Solicita los datos para crear un nuevo parque
     * @return objeto Parque o null si se cancela
     */
    public Parque solicitarParque() {

        int codPar;
        String nombre;
        String ubicacion;
        String equipamiento;

        Parque parque = null;

        System.out.print("Código del Parque (0 para volver): ");
        String entradaCod = System.console().readLine();
        codPar = Integer.parseInt(entradaCod);

        if (codPar != 0) {

            // preguntamos datos del parque a insertar
            System.out.print("Nombre: ");
            nombre = System.console().readLine();        

            System.out.print("Ubicación: ");
            ubicacion = System.console().readLine();            

            System.out.print("Equipamiento: ");
            equipamiento = System.console().readLine();            

            // creamos el parque (usando tu constructor de 4 parámetros)
            parque = new Parque(codPar, nombre, ubicacion, equipamiento);
        }

        return parque;
    }

    /**
     * Solicita el código de un parque para buscarlo o borrarlo
     * @return código en formato String (o int según prefieras en el Controller)
     */
    public int solicitarCodigo() {

        int codPar;

        System.out.println("\n=================================================================");
        System.out.print("Código del Parque (0 para volver): ");
        codPar = Integer.parseInt(System.console().readLine());

        return codPar;
    }

    /**
     * @param mensaje
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}