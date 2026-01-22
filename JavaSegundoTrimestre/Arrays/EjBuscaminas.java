package JavaSegundoTrimestre.Arrays;

import java.util.Scanner;

public class EjBuscaminas {
    public static void main(String[] args) {
        
        int tesoro = 0;
        int f = 0;
        int c = 0;
        int[][] coordenadas = new int[4][5];
        Scanner sc = new Scanner(System.in);


        tesoro = generarTesoro(f, c, coordenadas);
        System.out.println(tesoro);
    }


    public static int generarTesoro(int f, int c, int[][] coordenadas){
    
        f = (int) (Math.random() * 4 + 1);
        c = (int) (Math.random() * 4 +1);

    return coordenadas[f][c] ;
    }
}


