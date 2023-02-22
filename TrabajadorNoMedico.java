package hospital;

public class TrabajadorNoMedico extends Trabajador {
    private Tipos tipo;
    enum Tipos{
        enfermeros, recepcionistas, limpiadores
    }
    private Area areatrabajo;
    enum Area{
        pediatría, cardiología, traumatología
    }
    public TrabajadorNoMedico(String nombre, int identificador, double sueldo) {
        super(nombre, identificador, sueldo);
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
    public void setTipo( Tipos tipo){
        this.tipo= tipo;
    }
    public void setArea(Area areatrabajo){
        this.areatrabajo= areatrabajo;
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
    public Tipos getTipo(){
        return tipo;
    }
    public Area getAreatrabajo(){
        return areatrabajo;
    }
}
