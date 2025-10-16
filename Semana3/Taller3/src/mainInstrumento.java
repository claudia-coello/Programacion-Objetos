import java.util.Scanner;
public class mainInstrumento {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Instrumento instrumentoUno = new Instrumento();
        instrumentoUno.mostrarInformacion();
        instrumentoUno.calcularBeneficiosEsperados();

        System.out.printf("Nombre publico: "+instrumentoUno.);
        System.out.println("Ingrese el nombre del producto: ");
        String nombre = entrada.nextLine();
        entrada.nextLine();

        System.out.println("Ingrese el precio del producto: ");
        double precio = entrada.nextDouble();

        System.out.println("Ingrese el stock del producto: ");
        int stock = entrada.nextInt();

        Instrumento instrumentoDos = new Instrumento(nombre, stock, precio);
        instrumentoDos.mostrarInformacion();
        instrumentoUno.calcularBeneficiosEsperados();
    }
}
