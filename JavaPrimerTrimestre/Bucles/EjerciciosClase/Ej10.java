package EjerciciosClase;
public class Ej10 {
    
    public static void main(String[] args) {
        
        final int medianoche = 86400;
        
        
        int horas;
        int minutos;
        int segundos;

        System.out.print("Introduce la hora: ");
        horas = Integer.parseInt(System.console().readLine());
        
        System.out.print(" Introduce los minutos: ");
        minutos = Integer.parseInt(System.console().readLine());

        segundos = medianoche-(horas*60 + minutos) * 60;

        System.out.printf("Desde las %d:%d hasta medianoche faltan %d segundos", horas, minutos, segundos);
    }
    
}
