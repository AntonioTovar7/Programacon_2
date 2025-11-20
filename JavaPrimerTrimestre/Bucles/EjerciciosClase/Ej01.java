package EjerciciosClase;


public class Ej01 {
    public static void main(String[] args) {
        int edad;
        System.out.println("Introduzca su edad:");

        edad = Integer.parseInt(System.console().readLine());

        if (edad<18){
            System.out.println("Eres menor de edad.");
            
        }else if (edad >=65){
            System.out.println("Estas jubilado/a!");
        }else if(edad<0){
            System.out.println("No puedes tener edad negativa lambebicho");
        }else {
            System.out.println("Estas en activo!");
        }
    }
}
