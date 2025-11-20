package T05;
public class Ej09{
    public static void main(String[] args) {
        
        int anterior = 0;
        int actual = 1;
        int temporal;
        int n;


        System.out.print("escribe el número de dígitos de la serie de fibonaacci que quieres ver: ");
            n = Integer.parseInt(System.console().readLine());
        System.out.printf("%d, ", anterior);        
        
        for (int i = 0;i<=n;i++){
            
            System.out.printf("%d, ", actual);
            
                temporal = actual + anterior;
                anterior = actual;
                actual = temporal;
        }
    
    }   
}