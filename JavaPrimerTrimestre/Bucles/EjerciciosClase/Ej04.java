package EjerciciosClase;
public class Ej04 {
    public static void main(String[] args) {
        int num;
        System.out.println("Introduce el día de la semana: ");
        num = Integer.parseInt(System.console().readLine());

        // switch (num) {
        //     case 1, 2, 3, 4, 5:
        //         System.out.println("Dia lectivo");
        //         break;
            
        //         case 6, 7:
        //         System.out.println("Fin de semana");
        //         break;

        //     default:
        //         System.out.println("La opción introducida no es válida");
        //         break;
        // }

        if (num>=1 && num<=7) {
                if (num>=1 && num<=5){
                System.out.println("Día lectivo");
            }else {
                System.out.println("Fin de semana");
            }
        }else {
        System.out.println("Opción no válida");
        }

    }
}
