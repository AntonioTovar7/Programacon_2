package  JavaSegundoTrimestre.Arrays;

public class Ej01{
    public static void main(String[] args){
        
        int numero;
        int[] num = new int[10];
        
        for(int i = 0; i<10;i++){
            System.out.println("Introduzca el próximo valor:");
            numero = Integer.parseInt(System.console().readLine());
            num[i] = numero;
        }

        for(int j = 0; j<10;j++){
            System.out.println(num[9-j]);
        }
        

    }
    }
    