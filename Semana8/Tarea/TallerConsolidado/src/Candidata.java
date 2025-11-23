/*
• Candidata (abstract)
◦ - id: int
◦ - nombre: String
◦ - edad: int
◦ - distrito: String
◦ - puntajeJurado: double
◦ + get/set ...
◦ + mostrarDetalles(): void (abstract)
*/
public abstract class Candidata {
    private int id;
    private String nombre;
    private int edad;
    private String distrito;
    private double puntajeJurado;

    public Candidata(int id, String nombre, int edad, String distrito, double puntajeJurado)throws DatoInvalidoException {
        setId(id);
        setNombre(nombre);
        setEdad(edad);
        setDistrito(distrito);
        setPuntajeJurado(puntajeJurado);
    }

    public int getId() {
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre)throws DatoInvalidoException {
        if (nombre == null || nombre.trim().isEmpty()) throw new DatoInvalidoException("El nombre no puede estar vacio");
        else this.nombre = nombre.trim();
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) throws DatoInvalidoException {
        if (edad<16) throw new DatoInvalidoException("Error. La edad no puede ser menor a 16 anios");
        else this.edad = edad;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) throws DatoInvalidoException{
        if (distrito == null || distrito.trim().isEmpty()) throw new DatoInvalidoException("Error. El distrito no puede estar vacio.");
        else this.distrito = distrito;
    }

    public double getPuntajeJurado() {
        return puntajeJurado;
    }

    public void setPuntajeJurado(double puntajeJurado) {
        this.puntajeJurado = puntajeJurado;
    }

    public abstract void mostrarDetalles();
}
/*
• CandidataEstudiante extends Candidata
◦ - universidad: String
◦ - carrera: String
◦ + mostrarDetalles(): void (override)
*/
class CandidataEstudiante extends Candidata{
    private String universidad;
    private String carrera;

    public CandidataEstudiante(int id, String nombre, int edad, String distrito, double puntajeJurado, String universidad, String carrera)throws DatoInvalidoException {
        super(id, nombre, edad, distrito, puntajeJurado);
        setCarrera(carrera);
        setUniversidad(universidad);
    }
    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) throws DatoInvalidoException{
        if (universidad.trim().isEmpty() || universidad == null) throw new DatoInvalidoException("Error. La profesion no puede star en blanco");
        else this.universidad = universidad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) throws DatoInvalidoException{
        if (carrera.trim().isEmpty() || carrera == null) throw new DatoInvalidoException("Error. La profesion no puede star en blanco");
        else this.carrera = carrera;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Distrito: " + getDistrito());
        System.out.println("Puntaje del jurado: " + getPuntajeJurado());
        System.out.println("Universidad: " + getUniversidad());
        System.out.println("Carrera: " + getCarrera());
    }
}
/*
• CandidataProfesional extends Candidata
◦ - profesion: String
◦ - añosExperiencia: int
◦ + mostrarDetalles(): void (override)
* */
class CandidataProfesional extends Candidata{
    private String profesion;
    private  int yearExperiencia;

    public CandidataProfesional(int id, String nombre, int edad, String distrito, double puntajeJurado, String profesion, int yearExperiencia)throws DatoInvalidoException {
        super(id, nombre, edad, distrito, puntajeJurado);
        setProfesion(profesion);
        setYearExperiencia(yearExperiencia);
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) throws DatoInvalidoException{
        if (profesion.trim().isEmpty() || profesion == null) throw new DatoInvalidoException("Error. La profesion no puede star en blanco");
        else this.profesion = profesion;
    }

    public int getYearExperiencia() {
        return yearExperiencia;
    }

    public void setYearExperiencia(int yearExperiencia) throws DatoInvalidoException{
        if (yearExperiencia < 0) throw new DatoInvalidoException("Error. los anios de experiencia no pueden ser negativos.");
        else this.yearExperiencia = yearExperiencia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Distrito: " + getDistrito());
        System.out.println("Puntaje del jurado: " + getPuntajeJurado());
        System.out.println("Profesion: " + getProfesion());
        System.out.println("Anios de experiencia: " + getYearExperiencia());
    }
}