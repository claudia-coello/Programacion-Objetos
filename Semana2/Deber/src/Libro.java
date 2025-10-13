import java.util.Scanner;

/*Actividad 2: PRACTICA
Práctica 1: Clase Libro
Objetivo: Crear una clase con atributos, constructor y método para mostrar información.
Descripción:
        ◦ Crear la clase Libro con atributos: titulo, autor, anioPublicacion.
        ◦ Crear un constructor.
        ◦ Crear un método mostrarInformacion() que imprima los datos del libro.
        ◦ Crear 2 objetos de tipo Libro y mostrar su información.*/
public class Libro {
    String titulo, autor;
    int publicationYear;
    Scanner entrada = new Scanner(System.in);

    public Libro(String titulo, String autor, int publicationYear){
        this.titulo = titulo;
        this.autor = autor;
        this.publicationYear = publicationYear;
    }

    public void mostrarInformacion(){
        System.out.printf("Titulo: " + titulo + "\nAnio publicacion: " + publicationYear + "\nAutor: " + autor + "\n");
    }

    public static void main(String[] args) {
        Libro libroUno = new Libro("Don quijote", "Cervantes", 1500);
        libroUno.mostrarInformacion();

        Libro libroDos = new Libro("La biblia", "Desconocido", 2);
        libroDos.mostrarInformacion();
    }
}