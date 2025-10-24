/*
 9. Identificar el llamado correcto: función o metodo
Cómo se invoca un metodo estático vs. uno de instancia
Uso de objetos e instancias
Ejemplo: Math.sqrt() vs. objeto.metodo()

- En el metodo estático: pertenece a la clase, se llama sin crear objeto, y
  se debe usar de esta forma: NombreClase.metodo()

- En el metodo de instancia: pertenece a un objeto, se llama desde una instancia, y
  se debe usar asi: objeto.metodo()
 */
public class Llamado {
    static double raizCuadrada(double n) {
        return Math.sqrt(n); // mmtodo estático de la clase Math
    }
    void saludar() {
        System.out.println("Holaa, como estas?");
    }
    public static void main(String[] args) {
        // Llamado estático
        System.out.println(raizCuadrada(16));
        System.out.println(Math.sqrt(9));

        // Llamado de instancia
        Llamado e = new Llamado();
        e.saludar();
    }
}
