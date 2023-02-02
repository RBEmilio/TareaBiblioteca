
package libro;

public class testLibro {

public static void main(String[] args) {
    Libro libro1 = new Libro("La Celestina", "Fernando de Rojas", 30, 10);
    System.out.println(libro1);

boolean prestado = libro1.devolucion();
     if (prestado) {
         System.out.println("El libro ha sido prestado");
}
}
}
