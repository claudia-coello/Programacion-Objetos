/*
Interfaz de consola (menú)
◦ Registrar candidata.
◦ Listar todas.
◦ Buscar por nombre/id.
◦ Filtrar por tipo/distrito.
◦ Simular voto / registrar voto manual.
◦ Mostrar resultados y ganador.
◦ Salir.
* */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opc = -1;
        ArrayList<Candidata> Candidatas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        ArrayList<String> votos = new ArrayList<>();
        do {
            mostrarMenu();

            boolean noValido = true;

            while(noValido){
                try {
                    System.out.println("Ingrese una opcion: ");
                    opc = sc.nextInt();

                    if (opc <= 0 || opc > 7){
                        throw new DatoInvalidoException("Error. Opcion fuera de rango.");
                    }else{
                        noValido=false;//por lo tanto el usuario ingreso correctamente y puede avanzar
                    }

                } catch (InputMismatchException e) {
                    System.out.println("Error. Debe ingresar un número entero.");
                    sc.nextLine();
                } catch (DatoInvalidoException e) {
                    System.out.println(e.getMessage());
                }
            }

            switch (opc){
                case 1:
                    System.out.println("Registrando de Candidatas...");

                    //Puede ser o bien estudiante(1) o profesional(2)

                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Listando candidatas...");
                    break;
                case 3:
                    System.out.println("Buscando candidata...");
                    break;
                case 4:
                    System.out.println("Filtrando candidatas...");
                    break;
                case 5:
                    System.out.println("Registrando voto...");
                    break;
                case 6:
                    System.out.println("Mostrando Resultados...");
                    break;
                case 7:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida. Vuelva a intentarlo.");
                    break;
            }

        }while(opc != 7);
    }

    public static void mostrarMenu(){
        System.out.println("=====REINA DE QUITO=====");
        System.out.println("1. Registrar candidata.");
        System.out.println("2. Listar candidatas.");
        System.out.println("3. Buscar por nombre/id.");
        System.out.println("4. Filtrar por tipo/distrito.");
        System.out.println("5. Registrar voto manual.");
        System.out.println("6. Mostrar resultados y ganador.");
        System.out.println("7. Salir.");
    }
}
