package JavaSegundoTrimestre.Arrays;

import java.util.Scanner;

public class Ej09 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[20];
        int[] auxiliar = new int[20];
        int j = 0;
        final int MAXIMO = 20;

        System.out.println("Array original: ");
        
        for(int i = 0;i<20;i++){
            valores[i] = (int)(Math.random()*100 + 1);
            System.out.print(valores[i]+ " ");
        }

        System.out.println("\nArray con los pares al principio: ");

        for (int i = 0 ; i<20 ; i++) {
            
            if(valores[i]%2 == 0){
                
                auxiliar[j] = valores[i]; 
                j++;         
                
            }
        }
        
        for (int i = 0 ; i<20 ; i++) {
            
            if(valores[i]%2 != 0){
                
                auxiliar[j] = valores[i]; 
                j++;         
                
            }
        }

        for(int i = 0; i<20; i++){
            valores[i] = auxiliar[i];
        }
    
        for (int i = 0; i<20;i++) {
            System.out.print(valores[i] + " ");
        }



    }
}
