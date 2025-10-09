package JavaPrimerTrimestre.EjerciciosTema3;

public class Ejercicio3 {
    public static void main(String[] args) {
        Float pesetas_por_euro = (float) 166.38;
        int pesetas;

        System.out.println("Introduzcaa la cantidad que quiere convertir:");
        pesetas = Integer.parseInt(System.console().readLine());

        System.out.println(pesetas+" pesetas son " + pesetas/pesetas_por_euro + " euros");

    }
}
