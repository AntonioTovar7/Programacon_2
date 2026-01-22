package JavaSegundoTrimestre.Arrays;

import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        
        int[][] coordenadas = new int[3][3];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<3; i++){
            for(int j = 0;j<3;j++){
            System.out.printf("Introduzca el valor de la fila %d y columna %d: ", i, j);
         
            coordenadas[i][j] = sc.nextInt();
            }
        
        }
        for(int i = 0;i<3; i++){
            for(int j = 0;j<3;j++){
            System.out.print(coordenadas[i][j] + " ");
            }
        System.out.println();
        }
    }
}
