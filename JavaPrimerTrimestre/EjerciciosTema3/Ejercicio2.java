package JavaPrimerTrimestre.EjerciciosTema3;

public class Ejercicio2 {
    public static void main(String[] args) {
        Double pesetas_por_euro = 166.38;
        int euros;

        System.out.println("Introduzcaa la cantidad que quiere convertir:");
        euros = Integer.parseInt(System.console().readLine());

        System.out.println(euros+" euros son " + euros*pesetas_por_euro + " pesetas");

    }
}
