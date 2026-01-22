package JavaSegundoTrimestre.Arrays;

public class Ej10 {
    public static void main(String[] args) {
        final int MAXIMO = 10;

        int grupo;
        int temp = 0;
        boolean salir = false;
        boolean ocupado;
        int [] mesas = new int[MAXIMO];
        
        

        for (int i = 0; i < MAXIMO; i++) {
            mesas[i] = (int) (Math.random() * 5);
        }

        mostrarMesas(mesas, MAXIMO);

        while (!salir) {
            System.out.print("¿Cuantos son? (Introduzca -1 para salir del programa): ");
            grupo = Integer.parseInt(System.console().readLine());

            if (grupo == -1) {
                salir = true;
            } else if((grupo < -1) && (grupo > 4) && (grupo == 0)){
                System.out.println("El grupo tiene que ser de 1 como minimo o 4 como máximo.");
            } else {
                ocupado = false;
                while (temp < MAXIMO && !ocupado) {

                    if(mesas[temp] == 0) {
                        mesas[temp] = grupo;
                        System.out.println("Por favor sientese en la mesa " + (temp + 1));
                        ocupado = true;
                    } 
                    
                    temp++;
                }

                temp = 0;
                while (temp < MAXIMO && !ocupado) {
                    if (mesas[temp] + grupo <= 4) {
                        mesas[temp] += grupo;
                        System.out.println("Tendran que compartir mesa. Por favor sientese en la mesa " + (temp + 1));
                        ocupado = true;

                    }

                    temp++;
                }

                if (!ocupado) {
                    System.out.println("Lo sengtimos en estos momentos no hay hueco.");
                }

                mostrarMesas(mesas, MAXIMO);
               
            }
        }

    }

    public static void mostrarMesas(int[] mesas, int MAXIMO) {

        System.out.println();

        System.out.print("Mesa nº:   ");
        for (int i = 1; i <= MAXIMO; i++) {
            System.out.print(i + " ");
        }

        System.out.print("\nOcupación: ");
        for (int i = 0; i < MAXIMO; i++) {
            System.out.print(mesas[i] + " ");
        }
        System.out.println();
    }
}