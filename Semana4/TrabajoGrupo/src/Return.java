/*
7. Cuándo utilizamos return
Tipos de valores devueltos
Qué sucede si no se usa return
Ejemplo con retorno de valores numéricos y texto

-Se utiliza para devolver un valor desde un metodo al lugar donde fue llamado
-Los tipos de valores devueltos son números, texto, booleanos, objetos, etc
- Se va a ejecutar hasta el final, y en caso de que no sea void y no se hace un return
  va a dar un error porque no puede terminar sin dar un valor correcto
-
 */
public class Return {

    // Metodo que devuelve un número de la suma de dos valores
    static int sumar(int a, int b) {
        return a + b;
    }
    // Metodo que devuelve texto
    static String saludar(String nombre) {
        return "Hola, " + nombre;
    }

    // Metodo que no devuelve nada (solo muestra algo en pantalla)
    static void mostrarMensaje() {
        System.out.println("Mensaje sin retorno");
    }

    public static void main(String[] args) {
        int resultado = sumar(5, 3);

        // Llamamos al metodo saludar y guardamos el texto que retorna
        String saludo = saludar("Milka");

        System.out.println("Suma: " + resultado);
        System.out.println(saludo);

        // Llamamos al metodo que no devuelve nada
        mostrarMensaje();
    }
}

