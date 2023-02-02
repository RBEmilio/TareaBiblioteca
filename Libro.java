package libro;

public class Libro {
    
private String titulo;
private String autor;
private int ejemplares;
private int prestados;

public Libro() {}

public Libro (String titulo, String autor, int ejemplares, int prestados){
    this.titulo= titulo;
    this.autor = autor;
    this.ejemplares = ejemplares;
    this.prestados = prestados;
}
    
public void setTitulo(String titulo) {
   this.titulo = titulo;
   
}

public String getTitulo() {
    return titulo;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public String getAutor() {
    return autor;
}

public void setejemplares(int ejemplares) {
    this.ejemplares = ejemplares;
}

public int getejemplares() {
    return ejemplares;
}

public void setprestados(int prestados) {
    this.prestados = prestados;
}

public int getprestados() {
    return prestados;
}



public boolean devolucion() {
    if (prestados > 0) {
        prestados--;
        return true;
}
 return false;
}

 public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Número de ejemplares: " + ejemplares + ", Número de ejemplares prestados: " + prestados;
    }
 
}
