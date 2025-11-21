import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();
        int opcion = -1;

        do {
            System.out.println("-- Menu ---");
            System.out.println("0. Salir");
            System.out.println("1. Registrar Laptop");
            System.out.println("2. Registrar Telefono");
            System.out.println("3. Mostrar todos los dispositivos");
            System.out.print("Ingrese una opcion: ");

            try {
                opcion = sc.nextInt();
                sc.nextLine(); // limpiar buffer

                switch(opcion) {
                    case 1:
                        try {
                            System.out.print("Marca: ");
                            String marcaLaptop = sc.nextLine();

                            System.out.print("Modelo: ");
                            String modeloLaptop = sc.nextLine();

                            System.out.print("Precio: ");
                            double precioLaptop = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("Es Gaming? (true/false): ");
                            boolean esGaming = sc.nextBoolean();
                            sc.nextLine();

                            Laptop laptop = new Laptop(marcaLaptop, modeloLaptop, precioLaptop, esGaming);
                            dispositivos.add(laptop);
                            System.out.println("Laptop registrada correctamente.");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: entrada invalida.");
                            sc.nextLine();
                        } catch (DatoInvalidoException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 2:
                        try {
                            System.out.print("Marca: ");
                            String marcaTel = sc.nextLine();

                            System.out.print("Modelo: ");
                            String modeloTel = sc.nextLine();

                            System.out.print("Precio: ");
                            double precioTel = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("Compatible 5G? (true/false): ");
                            boolean es5G = sc.nextBoolean();
                            sc.nextLine();

                            Telefono telefono = new Telefono(marcaTel, modeloTel, precioTel, es5G);
                            dispositivos.add(telefono);
                            System.out.println("Telefono registrado correctamente.");
                        } catch (InputMismatchException e) {
                            System.out.println("Error: entrada invalida.");
                            sc.nextLine();
                        } catch (DatoInvalidoException e) {
                            System.out.println("Error: " + e.getMessage());
                        }
                        break;

                    case 3:
                        if (dispositivos.isEmpty()) {
                            System.out.println("No hay dispositivos registrados.");
                        } else {
                            for (Dispositivo d : dispositivos) {
                                d.mostrarInfo();
                                System.out.println("------------------");
                            }
                        }
                        break;

                    case 0:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opcion invalida, intente de nuevo.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error. Debe ingresar un numero entero.");
                sc.nextLine();
            }

        } while (opcion != 0);
    }
}