package JavaSegundoTrimestre.Arrays;

public class Ej07 {
    public static void main(String[] args) {
        
        int cambiado;
        int nuevo;
        int[] valores = new int[100];

        System.out.println("Introduzca 2 valores:");
        cambiado = Integer.parseInt(System.console().readLine());
        nuevo = Integer.parseInt(System.console().readLine());
        

        for (int i = 0;i<100;i++) {
            valores[i] = (int)(Math.random() * (20 - 1 + 1)) + 1;
            System.out.print(valores[i]+" ");
        }
        System.out.println("\n--------------------------------------------------------------");
        for (int i = 0;i<100;i++) {
            

            if (valores[i]==cambiado){
                System.out.print("\""+nuevo+ "\" ");
            }else{
                System.out.print(valores[i]+ " ");
            }
        }


}
}