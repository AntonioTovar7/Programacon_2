package JavaSegundoTrimestre.Arrays;
import java.util.Scanner;

public class Ej28 {

    static final int FILAS = 4;
    static final int COLUMNAS = 5;

    static char[][] tablero = new char[FILAS][COLUMNAS];
    static int minaX, minaY, tesoroX, tesoroY;

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        
        inicializarTablero();

        colocarMinaYTesoro();


        boolean finJuego = false;

        System.out.println("¡BUSCA EL TESORO!");

        while (!finJuego) {
            mostrarTablero();

            System.out.print("Coordenada x: ");
            int x = sc.nextInt();

            System.out.print("Coordenada y: ");
            int y = sc.nextInt();

            if (x == minaX && y == minaY) {
                System.out.println("¡BOOOM! Lo siento, has perdido.");
                finJuego = true;

            } else if (x == tesoroX && y == tesoroY) {
                System.out.println("¡Enhorabuena! ¡Has encontrado el tesoro!");
                finJuego = true;
                tablero[tesoroY][tesoroX] = 'T';
                tablero[minaY][minaX] = 'M';
            } else {
                tablero[y][x] = 'X';
                if (Math.abs(x-minaX)<=1 && Math.abs(y-minaY)<=1 ) {
                    System.out.println("Cuidado, hay una mina cerca...");
                }
            }
        }

        mostrarTableroFinal();
    }


    // Inicio tablero en blanco
    public static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Muestra tablero jugando
    public static void mostrarTablero() {
        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + "|");
                for(int j = 0;j<COLUMNAS;j++){
                System.out.print(" " + tablero[i][j]);
                }
            
            System.out.println();
        }

        System.out.println("  -----------");
        System.out.print("   ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Coloca la mina y el tesoro en posiciones aleatorias distintas
    public static void colocarMinaYTesoro() {
        

        minaX = (int)(COLUMNAS * Math.random());
        minaY = (int)(FILAS * Math.random());

        do {
            tesoroX = (int)(COLUMNAS * Math.random());
            tesoroY = (int)(FILAS * Math.random());
        } while (tesoroX == minaX && tesoroY == minaY);
    }



    // Muestra el tablero al final y revela el tesoro y la mina
    public static void mostrarTableroFinal() {
        
        tablero[tesoroY][tesoroX] = 'T';
        tablero[minaY][minaX] = 'M';
        
        System.out.println("\nTABLERO FINAL:");

        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + "|");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }

        System.out.println("  ---------");
        System.out.print("   ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
