import java.util.Scanner;
//Crea un programa en Java que realice operaciones de suma, resta, multiplicación, división y módulo entre dos números enteros.
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numeroUno, numeroDos;
        System.out.println("Ingrese el primer numero: ");
        numeroUno = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numeroDos = entrada.nextInt();

        int suma, resta, multiplicacion, modulo;
        double division;

        suma = numeroUno + numeroDos;
        resta = numeroUno - numeroDos;
        multiplicacion = numeroUno * numeroDos;
        modulo = numeroUno % numeroDos;
        division = numeroUno / numeroDos;

        System.out.println("La suma de los numeros es: " + suma);
        System.out.println("La resta de los numeros es: " + resta);
        System.out.println("La multiplicacion de los numeros es: " + multiplicacion);
        System.out.println("La modulo de los numeros es: " + modulo);
        System.out.println("La division de los numeros es: " + division);
    }
}
