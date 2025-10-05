import java.util.Scanner;
/*
*  Ejercicio 1: Notas del estudiante
    • Pide el nombre del estudiante.
    • Solicita tres notas (double).
    • Calcula el promedio.
    • Muestra si aprueba (>=7) o reprueba.
* */
public class EjercicioUnoDeberDos {
    public static void main(String[] args){
        //Inicializando variables
        Scanner entrada = new Scanner(System.in);
        String nombre = " ";
        double notaUno, notaDos, notaTres, notaPromedio;

        //Entrada al valor de las variables
        System.out.println("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Ingrese la primera nota: ");
        notaUno = entrada.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        notaDos = entrada.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        notaTres = entrada.nextDouble();

        notaPromedio = (notaUno + notaDos + notaTres) / 3;

        //Resultados
        String mensaje = (notaPromedio >= 7) ? "aprueba" : "reprueba";//operador ternario, reemplaza al if-else, guarda el resultado en una variable
        //tipoVariable nombreVariable = condicion ? resultadoVerdadero : resultadoFalso
        System.out.println("El estudiante " + nombre + " " + mensaje);

    }
}
