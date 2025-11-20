package EjerciciosClase;

public class Ej12 {
    public static void main(String[] args) {
        
        int num;

        System.out.print("Introduce un número entero: ");
        num = Integer.parseInt(System.console().readLine());

        if (num%2==0) {
            if (num%5==0){
            System.out.println("Tu numero es \033[1m par y es divisible \033[0m entre 5");
        }else{
            System.out.println("Tu numero es \033[1m par y no es divisible \033[0m entre 5");
        }
        
        }else {
            if (num%5==0){
                System.out.println("Tu numero es \033[1m impar y es divisible \033[0m entre 5");
            }else{
                System.out.println("Tu numero es \033[1m impar y no es divisible \033[0m entre 5");
            }
        }

    }
}
