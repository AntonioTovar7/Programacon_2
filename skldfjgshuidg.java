import java.util.Random;
import java.util.Scanner;

public class skldfjgshuidg {

    static final int FILAS = 4;
    static final int COLUMNAS = 5;

    static char[][] tablero = new char[FILAS][COLUMNAS];
    static int minaX, minaY, tesoroX, tesoroY;

    static Scanner sc = new Scanner(System.in);

    // Método principal: coordina la ejecución del programa y controla el flujo del juego
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
            } else {
                tablero[y][x] = 'X';
            }
        }

        mostrarTableroFinal();
    }

    // Inicializa el tablero con espacios vacíos, lo cual es necesario para partir de un estado limpio
    static void inicializarTablero() {
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tablero[i][j] = ' ';
            }
        }
    }

    // Muestra el tablero parcial durante la partida para informar al jugador de sus intentos
    static void mostrarTablero() {
        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + "|");
            
                System.out.print(tablero[FILAS-1][COLUMNAS-1]);
            
            System.out.println();
        }

        System.out.println("  ---------");
        System.out.print("  ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");
    }

    // Coloca la mina y el tesoro en posiciones aleatorias distintas, garantizando una partida válida
    static void colocarMinaYTesoro() {
        

        minaX = (int)(1+COLUMNAS * Math.random());
        minaY = (int)(1+FILAS * Math.random());

        do {
            tesoroX = (int)(1+COLUMNAS * Math.random());
            tesoroX = (int)(1+FILAS * Math.random());
        } while (tesoroX == minaX && tesoroY == minaY);
    }



    // Muestra el tablero completo al finalizar la partida, revelando mina y tesoro
    static void mostrarTableroFinal() {
        tablero[minaY][minaX] = 'M';
        tablero[tesoroY][tesoroX] = 'T';

        System.out.println("\nTABLERO FINAL:");

        for (int i = FILAS - 1; i >= 0; i--) {
            System.out.print(i + "|");
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.print(" " + tablero[i][j]);
            }
            System.out.println();
        }

        System.out.println("  ---------");
        System.out.print("  ");
        for (int i = 0; i < COLUMNAS; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
