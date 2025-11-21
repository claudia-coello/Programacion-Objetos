import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
ACTIVIDAD – Sistema de Registro de Juegos
Indicaciones Generales: Desarrolle un programa en Java que permita registrar información sobre juegos de Mario Bros y
juegos de Carreras de Vehículos. El objetivo es aplicar herencia, polimorfismo, excepciones personalizadas y manejo de
listas (ArrayList) mediante un menú interactivo.
    Implementar un menú en consola que permita registrar y consultar juegos.
    Aplicar polimorfismo al mostrar los detalles de cada juego.
    Validar datos ingresados por el usuario (números positivos, texto no vacío, etc.).
    Probar el sistema ingresando al menos cinco juegos de ambos tipos.
    Modelo UML Requerido
    El estudiante debe generar un diagrama UML que incluya:
    • La clase abstracta Juego
    • Las clases hijas MarioBros y CarreraVehiculos
    • La clase Main que controla el menú
    • Relaciones de herencia y uso
    • Atributos y métodos principales
    Resultados Esperados Al finalizar la actividad, el estudiante debe entregar:
Programa funcional en Java Capaz de:
    • Registrar juegos de Mario y juegos de carreras
    • Mostrar todos los juegos registrados
    • Buscar juegos por nombre
    • Filtrar por tipo de juego
    • Detectar y manejar errores mediante excepciones personalizadas
* */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc = -1;
        ArrayList<Juego> juegos = new ArrayList<>();

        do {
            try {
                System.out.println("0.Salir");
                System.out.println("1.Registrar juego");
                System.out.println("2.Mostrar todos los juegos registrados");
                System.out.println("3.Buscar juego");
                System.out.println("Ingrese una opcion: ");
                opc = sc.nextInt();

                if (opc > 3 ||opc < 0){
                    throw new FueraRangoException("Error. Opcion fuera de rango.");
                }
            }catch (InputMismatchException e) {
                System.out.println("Error. Porfavor ingrese un numero entero.");
                sc.nextLine();
                continue;//vuelve al menu sin salir
            }catch (FueraRangoException e){
                System.out.println(e.getMessage());
                continue;
            }

            switch (opc){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    int tipoJuego = 0;
                    try {
                        System.out.println("----Registro de Juegos----");
                        System.out.println("Que tipo de juego desea registrar?");
                        System.out.println("1.Mario Bros");
                        System.out.println("2.Carreras");
                        System.out.print("Porfavor ingrese una opcion: ");
                        tipoJuego = sc.nextInt();

                        if (tipoJuego > 2 || tipoJuego < 1)
                            throw new FueraRangoException("Error. Opcion fuera de rango.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error. Porfavor ingrese un numero entero.");
                        sc.nextLine();
                        continue;
                    } catch (FueraRangoException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }

                    sc.nextLine(); // limpiar buffer

                    if (tipoJuego == 1) { // MarioBros
                        MarioBros nuevo = new MarioBros();
                        boolean datosValidos = true;

                        // Nombre
                        System.out.print("Ingrese el nombre del juego: ");
                        String nombre = sc.nextLine();
                        if (nombre.isEmpty()) {
                            System.out.println("Error: Nombre vacío.");
                            datosValidos = false;
                        } else {
                            nuevo.setNombre(nombre);
                        }

                        // Año de lanzamiento
                        try {
                            System.out.print("Ingrese el año de lanzamiento: ");
                            int year = sc.nextInt();
                            if (year < 1950 || year > 2050) {
                                System.out.println("Error: Año fuera de rango.");
                                datosValidos = false;
                            } else {
                                nuevo.setYearLanzamiento(year);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Año inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        // Precio
                        try {
                            System.out.print("Ingrese el precio: ");
                            double precio = sc.nextDouble();
                            if (precio < 0) {
                                System.out.println("Error: Precio no puede ser negativo.");
                                datosValidos = false;
                            } else {
                                nuevo.setPrecio(precio);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Precio inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        sc.nextLine(); // limpiar buffer

                        // Categoría
                        System.out.print("Ingrese la categoria: ");
                        String categoria = sc.nextLine();
                        try {
                            nuevo.setCategoriaElejida(categoria);
                        } catch (Exception e) {
                            System.out.println("Error en la categoría: " + e.getMessage());
                            datosValidos = false;
                        }

                        // Multijugador
                        try {
                            System.out.print("¿Es multijugador? (true/false): ");
                            boolean multi = sc.nextBoolean();
                            nuevo.setMultijugador(multi);
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Valor multijugador inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        sc.nextLine(); // limpiar buffer

                        // Personaje principal
                        System.out.print("Ingrese el personaje principal: ");
                        String personaje = sc.nextLine();
                        if (personaje.isEmpty()) {
                            System.out.println("Error: Personaje vacío.");
                            datosValidos = false;
                        } else {
                            nuevo.setPersonajePrincipal(personaje);
                        }

                        // Agregar solo si todos los datos son válidos
                        if (datosValidos) {
                            juegos.add(nuevo);
                            System.out.println("Juego registrado correctamente.");
                        } else {
                            System.out.println("No se pudo registrar el juego. Revise los datos ingresados.");
                        }

                    } else if (tipoJuego == 2) { // CarreraVehiculos
                        CarreraVehiculos nuevo = new CarreraVehiculos();
                        boolean datosValidos = true;

                        // Nombre
                        System.out.print("Ingrese el nombre del juego: ");
                        String nombre = sc.nextLine();
                        if (nombre.isEmpty()) {
                            System.out.println("Error: Nombre vacío.");
                            datosValidos = false;
                        } else {
                            nuevo.setNombre(nombre);
                        }

                        // Año
                        try {
                            System.out.print("Ingrese el año de lanzamiento: ");
                            int year = sc.nextInt();
                            if (year < 1950 || year > 2050) {
                                System.out.println("Error: Año fuera de rango.");
                                datosValidos = false;
                            } else {
                                nuevo.setYearLanzamiento(year);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Año inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        // Precio
                        try {
                            System.out.print("Ingrese el precio: ");
                            double precio = sc.nextDouble();
                            if (precio < 0) {
                                System.out.println("Error: Precio no puede ser negativo.");
                                datosValidos = false;
                            } else {
                                nuevo.setPrecio(precio);
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Precio inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        sc.nextLine(); // limpiar buffer

                        // Categoría
                        System.out.print("Ingrese la categoria: ");
                        String categoria = sc.nextLine();
                        try {
                            nuevo.setCategoriaElejida(categoria);
                        } catch (Exception e) {
                            System.out.println("Error en la categoría: " + e.getMessage());
                            datosValidos = false;
                        }

                        // Multijugador
                        try {
                            System.out.print("¿Es multijugador? (true/false): ");
                            boolean multi = sc.nextBoolean();
                            nuevo.setMultijugador(multi);
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Valor multijugador inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        sc.nextLine(); // limpiar buffer

                        // Carro elegido
                        System.out.println("Carros disponibles:");
                        for (String c : nuevo.getCarro()) {
                            System.out.println("- " + c);
                        }
                        System.out.print("Ingrese el carro elegido: ");
                        String carro = sc.nextLine();
                        try {
                            nuevo.setCarroElejido(carro);
                        } catch (Exception e) {
                            System.out.println("Error en el carro elegido: " + e.getMessage());
                            datosValidos = false;
                        }

                        // Modo carrera
                        try {
                            System.out.print("Activar modo carrera? (true/false): ");
                            boolean modo = sc.nextBoolean();
                            nuevo.setModoCarrera(modo);
                        } catch (InputMismatchException e) {
                            System.out.println("Error. Valor modo carrera inválido.");
                            sc.nextLine();
                            datosValidos = false;
                        }

                        // Agregar solo si todos los datos son válidos
                        if (datosValidos) {
                            juegos.add(nuevo);
                            System.out.println("Juego registrado correctamente.");
                        } else {
                            System.out.println("No se pudo registrar el juego. Revise los datos ingresados.");
                        }
                    }
                    break;

                case 2:
                    if (juegos.isEmpty()) {
                        System.out.println("No hay juegos registrados.");
                    } else {
                        System.out.println("----LISTA DE JUEGOS----");
                        for (Juego j : juegos) {
                            j.mostrarDatosJuego();
                            System.out.println("-----------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.println("----BUSCAR JUEGO----");
                    System.out.println("1. Buscar por nombre");
                    System.out.println("2. Buscar por tipo de juego");
                    System.out.print("Seleccione una opción: ");

                    int opBuscar = 0;
                    try {
                        opBuscar = sc.nextInt();
                        if (opBuscar < 1 || opBuscar > 2)
                            throw new FueraRangoException("Error. Opción fuera de rango.");
                    } catch (InputMismatchException e) {
                        System.out.println("Debe ingresar un número entero.");
                        sc.nextLine();
                        break;
                    } catch (FueraRangoException e) {
                        System.out.println(e.getMessage());
                        break;
                    }
                    sc.nextLine(); // limpiar buffer

                    // -----------------por nombre -----------------
                    if (opBuscar == 1) {
                        System.out.print("Ingrese el nombre del juego: ");
                        String nombreBuscar = sc.nextLine();

                        boolean encontrado = false;

                        for (Juego j : juegos) {
                            if (j.getNombre().equalsIgnoreCase(nombreBuscar)) {
                                System.out.println("Juego encontrado:");
                                j.mostrarDatosJuego();
                                encontrado = true;
                            }
                        }

                        if (!encontrado) {
                            System.out.println("No se encontró ningún juego con ese nombre.");
                        }
                    }

                    // -----------------por tipo-----------------
                    else if (opBuscar == 2) {

                        System.out.println("1. Mario Bros");
                        System.out.println("2. Carreras");
                        System.out.print("Ingrese el tipo de juego: ");

                        int tipo = 0;
                        try {
                            tipo = sc.nextInt();
                            if (tipo < 1 || tipo > 2)
                                throw new FueraRangoException("Error. Tipo fuera de rango.");
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ingresar un número entero.");
                            sc.nextLine();
                            break;
                        } catch (FueraRangoException e) {
                            System.out.println(e.getMessage());
                            break;
                        }
                        sc.nextLine();

                        boolean encontrado = false;

                        if (tipo == 1) {
                            for (Juego j : juegos) {
                                if (j instanceof MarioBros) {
                                    j.mostrarDatosJuego();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) System.out.println("No hay juegos Mario Bros registrados.");
                        }

                        if (tipo == 2) {
                            for (Juego j : juegos) {
                                if (j instanceof CarreraVehiculos) {
                                    j.mostrarDatosJuego();
                                    encontrado = true;
                                }
                            }
                            if (!encontrado) System.out.println("No hay juegos de carreras registrados.");
                        }
                    }

                    break;

                default:
                    System.out.println("Esa opcion no existe. Vuelva a intentarlo.");
            }
        }while(opc!=0);

    }
}