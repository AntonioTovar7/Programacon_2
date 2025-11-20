package T05;
public class Ej25{
    public static void main(String[] args) {
        
        int numero;
        int factorial = 1;
        int numero2;;

        System.out.print("introduzca un número: ");
        numero = Integer.parseInt(System.console().readLine());
        numero2 = numero;

        if ((numero == 0) || (numero == 1)){
            factorial = 1;
        }else{
            while (numero>1) {
                factorial = factorial * numero;
                numero--;
            }
        }

        System.out.printf("%d! = %d", numero2, factorial);

    }

}