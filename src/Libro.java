/*
Crear un método para cargar un libro pidiendo los datos al usuario y
        luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas
 */
public class Libro {

    private String iSBN;
    private String titulo;
    private String autor;
    private int numeroDePaginas;

    public Libro(String iSBN, String titulo, String autor, int numeroDePaginas) {
        this.iSBN = iSBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public Libro() {
    }

    @Override
    public String toString() {
        return "Libro{" +
                "iSBN='" + iSBN + '\'' +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                '}';
    }
}



