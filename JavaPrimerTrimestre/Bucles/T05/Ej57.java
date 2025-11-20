package T05;
public class Ej57{
    public static void main(String[] args) {
        
        int altura;
        int i = 0;
        int j = 0;
        int espacios = 2;

        System.out.print("Introduce la altura de la V(número mayor o igual a 3): ");
        altura = Integer.parseInt(System.console().readLine());
        espacios = espacios*(altura-1);
        for (i = 0;i < altura; i++){
            for (j = 0; j<i; j++){

                System.out.print(" ");
            }
            System.out.print("***");

            for (int k = 0; k < espacios; k++){
            System.out.print(" ");
            }
            espacios-=2;
            System.out.println("***");
            
        }
    
    
    }
}