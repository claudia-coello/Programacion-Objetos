import java.util.Scanner;
/*
* Ejercicio 3: Tabla de multiplicar
    • Lee un número del 1 al 10.
    • Imprime su tabla de multiplicar usando for.
* */
public class EjercicioTresDeberDos {
    public static void main(String[] args){
        int numero = 0;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese un numero entero del 1-10: ");
            numero = entrada.nextInt();

            if (numero < 1 || numero > 10) System.out.println("Por favor ingrese numeros solo del 1-10");
        }while(numero < 1 || numero > 10);

        for (int i = 1; i <= 10; i++)
            System.out.println(i + " x " + numero + " = "+ i * numero);
    }
}
