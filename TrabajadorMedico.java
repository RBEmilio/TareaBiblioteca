package hospital;

public class TrabajadorMedico extends Trabajador {
    private Especialidad especialidad;
    enum Especialidad{
        cardiólogos, pediatras, cirujanos
    }
    private int colegiado;
    private int totalpacientes;
    
    public TrabajadorMedico(String nombre, int identificador, double sueldo) {
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
    public void setEspecialidad( Especialidad especialidad){
        this.especialidad = especialidad;
    }
    public void setColegiado ( int colegiado){
        this.colegiado = colegiado;
    }
    public void setTotalpacientes( int totalpacientes){
        this.totalpacientes = totalpacientes;
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
    public Especialidad getEspecialidad(){
        return especialidad;
    }
    public int getColegiado(){
        return colegiado;
    }
    public int getTotalpacientes(){
        return totalpacientes;
    }
}
