public class A {
    public static void main(String[] args) {
        int altura;
        int i = 0;
        int j = 0;
        int l = 0;
        int espacios = 0;
        int espacios2 = 0;
        int barrita = 0;


        System.out.print("Introduce la altura de la A(número mayor o igual a 3): ");
        altura = Integer.parseInt(System.console().readLine());
        espacios2 = (altura-1)*(2);
        
        
        for (i = 0;i < altura; i++){
            for (j = 0; j<espacios2; j++){

                System.out.print(" ");
            }
            espacios2--;
            System.out.print("***");

            for (int k = 0; k < espacios; k++){
                if (barrita != (int) ((altura +1 )/2)){
                    System.out.print(" ");
                    }else{
                        while(l<(espacios2)){
                            System.out.print("*");
                            l++;
                    }
                }
            }
            espacios+=2;
            System.out.println("***");
            
            barrita++;
                }

    }
}
