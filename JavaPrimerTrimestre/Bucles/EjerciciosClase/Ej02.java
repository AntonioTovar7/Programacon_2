package EjerciciosClase;
public class Ej02 {
    public static void main(String[] args) {
        
        float nota;
        String resp;
        System.out.print("¿Qué nota has sacado en el último examen? ");
        nota = Float.parseFloat(System.console().readLine());

        /*
        1º)

        if (nota >=5){
            System.out.println("¡Enhorabuena! ¡Has aprobado!");
        }else if(nota<0 || nota>10){
            System.out.println("Eso no es una nota válida");
        }else{
            System.out.println("Lo siento :( Has suspendido.");
        }*/

        // 2º)

        // resp = (nota>=5)? "Has aprobado" : "Has suspendido";
        // System.out.println(resp);

        /*3º)*/
        if (nota<0 || nota >10){
            System.out.println("Nota no válida");
        }else{
            resp = (nota>=5)? "Has aprobado":"Has suspendido";
            System.out.println(resp);
            
        }
    }

}
