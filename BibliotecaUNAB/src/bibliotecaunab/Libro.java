package bibliotecaunab;


public class Libro implements java.io.Serializable{
    private int ISBN, cantBiblioteca, cantDisponibilidad;
    private String titulo, autor;

    public Libro(int ISBN, int cantBiblioteca, int cantDisponibilidad, String titulo, String autor) {
        this.ISBN = ISBN;
        this.cantBiblioteca = cantBiblioteca;
        this.cantDisponibilidad = cantDisponibilidad;
        this.titulo = titulo;
        this.autor = autor;
    }

    public Libro() {
        this.ISBN =' ';
        this.titulo="";
        this.autor= "";
        this.cantBiblioteca=' ';
        this.cantDisponibilidad=' ';
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setCantBiblioteca(int cantBiblioteca) {
        this.cantBiblioteca = cantBiblioteca;
    }

    public void setCantDisponibilidad(int cantDisponibilidad) {
        this.cantDisponibilidad = cantDisponibilidad;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getCantBiblioteca() {
        return cantBiblioteca;
    }

    public int getCantDisponibilidad() {
        return cantDisponibilidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", cantBiblioteca=" + cantBiblioteca + ", cantDisponibilidad=" + cantDisponibilidad + ", titulo=" + titulo + ", autor=" + autor + '}';
    }
    

}
