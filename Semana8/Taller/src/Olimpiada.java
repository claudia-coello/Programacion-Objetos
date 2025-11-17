/*
4. Implementar la clase 'Olimpiada' para almacenar información general y sus eventos.
6. Utilizar excepciones personalizadas para validar datos insuficientes o incorrectos.
7. Gestionar toda la información utilizando listas dinámicas (ArrayList).
* */
import java.util.ArrayList;
import java.util.List;
public class Olimpiada {
    ArrayList<Evento> eventos = new ArrayList<>();
    private String nombre;
    private String ciudad;
    private int year;

    //constructor
    public Olimpiada(String nombre, String ciudad, int year){
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.year=year;
        this.eventos = new ArrayList<>();
    }

    //setters y getters
    public ArrayList<Evento> getEventos() {
        return eventos;
    }
    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    //metodos
    public void mostrarInformacion(){
        System.out.println("Olimpiada: " + nombre);
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Año: " + year);
        System.out.println("Número de eventos: " + eventos.size());
    }
    //muestra informacion de todo los eventos
    public void mostrarEventos ()throws EventoVacioException{
        if (eventos.isEmpty()) throw new EventoVacioException("Lista de evento vacia");
        System.out.println("Eventos de la Olimpiada " + nombre + ":");
        for (Evento e : eventos) {
            System.out.println("Código: " + e.getCodigo() + "| Nombre: " + e.getNombre() +
                    "| Categoría: " + e.getCategoria() + "| Fecha: " + e.getFecha());
        }
    }
    public void listarEventos() throws EventoVacioException{
        if (eventos.isEmpty()) throw new EventoVacioException("Lista de evento vacia");
        for (Evento e:eventos) System.out.println(e);
    }
    public void agregarEvento(Evento e) throws EventoVacioException {
        if (e == null) {
            throw new EventoVacioException("No se puede agregar un evento nulo");
        }
        eventos.add(e);
        System.out.println("Evento agregado correctamente: " + e.getNombre());
    }

}
