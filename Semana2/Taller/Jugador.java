import java.util.Scanner;
/*
* Problema: Jugadores de un equipo de fútbol. Cada jugador tiene un nombre, una posición en el
campo, una edad y un número de camiseta.
Objetivo: Desarrollar una clase en Java llamada Jugador que tenga los atributos y un método
para mostrar la información del jugador. Luego, crear tres objetos de esta clase, cada uno
representando un jugador diferente.
Realizar EL REGISTRO de los atributos con datos quemados y utilizando Scanner combinar
* */
public class Jugador {
    String nombre, posicion;
    int edad, camiseta;

    public Jugador(String nombre, String posicion, int edad, int camiseta){
        this.nombre     = nombre;
        this.posicion   = posicion;
        this.edad       = edad;
        this.camiseta   = camiseta;
    }

    void mostrarDatos(){
        System.out.println("Nombre: "   + nombre);
        System.out.println("Posicion: " + posicion);
        System.out.println("Edad: "     + edad);
        System.out.println("Camiseta: " + camiseta);
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombreJugador, posicionJugador;
        int edadJugador, camisetaJugador;

        System.out.println("Ingrese el nombre del primer jugador");
        nombreJugador = entrada.nextLine();
        System.out.println("Ingrese la posicion del primer jugador");
        posicionJugador = entrada.nextLine();
        System.out.println("Ingrese la edad del primer jugador");
        edadJugador = entrada.nextInt();
        System.out.println("Ingrese el numero de camisa del primer jugador");

        entrada.nextLine();
        Jugador primerJuagador = new Jugador(nombreJugador, posicionJugador, 23, 15);

        System.out.println("Ingrese el nombre del segundo jugador");
        nombreJugador = entrada.nextLine();
        System.out.println("Ingrese la posicion del segundo jugador");
        posicionJugador = entrada.nextLine();

        Jugador segundoJugador = new Jugador(nombreJugador, posicionJugador, 30, 10);
        entrada.nextLine();

        System.out.println("Ingrese el nombre del tercer jugador");
        nombreJugador = entrada.nextLine();
        System.out.println("Ingrese la posicion del tercer jugador");
        posicionJugador = entrada.nextLine();

        Jugador tercerJugador = new Jugador(nombreJugador, posicionJugador, 21, 11);

        primerJuagador.mostrarDatos();
        segundoJugador.mostrarDatos();
        tercerJugador.mostrarDatos();

    }
}

