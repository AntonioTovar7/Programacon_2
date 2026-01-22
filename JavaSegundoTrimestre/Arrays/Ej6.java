package  JavaSegundoTrimestre.Arrays;
public class Ej6{
    public static void main(String[] args) {
        
        int ultimo;
        int[] valores = new int [15];


        for (int i = 0;i<15;i++) {
            valores[i] = Integer.parseInt(System.console().readLine());   
        }
        for (int i = 0;i<15;i++) {
            System.out.print(" " + valores[i] + " |");
        }
        ultimo = valores[14];
        System.out.println("\n------------------------------------------------------------------");
        for(int i = 14; i>0;i--){
            
        valores[i] = valores[i - 1];
        }
        valores[0] = ultimo;

        for (int i = 0;i<15;i++) {
            System.out.print(" " + valores[i] + " |");
        }

        
        
    }
}