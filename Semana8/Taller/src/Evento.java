//3. Implementar la clase 'Evento' para registrar participantes.
// 7. Gestionar toda la información utilizando listas dinámicas (ArrayList).
import java.util.ArrayList;
import java.util.List;
public class Evento {
    ArrayList<Participante> participantes = new ArrayList<>();
    private int codigo;
    private String nombre;
    private String categoria;
    private String fecha;

//constructor
    public Evento(int codigo, String nombre, String categoria, String fecha){
        this.codigo=codigo;
        this.nombre=nombre;
        this.categoria=categoria;
        this.fecha=fecha;
        this.participantes=new ArrayList<>();
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }
    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void registrarParticipante (Participante p) throws ParticipanteInvalidoException{
        if (p==null) throw new ParticipanteInvalidoException("Error. Participante vacio");
        participantes.add(p);
        System.out.println("Participante anadido correctamente");
    }

    private void listarParticipantes() throws ParticipantesVacioException {
        if (participantes.isEmpty()) throw new ParticipantesVacioException("Lista de participantes vacia");
        for (Participante p:participantes) p.mostrarParticipante();
    }
}
