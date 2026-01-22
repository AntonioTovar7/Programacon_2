package JavaSegundoTrimestre.Arrays;

public class Ej05 {
    public static void main(String[] args) {
        
        int maximo;
        int minimo;
        int[] valores = new int[10];

        System.out.println("Introduzca 10 valores:");

        maximo = valores[0];
        minimo = valores[0];

        for (int i = 0;i<10;i++) {
            valores[i] = Integer.parseInt(System.console().readLine());  
            if (valores[i]>maximo){maximo = valores[i];}
            if (valores[i]<minimo){minimo = valores[i];}   
        }
        
       

        for (int i = 0;i<10;i++) {
            System.out.print(valores[i]);
            
            
            if (valores[i]==maximo){System.out.print(" maximo");}
            if (valores[i]==minimo){System.out.print(" minimo");}
            System.out.println();
        }


    }
}
