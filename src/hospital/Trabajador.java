
package hospital;

public class Trabajador {
   String nombre;
   int identificador;
   double sueldo;
    
    
    
    public Trabajador (String nombre, int identificador, double sueldo){
        this.nombre = nombre;
        this.identificador = identificador;
        this.sueldo = sueldo;
    }
    
    
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setIdentificador (int identificador){
        this.identificador = identificador;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getIdentificador(){
        return identificador;
    }
    public double getSueldo(){
        return sueldo;
    }
}
