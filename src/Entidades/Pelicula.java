package Entidades;

import java.util.Comparator;

public class Pelicula {

    private String titulo;
    private String director;
    private int duracion;

    public Pelicula() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula {" +
                "titulo = '" + titulo + '\'' +
                ", director = '" + director + '\'' +
                ", duracion = " + duracion +
                " }";
    }

    public static Comparator<Pelicula> ordenarTitulos = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getTitulo().compareTo(p2.getTitulo());
        }
    };
    public static Comparator<Pelicula> ordenarDirectores = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            return p1.getDirector().compareTo(p2.getDirector());
        }
    };
    public static Comparator<Pelicula> ordenarDuracionesMenorMayor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            int i1 = p1.getDuracion();
            int i2 = p2.getDuracion();
            if (i1 > i2) {
                return 1;
            } else if (i1 < i2) {
                return -1;
            } else {
                return 0;
            }
        }
    };
    public static Comparator<Pelicula> ordenarDuracionesMayorMenor = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            int i1 = p1.getDuracion();
            int i2 = p2.getDuracion();

            if (i2 > i1) {
                return 1;
            } else if (i2 < i1) {
                return -1;
            } else {
                return 0;
            }
        }
    };

}