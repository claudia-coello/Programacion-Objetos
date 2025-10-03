import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String usuario = "Claudia";
        String clave = "arrozConPollo";
        Scanner entrada =new Scanner(System.in);

        System.out.println("Ingrese su usuario: ");
        String usuarioIngresado = entrada.nextLine();

        System.out.println("Ingrese su clave: ");
        String claveIngresada = entrada.nextLine();

        String s = (usuario.equals(usuarioIngresado) && clave.equals(claveIngresada)) ? "Ingreso exitoso" : "Ususario o clave incorrecta";
        System.out.println(s);
    }
}