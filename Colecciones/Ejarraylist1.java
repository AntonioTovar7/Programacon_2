package Colecciones;

import java.util.ArrayList;
import java.util.Scanner;


public class Ejarraylist1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String entrada;
        String color;
        int i = 1;

        ArrayList<String> listaColores = new ArrayList<>();
        
        
        System.out.println("Introduce colores (Enter vacío para terminar):");
        
        System.out.print("Color: ");
        entrada = scanner.nextLine();

        // El bucle se ejecuta solo mientras la entrada NO esté vacía
        while (!entrada.equals("")) {
            listaColores.add(entrada);
            
            System.out.print("Color: ");
            entrada = scanner.nextLine();
        }
        System.out.println("\nColores guardados:");

        for (String item : listaColores) {
            
            System.out.println("Color " + (i) + ": " + item);
            i++;
        }
    }
}
