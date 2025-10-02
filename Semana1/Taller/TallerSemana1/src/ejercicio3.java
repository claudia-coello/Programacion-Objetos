import java.util.Scanner;
//Crea un programa en Java que convierta un número decimal en entero (casting explícito) y un número entero en decimal (casting implícito).
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un numero decimal: ");
        double numeroDecimal = entrada.nextDouble();

        System.out.println("Ingrese un numero entero: ");
        int numeroEntero = entrada.nextInt();

        int casteoExplicito = (int)numeroDecimal;//de decimal a entero
        double casteoImplicito = numeroEntero;//de entero a decimal

        System.out.println("El casteo implicito de " + numeroEntero + " es "+ casteoImplicito);
        System.out.println("El casteo explicito de " + numeroDecimal + " es "+ casteoExplicito);
    }
}
