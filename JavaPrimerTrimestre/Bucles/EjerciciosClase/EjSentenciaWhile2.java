


public class EjSentenciaWhile2{

    public static void main(String[] args){

        int edad;
        System.out.println("Introduce tu edad: ");
        edad = Integer.parseInt(System.console().readLine());

        for (int i = 0; i<=edad; i++){

            System.out.printf("%d,", i);
        }
    }
}