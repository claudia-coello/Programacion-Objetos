public class OperacionesMatematicas {
    private int numeroUno;
    private int numeroDos;
    private int numeroTres;


    public int getNumeroTres() {
        return numeroTres;
    }

    public void setNumeroTres(int numeroTres) {
        this.numeroTres = numeroTres;
    }


    public OperacionesMatematicas(int numeroUno, int numeroDos, int numeroTres){
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
        this.numeroTres = numeroTres;
    }

    public void operacionMatematica(){
        int numeroSuma;
        numeroSuma = numeroUno + numeroDos + numeroTres;

        System.out.println(numeroUno + " + " + numeroDos + " + " + numeroTres + " = " + numeroSuma);
    }

    public int getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(int numero) {
        this.numeroUno = numeroUno;
    }

    public int getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(int numeroDos) {
        this.numeroDos = numeroDos;
    }
}
