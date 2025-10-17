public class Persona {
    private String nombre, profesion;
    private int edad;

    public Persona(String nombre, String profesion,int edad){
        this.nombre = nombre;
        this.profesion = profesion;
        this.edad = edad;
    }

    public void setNombre(String nuevoNombre){
        if (nuevoNombre.isEmpty())
            System.out.println("El nombre no puede estar vacio");
        else
            this.nombre = nuevoNombre;
    }
    public void setEdad(int nuevaEdad){
        if (nuevaEdad < 0)
            System.out.println("La edad no puede ser negativa");
        else
            this.edad = nuevaEdad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getProfesion(){
        return profesion;
    }
    public int getEdad(){
        return edad;
    }
}
