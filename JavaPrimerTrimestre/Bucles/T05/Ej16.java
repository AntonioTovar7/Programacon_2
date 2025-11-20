package T05;

public class Ej16 {
    public static void main(String[] args) {
        
        int altura;
        char c;

        System.out.print("Introduzca la altura de la pirámide: ");
            altura = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca la altura de la pirámide: ");
            c = System.console().readLine().charAt(0);

        for(int fil = 1 ; fil<=altura ; fil++){
            //ESPACIOS
            for(int col = 1 ; col<=(altura-fil);col++){
                System.out.print(" ");
            }
            //CARACTER
            for(int col = 1 ; col<=2*fil-1 ;col++ ){
                System.out.print(c);
            }
            System.out.println("");

        }


    }   
}
