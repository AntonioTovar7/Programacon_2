package T6;

public class Ej11 {
    public static void main(String[] args) {
        
        final int FIL = 100;
        final int COL = 150;
        int i ;
        char c = (char)(32 + Math.random() * (126 - 32 + 1));

    for (int h = 0; h<FIL; h++){
        for (i = 0; i<COL; i++){
            c = (char)(32 + Math.random() * (126-32+1));
            System.out.printf("%c", c);
        }
        i = 0;
        System.out.println(" ");
    }

    }
}


