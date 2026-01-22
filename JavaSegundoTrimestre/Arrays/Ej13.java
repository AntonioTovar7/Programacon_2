package JavaSegundoTrimestre.Arrays;

public class Ej13 {

    public static void main(String[] args) {
        int fila = 0;
        int columna = 0;
        int contador = 0;
        int posicion;
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
        
        System.out.println("Introduzca la posición deseada:");
        posicion = Integer.parseInt(System.console().readLine());

        if(posicion > 8 || posicion < 0){
            System.out.println("No existe esa posición");
        }else{
            
            for(int i = 0; i<3;i++){
                for(int j = 0; j<3;j++){
                contador++;
                    if(contador==(posicion+1)){
                    System.out.println(coordenadas[i][j]);
                    }
                }
            }
    
        }

    }
        
}


