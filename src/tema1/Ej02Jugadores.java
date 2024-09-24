
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        
        double altura;
        double total=0;
        double promedio;
        
        double [] jugadores;
        
        jugadores = new double[15];      
       
        for (int i = 0; i < jugadores.length ; i++){
            System.out.println("Ingrese altura");
            altura = Lector.leerDouble();
            jugadores[i]=altura;
            total= total+altura;
        }
        
        
        promedio = total/15;
        
        for (int i = 0; i < jugadores.length ; i++){
            System.out.println(jugadores[i]);
        }
        
        System.out.println("promedio es"+ promedio);
    }
    
}
