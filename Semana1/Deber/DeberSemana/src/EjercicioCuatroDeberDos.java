import java.util.Scanner;
/*
Ejercicio 4 (opcional reto):
    • Pide nombre, edad y altura.
    • Si tiene más de 18 años y mide más de 1.60m, mostrar "Aceptado para el equipo".
    • Si no, mostrar "No cumple los requisitos".
* */
public class EjercicioCuatroDeberDos {
    public static void main(String[] args){
        String nombre = " ";
        int edad = 0;
        double altura = 0.0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su nombre:");
        nombre = entrada.nextLine();
        entrada.nextLine();//Debe limpiarse el buffer para que nos permita ingresar correctamente el siguiente dato no string

        System.out.println("Ingrese su edad:");
        edad = entrada.nextInt();//Solo se necesita limpiar el buffer cuando se cambia double/int-string

        System.out.println("Ingrese su altura:");
        altura = entrada.nextDouble();//

        System.out.println((edad >= 18 && altura > 1.6) ? "Aceptado para el equipo" : "No cumple los requisitos");
    }
}
