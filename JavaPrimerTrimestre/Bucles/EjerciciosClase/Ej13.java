package EjerciciosClase;

import java.util.Scanner;

public class Ej13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = (int) (Math.random() * 100);
        int max = 100;
        int min = 0;
        int caso;
        
        System.out.println("Piensa un número del 1 al 100, intentaré adivinarlo en solo 5 intentos, pulsa INTRO cuando estés preparado:");
        sc.nextLine();
        

        for (int i = 0; i<5;i++){
           
            numero = (int) (Math.random() * (max - min) + min);
            System.out.printf("Es el %d?\n", numero);

            System.out.println("El numero que estás pensando es: 1) mayor, 2) menor, 3) igual");
            caso = Integer.parseInt(System.console().readLine());

                switch (caso) {
                    case 1:
                        min = numero+1;
                        break;
                    
                    case 2:
                        max = numero-1;
                        break;
                    case 3:
                        System.out.println("He acertado!");
                        i = i +5;
                        break;
                    default:
                        System.out.println("Escoge otra opción que sea válida");
                        break;
                }
        }

    }

}
