package hijos;
import superior.Disco;
import superior.toStringable;

public class Dvd extends Disco implements toStringable {
    // Atributos
    private String director;

    // Constructor
    public Dvd(String titulo, String director, String genero, int duracion, String comentario, boolean posesion) {
        super(titulo, genero, comentario, duracion, posesion);
        this.director = director;
    }

    // Getters & Setters
    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    // Método ToString desde interfaz
    @Override
    public String toString() {
        return "Dvd [Título = " + titulo + ", Género = " + genero + ", Comentario = " + comentario + ", Duración = " + duracion
                + ", Posesión = " + posesion + ", Director = " + director + "]";
    }
}