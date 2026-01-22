package JavaSegundoTrimestre.Arrays;

public class Ej12 {  
        public static void main(String[] args) {
          
          int fila;
          int columna;
          int[][] coordenadas = new int[3][3];
          
          
          coordenadas[0][0] = 1;
          coordenadas[0][1] = 2;
          coordenadas[0][2] = 3;
          coordenadas[1][0] = 4;
          coordenadas[1][1] = 5;
          coordenadas[1][2] = 6;
          coordenadas[2][0] = 7;
          coordenadas[2][1] = 8;
          coordenadas[2][2] = 9;
          
          System.out.println("Introduzca la fila deseada:");
          fila = Integer.parseInt(System.console().readLine());
          
          
          System.out.println("Introduzca la columna deseada:");
          columna = Integer.parseInt(System.console().readLine());

          if(fila > 3 || columna > 3){
            System.out.println("No existe esa fila/columna");
          }else{
          System.out.println(coordenadas[fila][columna]);
          }



        }
        
      }

