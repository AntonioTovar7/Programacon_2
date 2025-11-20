package T05;

public class Ej21 {
    public static void main(String[] args) {
        
        int altura;
        
        

        System.out.print("Introduzca la altura de la pirámide: ");
            altura = Integer.parseInt(System.console().readLine());

        for(int fil = 1 ; fil<=altura ; fil++){
            //ESPACIOS
            for(int col = 1 ; col<=(altura-fil);col++){
                System.out.print(" ");
            }
            //IZQ
            for(int col = 1 ; col<=fil ;col++ ){
                System.out.print(col);
            }
            //DER
            for(int col = fil-1 ; col>0 ;col-- ){
                System.out.print(col);
                
            }
            System.out.println("");

        


        }   
    }
}
