public class Ej03 {

    public static void main(String[] args) {
        final int MAX = 100;
        final int MIN = 1;
        float valor;
        String resp;
        System.out.print("Introduce un valor comprendido entre 1 y 100: ");
        valor = Float.parseFloat(System.console().readLine());

        /*
        1º)

        if (valor >=5){
            System.out.println("¡Enhorabuena! ¡Has aprobado!");
        }else if(valor<0 || valor>10){
            System.out.println("Eso no es una valor válida");
        }else{
            System.out.println("Lo siento :( Has suspendido.");
        }*/

        // 2º)

        resp = (valor>=MIN && valor<=MAX)? "Enhorabuena, el valor esta dentro del rango!" : "¡Te he dicho un valor entre 1 y 100!";
        System.out.println(resp);

        
    }

}
