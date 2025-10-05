import java.util.Scanner;
/*
* Ejercicio 2: Números pares
    • Pregunta cuántos números se van a ingresar.
    • Usa un for para leer cada número.
    • Muestra cuántos números pares se ingresaron.
* */
public class EjercicioDosDeberDos {
    public static void main(String[] args){
        int cantidadNumeros = 0, contadorPares = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Cuantos numeros desea ingresar?");
        cantidadNumeros = entrada.nextInt();

        for (int i = 1; i <= cantidadNumeros; i++){
            System.out.println("Ingrese un numero: ");
            int numero = entrada.nextInt();

            if (numero%2 == 0)
                contadorPares += 1;

        }

        System.out.println("La cantidad de numero pares ingrasados es: " + contadorPares);
    }
}
