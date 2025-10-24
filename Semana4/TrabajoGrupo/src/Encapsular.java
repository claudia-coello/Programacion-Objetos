/*
🔹 4. Encapsular métodos y atributos
    Concepto de encapsulamiento
Principio de objetos que oculta datos de una clase y solo puede acceder con getters o setters.

    Modificadores de acceso (private, public, protected)
private: Solo pueden accederse dentro de la clase.
public: Sin restriccion, puede accederse desde cualquier clase
protected: Solo pueden accederse por herencia o del mismo paquete

    Ejemplo con atributos privados y métodos públicos*/
public class Encapsular {
    private String nombre;
    private int edad;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años");
    }
}
