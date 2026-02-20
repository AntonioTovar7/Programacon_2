package JavaSegundoTrimestre.Arrays;
import java.util.Scanner;

public class Ej29{
public static void main(String[] args) {
    final int X = 8;
    final int Y = 8;
    int fil;
    int col;
    String posicion;

    boolean tablero[][] = new boolean[Y][X];

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca la posicion del alfil: ");
    posicion = sc.nextLine().toLowerCase();

    col = posicion.charAt(0) - 'a';
    fil = posicion.charAt(1) - '1';

    for (int i = 0; i < Y; i++) {
        for (int j = 0; j < X; j++) {
            if (Math.abs(i - fil) == Math.abs(j - col) && !(i == fil && j == col)) {
                tablero[i][j] = true;
            }
        }
    }

    PosicionesPosibles(tablero, Y, X);

    sc.close();
}

public static void PosicionesPosibles (boolean tablero[][], int y, int x ) {
    char col = ' ';
    int fil = 0;

    System.out.print("El alfil podrá moverse a las siguientes posiciones: ");
    for (int i = 0; i < y; i++) {
        for (int j = 0; j < x; j++) {
            if (tablero[i][j]) {
                col = (char) ('a' + j);
                fil = i + 1;

                System.out.printf("%c%d ", col, fil);
            }
        }
    }
}
}