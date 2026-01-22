package JavaSegundoTrimestre.Arrays;

import java.util.Scanner;

public class Ej08 {
    /*Realiza un programa que pida la temperatura media que ha hecho en 
    cada mes de un determinado año y que muestre a
     continuación un diagrama de barras horizontales con esos datos. 
     Las barras del diagrama se pueden dibujar a base de asteriscos o cualquier otro carácter. */

     public static void main(String[] args) {

        int[] temperatura = new int[12];
        String[] mes = {"enero", "febrero", "marzo", "abril", "mayo" ,"junio", "julio" ,"agosto", "septiembre", "octubre", "noviembre", "diciembre"};
       

        Scanner sc = new Scanner(System.in);

        for(int i = 0;i<12;i++){
        System.out.println("Introduzca la temperatura media de " + mes[i] +" ");
        temperatura[i] = sc.nextInt();
        }
        
        for(int i = 0;i<12;i++){
            System.out.printf("%10s |", mes[i]);
           for (int j = 0;j<temperatura[i];j++){
            System.out.print("▄");
           } 

            System.out.print(" " + temperatura[i] + "ºC\n");
        }
        sc.close();
     }
}

