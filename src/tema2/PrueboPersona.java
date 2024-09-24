
package tema2;

import PaqueteLectura.Lector;

public class PrueboPersona {
    public static void main(String[] args){
        
        
        Persona persona1=new Persona("PEPE",123,5);
        System.out.println(persona1.toString());
        
        Persona persona2=new Persona();
        
        System.out.println("ingrese nombre");
        persona2.setNombre(Lector.leerString());
        System.out.println("dni");
        persona2.setDNI(Lector.leerInt());
        System.out.println("edad");
        persona2.setEdad(Lector.leerInt());
      
        System.out.println(persona2.toString());
        
        
        System.out.println("DNI de persona2: " + persona2.getDNI());
        System.out.println("Edad de persona2: " + persona2.getEdad());
        System.out.println("Nombre de persona2: " + persona2.getNombre());
    }
}
