import ec.gob.subsidio.modelo.SolicitanteSubsidio;
import java.util.Scanner;
/*Parte 3: Clase Main
1. Crear la clase Main con el metodo main(String[] args).*
2. Usar Scanner para pedir los datos: nombre, cédula, ingresos, vehículos, viveEnEcuador.*
3. Crear el objeto usando el constructor.
4. Mostrar los datos con toString().
5. Mostrar el resultado con generarResultado().
6. Probar los metodos sobrecargados calcularConsumoMensual():
a. Llamar primero al metodo sin parámetros.
b. Luego llamar al metodo con un parámetro adicional (double kmExtra) para simular un
recorrido mayor.
7. Mostrar en pantalla los resultados de ambos cálculos de consumo mens
* */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        SolicitanteSubsidio.mostrarReglasSubsidio();

        System.out.println("\n=== INGRESO DE DATOS DEL SOLICITANTE ===");

        System.out.print("Ingrese el nombre completo: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese la cédula: ");
        String cedula = entrada.nextLine();

        entrada.nextLine();//consume el salto de linea
        System.out.print("Ingrese los ingresos mensuales: ");
        double ingresos = entrada.nextDouble();

        System.out.print("Ingrese la cantidad de vehículos: ");
        int vehiculos = entrada.nextInt();

        System.out.print("Vive en Ecuador? (true/false): ");
        boolean viveEnEcuador = entrada.nextBoolean();

        SolicitanteSubsidio solicitante = new SolicitanteSubsidio(nombre, cedula, ingresos, vehiculos, viveEnEcuador);

        System.out.println(solicitante.toString());

        solicitante.generarResultado();

        System.out.println("\n=== CALCULO DE CONSUMO MENSUAL ===");

        // metodo sin parametros
        System.out.println("Consumo mensual base (1000 km): " + solicitante.calcularConsumoMensual());

        // Metodo con parametro
        double kmExtra = 300.0;
        double consumoConExtra = solicitante.calcularConsumoMensual(kmExtra);
        System.out.println("Consumo mensual con extra: " + consumoConExtra);
    }
}