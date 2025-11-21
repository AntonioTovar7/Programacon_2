package T05;

public class Ej43 {

    public static void main(String[] args) throws InterruptedException {
        
        final int MINIMO = 2;
        final String BORRAR = "\u001b[2J\u001b[H";
        int lado;
        int temporal;
        int incremento = 0;
        int contador = 1;

        try {
            System.out.print("Introduce la longitud del lado del cuadrado: ");
            lado = Integer.parseInt(System.console().readLine());
            
            temporal = lado;
    
            while(true){
                System.out.print("\033["+ elegirColor(0) + "m");
                dibujarCuadrado(lado);
                Thread.sleep(300);
                System.out.print(BORRAR);
                
                lado += incremento;
                if (lado==MINIMO){
                    incremento = 1;
                }
    
                if (lado==temporal){
                    incremento = -1;
                }
                System.out.println("\033[0m");
            }    
        } catch (Exception e) {
            System.out.println("tusputusmuertos pon un numero pringao");
        }
        
        
        

    }
    


    /**
     * 
     * @param color
     * @return
     */
    public static int elegirColor(int color){
        
        color = (int) (Math.random() * (37 - 32 + 1)+32);

        return color;


    }


    /**
     * 
     * @param numero
     * @return
     */
    public static void dibujarCuadrado(int lado){
            for (int j = 0; j<lado;j++){
                for(int i = 0; i<lado; i++){
                    if ((j == 0) || (j==lado-1) || (i==0) || (i==lado-1)){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                    
                }
                System.out.println("");
                
            }
        

        
        return ;

    }

    /**
     * 
     * @param lado
     * @return
     */
    public static boolean esPar(int lado){
       
        return lado % 2 == 0;
    }
}
