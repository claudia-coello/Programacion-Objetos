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
        Scanner sc = new Scanner(System.in);
        Concurso concurso = new Concurso();

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
                    int tipoCandidata = 0;
                    do {
                        System.out.println("Registrar candidata (1: Estudiante, 2: Profesional): ");

                        try {
                            tipoCandidata = sc.nextInt();
                            sc.nextLine();
                            if (tipoCandidata != 1 && tipoCandidata != 2) throw new DatoInvalidoException("");
                        } catch (InputMismatchException e) {
                            System.out.println("Debe ingresar un numero entero.");
                            sc.nextLine();
                            tipoCandidata = 0;
                        } catch (DatoInvalidoException e) {
                            System.out.println(e.getMessage());
                        }
                    }while(tipoCandidata != 1 && tipoCandidata != 2);
                    //Puede ser o bien estudiante(1) o profesional(2)

                    try {
                        int id = 0;
                        boolean valido = false;
                        do {
                            try {
                                System.out.print("Ingrese ID: ");
                                id = sc.nextInt();
                                sc.nextLine();
                                valido = true;
                            } catch (InputMismatchException e) {
                                System.out.println("Error: debe ingresar un número entero.");
                                sc.nextLine(); // limpiar buffer
                            }
                        } while(!valido);

                        String nombre = "";
                        do {
                            System.out.print("Ingrese nombre: ");
                            nombre = sc.nextLine().trim();
                            if(nombre.isEmpty()) {
                                System.out.println("Error: el nombre no puede estar vacío.");
                            }
                        } while(nombre.isEmpty());

                        int edad = 0;
                        valido = false;
                        do {
                            try {
                                System.out.print("Ingrese edad: ");
                                edad = sc.nextInt();
                                sc.nextLine();
                                if(edad < 16) {
                                    System.out.println("Error: la edad debe ser mayor o igual a 16.");
                                } else {
                                    valido = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error: debe ingresar un número entero.");
                                sc.nextLine();
                            }
                        } while(!valido);

                        String distrito = "";
                        do {
                            System.out.print("Ingrese distrito: ");
                            distrito = sc.nextLine().trim();
                            if(distrito.isEmpty()) {
                                System.out.println("Error: el distrito no puede estar vacío.");
                            }
                        } while(distrito.isEmpty());

                        double puntaje = 0;
                        valido = false;
                        do {
                            try {
                                System.out.print("Ingrese puntaje del jurado: ");
                                puntaje = sc.nextDouble();
                                sc.nextLine();
                                if(puntaje < 0) {
                                    System.out.println("Error: el puntaje no puede ser negativo.");
                                } else {
                                    valido = true;
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Error: debe ingresar un número válido.");
                                sc.nextLine();
                            }
                        } while(!valido);

                        sc.nextLine();
                        if (tipoCandidata == 1){
                            System.out.println("Universidad: "); String universidad = sc.nextLine();
                            System.out.println("Carrera: "); String carrera = sc.nextLine();

                            CandidataEstudiante c = new CandidataEstudiante(id, nombre,edad,distrito,puntaje,universidad,carrera);
                            concurso.registrarCandidata(c);
                        }else if(tipoCandidata == 2){
                            System.out.print("Profesión: "); String prof = sc.nextLine();
                            System.out.print("Años de experiencia: "); int years = sc.nextInt(); sc.nextLine();
                            CandidataProfesional cp = new CandidataProfesional(id,nombre,edad,distrito,puntaje,prof,years);
                            concurso.registrarCandidata(cp);
                        } else {
                            System.out.println("Tipo no válido");
                        }
                    }catch (DatoInvalidoException e){ System.out.println(e.getMessage());}
                    break;
                case 2:
                    if (concurso.getListaCandidatas().isEmpty()){
                        System.out.println("No hay candidatas registradas");
                        break;
                    }

                    System.out.println("Lista de candidatas:");
                    for(Candidata c: concurso.getListaCandidatas()){
                        c.mostrarDetalles();
                        System.out.println("----------------------");
                    }
                    break;
                case 3:
                    sc.nextLine();

                    if (concurso.getListaCandidatas().isEmpty()){
                        System.out.println("No hay candidatas registradas");
                        break;
                    }

                    System.out.println("Ingrese ID o Nombre para buscar: ");
                    String busqueda = sc.nextLine();
                    boolean encontrada = false;
                    for(Candidata c: concurso.getListaCandidatas()){
                        if(String.valueOf(c.getId()).equals(busqueda) || c.getNombre().equalsIgnoreCase(busqueda)){
                            c.mostrarDetalles();
                            encontrada = true;
                        }
                    }
                    break;
                case 4:
                    sc.nextLine();//limpiar buffer

                    if (concurso.getListaCandidatas().isEmpty()){
                        System.out.println("No hay candidatas registradas");
                        break;
                    }

                    System.out.print("Filtrar por distrito: ");
                    String distritoFiltro = sc.nextLine().trim();
                    if (concurso.getListaCandidatas().isEmpty()){
                        System.out.println("No hay candidatas registradas");
                        break;
                    }

                    boolean encontrado = false;
                    for(Candidata c: concurso.getListaCandidatas()){
                        if(c.getDistrito().equalsIgnoreCase(distritoFiltro)){
                            c.mostrarDetalles();
                            System.out.println("-----------------");
                            encontrado = true;
                        }
                    }
                    if(!encontrado){
                        System.out.println("No se encontraron candidatas en el distrito " + distritoFiltro);
                    }
                    break;
                case 5:
                    sc.nextLine();
                    int idVoto = -1;
                    boolean valido = false;

                    if (concurso.getListaCandidatas().isEmpty()){
                        System.out.println("No hay candidatas registradas");
                        break;
                    }

                    while (!valido) {
                        try {
                            System.out.print("Ingrese ID de la candidata para votar: ");
                            idVoto = sc.nextInt();
                            valido = true; // ingreso correcto
                        } catch (InputMismatchException e) {
                            System.out.println("Error. El ID debe ser un número.");
                            sc.nextLine(); // limpiar buffer
                        }
                    }

                    concurso.votar(idVoto);
                    break;
                case 6:
                    if (concurso.getListaCandidatas().isEmpty()){
                        System.out.println("No hay candidatas registradas");
                        break;
                    }

                    System.out.println("Resultados:");
                    for(Candidata c: concurso.getListaCandidatas()){
                        int votos = concurso.getConteoVotos().get(c.getId());
                        System.out.println(c.getNombre() + " - Votos: " + votos);
                    }
                    System.out.println("\nGanadora(s):");
                    List<Candidata> ganadoras = concurso.obtenerGanadora();
                    for(Candidata g: ganadoras){
                        g.mostrarDetalles();
                        System.out.println("------------------");
                    }
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
