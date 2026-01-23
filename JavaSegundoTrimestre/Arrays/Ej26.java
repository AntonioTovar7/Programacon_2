package JavaSegundoTrimestre.Arrays;
import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        
        int[][] coordenadas = new int[4][5];
        int sumtotal = 0;
        int contador;

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<4; i++){
            for(int j = 0;j<5;j++){
            System.out.printf("fila %d, columna %d: ", i, j);
         
            coordenadas[i][j] = sc.nextInt();
            }

        
        }
        for(int i = 0;i<4; i++){
            contador = 0;
            for(int j = 0;j<5;j++){
            System.out.print(coordenadas[i][j] + " ");
            contador = contador + coordenadas[i][j];
            sumtotal = sumtotal + coordenadas[i][j];
            }
        System.out.println("  | " + contador);
        System.out.println();
        }
        System.out.println("-----------------");
        for(int i = 0;i<5; i++){
            contador = 0;
            for(int j = 0;j<4;j++){
            contador = contador + coordenadas[j][i];
            
            }
            
            System.out.print(contador + " ");
        }
        System.out.print(" | " + sumtotal);
        
    }
}
