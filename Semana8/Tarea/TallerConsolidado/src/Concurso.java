import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
Concurso (o Eleccion)
◦ - listaCandidatas: ArrayList<Candidata>
◦ - votos: ArrayList<Voto> (o Map<Integer,Integer> conteoVotos)
◦ + registrarCandidata(Candidata c): void
◦ + votar(int idCandidata): void
◦ + contarVotos(): Map<Integer,Integer>
◦ + obtenerGanador(): List<Candidata>
* */
public class Concurso {
    private ArrayList<Candidata>listaCandidatas = new ArrayList<>();
    private Map<Integer, Integer>conteoVotos = new HashMap<>();//Es un diccionario, la clave es el id de la candidata y el valor el numero de votos
    private int siguienteIdVoto = 1;
    private ArrayList<Voto> listaVotos= new ArrayList<>();

    public ArrayList<Candidata> getListaCandidatas() {
        return listaCandidatas;
    }

    public void setListaCandidatas(ArrayList<Candidata> listaCandidatas) {
        this.listaCandidatas = listaCandidatas;
    }

    public Map<Integer, Integer> getConteoVotos() {
        return conteoVotos;
    }

    public void setConteoVotos(Map<Integer, Integer> conteoVotos) {
        this.conteoVotos = conteoVotos;
    }

    public void registrarCandidata(Candidata c){
        listaCandidatas.add(c);//los agrega a la lista de candidatas
        conteoVotos.put(c.getId(), 0);//agrega en votos con clave de la concursante y 0 votos
    }

    public void votar(int idCandidata){
        if(contarVotos().containsKey(idCandidata)){
            int votosActuales = conteoVotos.get(idCandidata);//encuentra cuantos votos tiene
            conteoVotos.put(idCandidata, conteoVotos.get(idCandidata) + 1);//coloca de valor los votos que tenia mas uno

            Voto voto = new Voto();
            voto.setIdVoto(siguienteIdVoto++);
            voto.setIdCandidata(idCandidata);
            voto.setFechaHora(LocalDateTime.now());
            listaVotos.add(voto);
        }

        else System.out.println("Error. La candidata no existe");
    }

    public Map<Integer,Integer> contarVotos(){
        return conteoVotos;
    }

    public List<Candidata> obtenerGanadora(){
        List<Candidata> ganadoras = new ArrayList<>();//porque pueden haber concursantes con la misma cantidad de votos

        int votosMaximos = -1;
        for (int votos: conteoVotos.values())if(votos > votosMaximos) votosMaximos=votos;

        for (Candidata c:listaCandidatas) if (conteoVotos.get(c.getId()) == votosMaximos) ganadoras.add(c);

        return ganadoras;
    }
}
