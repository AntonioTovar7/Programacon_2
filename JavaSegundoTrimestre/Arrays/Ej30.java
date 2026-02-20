import java.util.Scanner;

public class Ej30{
    
    private static final int FILAS = 3;
    private static String coordenada;
    private static int x;
    private static int y;

    private static Scanner sc = new Scanner(System.in);

    private static char[][] tablero = new char[FILAS][FILAS];



public static void main(String[] args) {
    
    for(int i = 0; i<FILAS;i++){
        for (int j = 0; j<FILAS ; j++) {
            tablero[i][j] = ' ';
        }
    }


    while(!tablaLlena(tablero)){
        
        iniciarJuego();
        
        System.out.println(tablaLlena(tablero));
    }
    


}
    public static void pintarPrimeraLinea(){
        System.out.print("  ");
        for (int i = 0;i<=FILAS*2;i++) {
            System.out.print("-");
        }
        System.out.println();

    }

    public static void pintarTablero(){
        pintarPrimeraLinea();

        for (int i = 0;i<FILAS;i++) {
            System.out.print((char)('a' + i));
            System.out.print(" |");
            for(int j = 0; j<FILAS;j++){
                System.out.print(tablero[i][j] + "|");
            }
            System.out.println();
            pintarPrimeraLinea();
        }
        System.out.print("   ");
        for (int j = 0; j<FILAS;j++) {
            System.out.print(j+1 + " ");
        }
        System.out.println();
    }



    public static void iniciarJuego(){
            do{
            x = (int)(Math.random()*FILAS + 1) -1;
            y = (int)(Math.random()*FILAS + 1) -1;
            }while(tablero[x][y] != ' ');
            tablero[x][y] = 'O';

            pintarTablero();

            System.out.print("Introduzca una coordenada, por ejemplo b2: ");
            coordenada = sc.nextLine();
            x = coordenada.charAt(0) - 'a';
            y = coordenada.charAt(1) - '1';
            tablero[x][y] = 'X';

            
        
        }

        
        public static boolean tablaLlena(char[][] tablero){
            
            boolean lleno = true;

            for(int i = 0; i<FILAS;i++){
                for (int j = 0; j<FILAS ; j++) {
                    if (tablero[i][j] == ' ') {
                        lleno = false;
                    }
                }
            }
        
            return lleno;
        }

        public static void comprobarJuego(){
            
        }
    
}
