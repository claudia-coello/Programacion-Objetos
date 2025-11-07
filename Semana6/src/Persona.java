public class Persona {
    String cedula;
    String nombre;
    int edad;

    public Persona(String cedula, String nombre, int edad){//constructor heredable
        this.cedula=cedula;
        this.nombre=nombre;
        this.edad=edad;
    }

    public void imprimir(){//metodo heredable
        System.out.println("====Datos====");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
//---------Subclases
class Estudiante extends Persona{//extends significa que Persona es la clase padre
    String codigo;

    Estudiante(String cedula, String nombre, int edad, String codigo){//Cada clase necesitas un constructor, incluso cuando es hija
        super(cedula, nombre, edad);//se inicializaron en la clase padre, por eso necesitamos super
        this.codigo=codigo;//inicializamos los valores que no tiene el padre
    }
    @Override
    public void imprimir() {//Metodo sobreescrito
        System.out.println("====Datos====");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo);

    }
}
class Docente extends Persona{
    public String codigo_docente;
    Docente(String cedula, String nombre, int edad, String codigo_docente){
        super(cedula, nombre, edad);
        this.codigo_docente=codigo_docente;
    }

    public void imprimir(){
        super.imprimir();//soo se mostrara
        System.out.println("Codigo: " + codigo_docente);
    }
}
class Limpieza extends Persona {
    String codigo_limpieza;

    Limpieza(String cedula, String nombre, int edad, String codigo_limpieza) {
        super(cedula, nombre, edad);
        this.codigo_limpieza = codigo_limpieza;
    }

    public void imprimir_limpieza() {
        System.out.println("====Datos====");
        System.out.println("Cedula: " + cedula);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Codigo: " + codigo_limpieza);
    }
}
//public final class Persona; evita que se herede
