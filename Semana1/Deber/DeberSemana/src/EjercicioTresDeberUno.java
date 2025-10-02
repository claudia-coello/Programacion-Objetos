import java.util.Scanner;
import java.util.ArrayList;
/*Ejercicio 3: Requisitos para el cuartel
Objetivo: Determinar si un estudiante cumple (≥18 años y altura ≥ 1.60 m).
Entradas: edad (int), altura (double).
Salida: “Cumple” o “No cumple”.
Reglas: edad y altura deben ser positivas.*/
public class EjercicioTresDeberUno {
    public static void main(String[] args){
        int edad = 0;
        double altura = 0.0;
        Scanner entrada =  new Scanner(System.in);
        String mensajeMostrado = " ";
        String[] mensaje = {"Cumple","No cumple"};

        //validacion edad positiva
        do {
            System.out.println("Ingrese su edad: ");
            edad = entrada.nextInt();

            if((edad <= 0) || (edad > 100)){
                System.out.println("La edad no puede ser negativa o mayor a 100");
            }
        }while ((edad <= 0) || (edad > 100));

        //validacion altura positiva
        do {
            System.out.println("Ingrese su altura en metros: ");
            altura = entrada.nextDouble();

            if((altura <= 0) || (altura > 2)){
                System.out.println("La altura no puede ser negativa o mayor a 2");
            }
        }while ((altura <= 0) || (altura > 2));

        if (edad >= 18 && altura < 1.6){
            System.out.println(mensaje[0]);
        }else System.out.println(mensaje[1]);
    }
}
