package JavaSegundoTrimestre.Arrays;

import java.util.Scanner;

public class Ej30 {
    private static final int FILAS = 3;
    private static int filaj;
    private static int columnaj;
    private static int filam;
    private static int columnam;

    private static boolean si;

    private static final char VACIO = ' ';

    private static String entrada;

    private static char[][] tablero = new char[FILAS][FILAS];
    private static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
    //INICIALIZAR TABLERO VACÍO
    for(int i = 0; i<FILAS;i++){
        for(int j = 0;j<FILAS;j++){
            tablero[i][j] = ' ';
        }
    }
    
    for(int i = 0;i<(int)((FILAS*FILAS)/2)+1;i++){
    pintarTablero();
    iniciarJuego();
    }
    pintarTablero();
    
    
    }
    
    public static void filaCompleta(){
        System.out.print("  ");
        for(int i = 0; i<=(FILAS*2);i++){
            System.out.print("░");

        }
        System.out.println();
    }

    public static void pintarTablero(){
        filaCompleta();
        for(int i= 0;i<FILAS;i++){
            System.out.print((char)('a'+i));
            System.out.print(" ░");;
            for(int j = 0;j<FILAS;j++){

                System.out.print(tablero[i][j] + "░");
            }
            System.out.println();
            filaCompleta();
        }
        System.out.print("   ");
        for(int i=1;i<=FILAS;i++){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    
    public static void iniciarJuego(){
        
        System.out.print("Introduzca las coordenadas, por ejemplo b2: ");
        entrada = sc.nextLine();
        filaj = entrada.charAt(0)-'a';
        columnaj = entrada.charAt(1)-'1';
        tablero[filaj][columnaj] = 'X';
        
        do{
        filam = (int)(Math.random()*FILAS+1)-1;
        columnam = (int)(Math.random()*FILAS+1)-1;
        if(tablero[filam][columnam] == VACIO){
            si = true;
        }else{
            si = false;
        }
        }while(!si);
            tablero[filam][columnam] = 'O';

    }

}
