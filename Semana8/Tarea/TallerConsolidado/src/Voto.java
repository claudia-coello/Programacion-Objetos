import java.time.LocalDateTime;

/*
• Voto
◦ - idVoto: int
◦ - idCandidata: int
◦ - fechaHora: LocalDateTime
• */
public class Voto {
    private int idVoto;
    private int idCandidata;
    private LocalDateTime fechaHora;

    public int getIdVoto() {
        return idVoto;
    }

    public void setIdVoto(int idVoto) {
        this.idVoto = idVoto;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getIdCandidata() {
        return idCandidata;
    }

    public void setIdCandidata(int idCandidata) {
        this.idCandidata = idCandidata;
    }
}
