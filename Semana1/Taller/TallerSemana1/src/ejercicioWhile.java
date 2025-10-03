import  java.util.Scanner;
public class ejercicioWhile {
    public static void main(String[] args) {
        String usuario = "Claudia";
        String clave = "arrozConPollo";
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        String usuarioIngresado = entrada.nextLine();

        System.out.println("Ingrese su clave: ");
        String claveIngresada = entrada.nextLine();

        while (!(usuario.equals(usuarioIngresado) && !(clave.equals(claveIngresada)))){
            System.out.println("Usuario o clave incorrecto. Intentelo nuevamente");

            System.out.println("Ingrese su usuario: ");
            usuarioIngresado = entrada.nextLine();

            System.out.println("Ingrese su clave: ");
            claveIngresada = entrada.nextLine();
        }
        System.out.println("Bienvenido");
    }
}