//8. Crear un menú principal que permita registrar y consultar información.
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainOlimpiada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Olimpiada olimpiada = new Olimpiada("Olimpiadas 2025", "Quito", 2025);//vamos a suponer que son las olimpiadas de este anio

        int opcion = 0;

        do {
            boolean valido = false;
            while (!valido) {
                try {
                    System.out.println("\n===== MENÚ DE OLIMPIADAS =====");
                    System.out.println("1. Agregar Evento");
                    System.out.println("2. Mostrar Información de la Olimpiada");
                    System.out.println("3. Mostrar Eventos");
                    System.out.println("4. Agregar Participante a Evento");
                    System.out.println("5. Listar Participantes de un Evento");
                    System.out.println("6. Salir");
                    System.out.print("Seleccione una opción: ");
                    opcion = entrada.nextInt();
                    valido = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error. Debe ingresar un número entero.");
                    entrada.nextLine(); // limpiar buffer
                }
            }

            entrada.nextLine(); // limpiar buffer
            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Código del evento: ");
                        int codigo = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nombre del evento: ");
                        String nombre = entrada.nextLine();
                        System.out.print("Categoría: ");
                        String categoria = entrada.nextLine();
                        System.out.print("Fecha (dd/mm/yyyy): ");
                        String fecha = entrada.nextLine();

                        Evento e = new Evento(codigo, nombre, categoria, fecha);
                        olimpiada.agregarEvento(e);
                        System.out.println("Evento agregado correctamente.");
                    } catch (InputMismatchException e) {
                        System.out.println("Error. Datos inválidos.");
                        entrada.nextLine();
                    } catch (EventoVacioException eve) {
                        System.out.println("Error: " + eve.getMessage());
                    }
                    break;

                case 2:
                    olimpiada.mostrarInformacion();
                    break;

                case 3:
                    try {
                        olimpiada.mostrarEventos();
                    } catch (EventoVacioException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        if (olimpiada.getEventos().isEmpty()) {
                            System.out.println("No hay eventos registrados para agregar participantes.");
                            break;
                        }
                        System.out.println("Seleccione el evento por código:");
                        for (Evento e : olimpiada.getEventos()) {
                            System.out.println(e.getCodigo() + " - " + e.getNombre());
                        }
                        int codEvento = entrada.nextInt();
                        entrada.nextLine();
                        Evento eventoSeleccionado = null;
                        for (Evento e : olimpiada.getEventos()) {
                            if (e.getCodigo() == codEvento) {
                                eventoSeleccionado = e;
                                break;
                            }
                        }
                        if (eventoSeleccionado == null) {
                            System.out.println("Evento no encontrado.");
                            break;
                        }

                        System.out.println("Tipo de participante: 1. Atleta  2. Equipo");
                        int tipo = entrada.nextInt();
                        entrada.nextLine();

                        System.out.print("Nombre: ");
                        String nombreP = entrada.nextLine();
                        System.out.print("Edad: ");
                        int edad = entrada.nextInt();
                        System.out.print("ID: ");
                        int id = entrada.nextInt();
                        entrada.nextLine();

                        Participante participante;
                        if (tipo == 1) {
                            System.out.print("Disciplina: ");
                            String disciplina = entrada.nextLine();
                            System.out.print("Nacionalidad: ");
                            String nacionalidad = entrada.nextLine();
                            participante = new Atleta(nombreP, edad, id, disciplina, nacionalidad);
                        } else {
                            System.out.print("Disciplina: ");
                            String disciplina = entrada.nextLine();
                            System.out.print("País: ");
                            String pais = entrada.nextLine();
                            participante = new Equipo(nombreP, edad, id, disciplina, pais);
                        }

                        eventoSeleccionado.registrarParticipante(participante);

                    } catch (InputMismatchException e) {
                        System.out.println("Error. Datos inválidos.");
                        entrada.nextLine();
                    } catch (ParticipanteInvalidoException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    try {
                        if (olimpiada.getEventos().isEmpty()) {
                            System.out.println("No hay eventos registrados.");
                            break;
                        }
                        System.out.println("Seleccione el evento por código:");
                        for (Evento e : olimpiada.getEventos()) {
                            System.out.println(e.getCodigo() + " - " + e.getNombre());
                        }
                        int codEvento = entrada.nextInt();
                        entrada.nextLine();
                        Evento eventoSeleccionado = null;
                        for (Evento e : olimpiada.getEventos()) {
                            if (e.getCodigo() == codEvento) {
                                eventoSeleccionado = e;
                                break;
                            }
                        }
                        if (eventoSeleccionado == null) {
                            System.out.println("Evento no encontrado.");
                            break;
                        }

                        if (eventoSeleccionado.getParticipantes().isEmpty()) {
                            throw new ParticipantesVacioException("No hay participantes en este evento.");
                        }
                        System.out.println("=== Participantes del evento ===");
                        for (Participante p : eventoSeleccionado.getParticipantes()) {
                            p.mostrarParticipante();
                        }

                    } catch (ParticipantesVacioException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 6);

        entrada.close();
    }
}
