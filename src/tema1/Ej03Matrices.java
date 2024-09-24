
package tema1;


import PaqueteLectura.GeneradorAleatorio;
public class Ej03Matrices {

    public static void main(String[] args) {
        
	GeneradorAleatorio.iniciar(); 
        
        int x=5;
        int y=5;
        int[][] matriz=new int [x][y];
        
        for(int i=0; i < x ;i++){
            for(int j=0; j < y ;j++){
                matriz[i][j]= GeneradorAleatorio.generarInt(10);
            }
        }
        
        
        for(int i=0; i < x ;i++){
            for(int j=0; j < y ;j++){
               System.out.print(matriz[i][j] + " ");
            }
             System.out.println();
        }
    }
}
