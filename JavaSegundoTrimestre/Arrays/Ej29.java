package JavaSegundoTrimestre.Arrays;

import java.util.Scanner;

public class Ej29 {
    public static void main(String[] args) {
        
    final int FILAS = 8;
    final int COLUMNAS = 8;
    char col;
    char fil;
    int fila;
    String posicion;

    boolean[][] posiciones = new boolean[FILAS][COLUMNAS];
    int alfilX = 0;
    int alfilY = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Ingrese la posición del alfil: ");
    posicion = sc.nextLine().toLowerCase();
    col = posicion.charAt(0);
    fil = posicion.charAt(1);
    

    alfilX = col - 'a';
    alfilY = fil - '0';



    /* DIAGONALES */
    for(int i = 0; i < FILAS;i++){
        for(int j = 0; j < COLUMNAS;j++){
            if(Math.abs(i-alfilX) == Math.abs(j - alfilY) && !(i == alfilX && j == alfilY)){
                posiciones[i][j]= true;
            }
        }
    }
    
    System.out.println("El alfil puede moverse a las siguientes posiciones:");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (posiciones[i][j]) {
                    char columna = (char) ('a' + j);
                    fila = i + 1;
                    System.out.print(columna + "" + fila + " ");
                }
            }
        }








    
    }
}
