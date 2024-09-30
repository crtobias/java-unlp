
package Practicaexamenes;
//link de la consigna
// https://drive.google.com/drive/folders/1GZniXTM3lK3YbRfANWw4uEDnE3IztOkJ 




//clase empresa(n,nombre,direccion)
//      
//        nombre
//        direccion
//

// persona donde deriva dirctor y encargado 


//  clase director
//        nombre 
//        dni 
//        ingreso 
//        sueldo
//  unic  monto viaticos
//
//    (n)  array de encargador
//  clase encargados de sucursales 1..n
//        nombre
//        dni
//        ingreso 
//        sueldo
//  unic  empleados
//        
        
public class Empresa {
    private String nombre;
    private String direccion;
    private int sucursales;
    
    //array de encargadors hasta sucursales
    //variable de director

    public Empresa(String nom,String dire,int s) {
        this.nombre=nom;
        this.direccion=dire;
        this.sucursales=s;
    }
}

public class Persona{
    private String nombre;
    private int dni;
    private int sueldo;
    private int ingreso;
    
    
    public Persona(String n, int d, int s, int i){
        this.nombre = n;
        this.dni =d;
        this.sueldo = s;
        this.ingreso = i;
    }
    
    public String getNombre(){
        return nombre;
    }
}


public class Encargado extends Persona{
    private int empleados;
    
       public Encargado(String n, int d, int s, int i,int emp){
           super(n,d,s,i);
           this.empleados=emp;
       }
}


public class Director extends Persona{
    private int viaticos;
    
       public Director(String n, int d, int s, int i,int via){
           super(n,d,s,i);
           this.viaticos=via;
       }
}