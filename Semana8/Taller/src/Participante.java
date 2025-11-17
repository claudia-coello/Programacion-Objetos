//1. Crear una clase abstracta 'Participante' con atributos base y un método abstracto.
//2. Crear clases hijas 'Atleta' y 'Equipo' que hereden de Participante.
// 5. Aplicar polimorfismo mostrando el tipo de participante mediante sobrescritura de métodos.
// 7. Gestionar toda la información utilizando listas dinámicas (ArrayList).
public abstract class Participante {
    protected String nombre;
    protected int edad, id;

    //constructor
    public Participante(String nombre,int edad, int id){
        this.edad=edad;
        this.id=id;
        this.nombre=nombre;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //clase abstracta
    protected abstract void mostrarParticipante();

}
//clases hijas
class Atleta extends Participante{
    private String disciplina;
    private String nacionalidad;

    //constructor
    public Atleta(String nombre, int edad, int id, String disciplina,String nacionalidad){
        super(nombre, edad, id);
        this.disciplina=disciplina;
        this.nacionalidad=nacionalidad;
    }
    //metodos


    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    protected void mostrarParticipante(){
        System.out.println("Atleta:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("ID: " + getId());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Nacionalidad: " + nacionalidad);
        System.out.println("------------------------");
    }
}

class Equipo extends Participante{
    private String disciplina;
    private String pais;

    //constructor
    public Equipo(String nombre, int edad, int id, String disciplina, String pais){
        super(nombre, edad, id);
        this.disciplina = disciplina;
        this.pais = pais;
    }

    //metodos
    //getters y setters
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    protected void mostrarParticipante() {
        System.out.println("Equipo:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("ID: " + getId());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Nacionalidad: " + pais);
        System.out.println("------------------------");
    }
}