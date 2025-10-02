import java.util.Scanner;
/*
* Ejercicio 2: Registro de clientes
Objetivo: Capturar datos de un cliente y mostrar ficha.
Entradas: cedula, nombres, telefono, email.
Salida: Ficha en consola.
Reglas: validar que los campos no estén vacíos.*/
public class EjercicioDosDeberUno {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombre, mail, cedula, telefono;
        do {
            System.out.println("Ingrese su cedula: ");
            cedula = entrada.nextLine();

            if(cedula.isEmpty()){
                System.out.println("No puede dejar un campo vacio. Intentelo nuevamente");
            }
        }while(cedula.isEmpty());

        do {
            System.out.println("Ingrese su nombre: ");
            nombre = entrada.nextLine();

            if(nombre.isEmpty()){
                System.out.println("No puede dejar un campo vacio. Intentelo nuevamente");
            }
        }while(nombre.isEmpty());

        do {
            System.out.println("Ingrese su telefono: ");
            telefono = entrada.nextLine();

            if(telefono.isEmpty()){
                System.out.println("No puede dejar un campo vacio. Intentelo nuevamente");
            }
        }while(telefono.isEmpty());

        do {
            System.out.println("Ingrese su e-mail: ");
            mail = entrada.nextLine();

            if(mail.isEmpty()){
                System.out.println("No puede dejar un campo vacio. Intentelo nuevamente");
            }
        }while(mail.isEmpty());
        System.out.println("Nombre: " + nombre + "\nCedula: " + cedula + "\nTelefono: " + telefono + "\nE-mail: " + mail);
    }
}
