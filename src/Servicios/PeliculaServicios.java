package Servicios;

import Entidades.Pelicula;

import java.util.ArrayList;
import java.util.Scanner;

public class PeliculaServicios {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    ArrayList<Pelicula> arrayPeliculas = new ArrayList<>();
    Pelicula p1 = new Pelicula();

    public Pelicula crearPelicula() {

        System.out.println("Ingresa el nombre de la película");
        p1.setTitulo(sc.next());

        System.out.println("Ingresa el nombre del director de " + p1.getTitulo());
        p1.setDirector(sc.next());

        System.out.println("Ingresa la duración (en horas) de " + p1.getTitulo());
        p1.setDuracion(sc.nextInt());

        arrayPeliculas.add(p1);
        String resp;
        boolean noAgregarMas = false;

        do {
            System.out.println("¿Quieres ingresar otra película? S/N");
            resp = sc.next();
            while (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")) {
                System.out.println("Respuesta incorrecta. Debe ser S o N");
                resp = sc.next();
            }
            if (resp.equalsIgnoreCase("s")) {
                agregarMasPelis();
            } else {
                noAgregarMas = true;
            }
        } while (!noAgregarMas);


        return p1;
    }

    public void agregarMasPelis() {
        Pelicula p1 = new Pelicula();

        System.out.println("Ingresa el nombre de la nueva película");
        p1.setTitulo(sc.next());

        System.out.println("Ingresa el nombre del director de " + p1.getTitulo());
        p1.setDirector(sc.next());

        System.out.println("Ingresa la duración (en horas) de " + p1.getTitulo());
        p1.setDuracion(sc.nextInt());
        arrayPeliculas.add(p1);

    }

    public void mostrarPelis() {

        System.out.println("Estas son todas las películas agregadas");

        for (Pelicula elemento : arrayPeliculas) {
            System.out.println(elemento.getTitulo());
        }
    }

    public void mostrarPelisUnaHora() {

        System.out.println("Estas son todas las películas con más de 1 hora de duración");

        for (Pelicula elemento : arrayPeliculas) {
            if (elemento.getDuracion() > 1) {
                System.out.println(elemento.getTitulo());
            }
        }

    }

    public void ordenarDuracionMayorAMenor() {

        System.out.println("\nOrdenados por duración de mayor a menor");

        arrayPeliculas.sort(Pelicula.ordenarDuracionesMayorMenor);
        for (Pelicula objeto : arrayPeliculas) {
            if (p1.getDuracion() == 1) {
                System.out.println("Duración: " + objeto.getDuracion() + " hora. Título: " + objeto.getTitulo() + " Director: " + objeto.getDirector());
            } else {
                System.out.println("Duración: " + objeto.getDuracion() + " horas. Título: " + objeto.getTitulo() + " Director: " + objeto.getDirector());
            }
        }

    }

    public void ordenarDuracionMenorAMayor() {

        System.out.println("\nOrdenados por duración de menor a mayor");

        arrayPeliculas.sort(Pelicula.ordenarDuracionesMenorMayor);
        for (Pelicula objeto : arrayPeliculas) {
            if (p1.getDuracion() == 1) {
                System.out.println("Duración: " + objeto.getDuracion() + " hora. Título: " + objeto.getTitulo() + " Director: " + objeto.getDirector());
            } else {
                System.out.println("Duración: " + objeto.getDuracion() + " horas. Título: " + objeto.getTitulo() + " Director: " + objeto.getDirector());
            }
        }

    }

    public void ordenarPorTitulo() {

        System.out.println("\nOrdenados por títulos");

        arrayPeliculas.sort(Pelicula.ordenarTitulos);
        for (Pelicula objeto : arrayPeliculas) {
            if (p1.getDuracion() == 1) {
                System.out.println(" Título: " + objeto.getTitulo() + " Director: " + objeto.getDirector() + " Duración: " + objeto.getDuracion() + " hora");
            } else {
                System.out.println(" Título: " + objeto.getTitulo() + " Director: " + objeto.getDirector() + " Duración: " + objeto.getDuracion() + " horas");
            }
        }

    }

    public void ordenarPorDirector() {
        System.out.println("\nOrdenados por directores");

        arrayPeliculas.sort(Pelicula.ordenarDirectores);
        for (Pelicula objeto : arrayPeliculas) {
            if (p1.getDuracion() == 1) {
                System.out.println("Director: " + objeto.getDirector() + " Título: " + objeto.getTitulo() + " Duración: " + objeto.getDuracion() + " hora");
            } else {
                System.out.println("Director: " + objeto.getDirector() + " Título: " + objeto.getTitulo() + " Duración: " + objeto.getDuracion() + " horas");
            }
        }
    }

    public void menu() {
        crearPelicula();
        int option;
        boolean salir = false;
        do {
            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Mostrar todas películas agregadas");
            System.out.println("2. Motrar películas con más de una hora de duración");
            System.out.println("3. Ordenar y mostrar las películas de acuerdo a su duracion (de mayor a menor)");
            System.out.println("4. Ordenar y mostrar las películas de acuerdo a su duracion (de menor a mayor)");
            System.out.println("5. Ordenar y mostrar las películas por título, alfabéticamente (a - z)");
            System.out.println("6. Ordenar y mostrar las películas por nombre del director, alfabéticamente (a - z)");
            System.out.println("7. Salir");
            option = sc.nextInt();

            switch (option) {
                case 1:
                    mostrarPelis();
                    break;
                case 2:
                    mostrarPelisUnaHora();
                    break;
                case 3:
                    ordenarDuracionMayorAMenor();
                    break;
                case 4:
                    ordenarDuracionMenorAMayor();
                    break;
                case 5:
                    ordenarPorTitulo();
                    break;
                case 6:
                    ordenarPorDirector();
                    break;
                case 7:
                    salir = true;
                    break;
            }

        } while (!salir);

        System.out.println("Nos vemos pronto. Que tengas un lindo día :D");
    }

}
