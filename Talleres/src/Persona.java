public class Persona {
    String nombre, correo;
    int edad, cedula;

//metodo construtor de la clase, siempre tiene el nombre de la clase
    public Persona(String nombre,int edad, String correo,int cedula){
        this.edad   = edad;
        this.nombre = nombre;
        this.cedula = cedula;
        this.correo = correo;
    }
    public void saludar(){
        System.out.println("Mi nombre es " + nombre + ",mi cedula es " + cedula+ ",tengo " + edad + " años" + " y mi correo es " + correo);
    }

    public static void main(String[] args) {
        Persona p2 = new Persona("fernando", 25, "ff@gmail.com", 001547);
        p2.saludar();
    }
}
