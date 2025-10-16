//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Persona {
    public int cedula;
    private String nombre;
    private int edad;
    public String correo;
    private float  ahorros;

    public Persona(){
        cedula=1234567890;
        nombre="Maria";
        edad=17;
        correo="maria@gmail.com";
        ahorros=80000;
    }

    void visualizarDatos(){
        System.out.println("Ahorros disponibles: " + ahorros);
    }
    public Persona(int cedula,String nombre,int edad,String correo, float ahorros){
        this.cedula=cedula;
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
        this.ahorros=ahorros;
    }
    public static void main(String[] args) {
        Persona personaUno = new Persona(17481, "Juan", 21, "juan@gmail.com", 400);
        System.out.println("Metodo con parametros: ");
        personaUno.visualizarDatos();

        Persona personaDos = new Persona();
        System.out.println("Metodo sin parametros: ");
        personaDos.visualizarDatos();
    }
}