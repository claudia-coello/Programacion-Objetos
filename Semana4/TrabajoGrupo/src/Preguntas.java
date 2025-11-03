/*PREGUNTAS
¿Qué diferencia hay entre una función que existe sola y un metodo dentro de una clase?

La funcion es una parte de código que realiza una tarea y puede existir por sí sola, en cambio
un metodo dentro de una clase se utiliza para trabajar con los atributos u objetos de esa clase.

¿Por qué en Java no se puede ejecutar un metodo sin crear antes un objeto?

Porque Java es orientado a objetos, y los métodos normales necesitan un objeto
para poder acceder a los atributos de una clase, sin el objeto no sabe que deberia de hacer
con los datos.

¿Cómo se llama correctamente un metodo de instancia y uno estático?

En el metodo de instancia se utiliza llamando un objeto, y en el metodo estatico el
nombre de la clase.

En Java puedes invocar un metodo desde otro metodo.?

 */
public class Preguntas {

    public void saludo() {
        System.out.println("Holaa");
    }
    public void iniciar() {
        saludo();
    }
    public static void main(String[] args) {
        Preguntas e = new Preguntas();
        e.iniciar();
    }
}
