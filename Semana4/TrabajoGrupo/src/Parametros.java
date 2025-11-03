/* 6. Paso de parámetros y paso por valor o referencia
Explicación de ambos conceptos
Cómo funciona en Java (paso por valor de referencia)
Ejemplo con variables y objetos

- El paso de parámetros: ess enviar datos a un metodo para que los use
- El paso por valor: se envía una copia del valor, no el original.
- El paso por referencia: se envía la dirección del objeto por lo que
  los cambios afectan al original.
- Java siempre pasa por valor, pero si el valor es una referencia a un
 objeto, el metodo puede modificar el contenido del objeto.
                                                   */
class Persona {
    String nombre;
}

public class Parametros {
    static void cambiarValor(int x) {
        x = 10; // solo va a cambiar la copia, o sea no esta afectando al original
    }

    static void cambiarNombre(Persona p) {
        p.nombre = "Elizabeth"; // va a cambiar el valor del objeto, asi que si afecta al original
    }

    public static void main(String[] args) {
        int numero = 5;
        Persona persona = new Persona();
        persona.nombre = "Maria";

        cambiarValor(numero);
        cambiarNombre(persona);

        System.out.println("Número: " + numero);             // El numero no va a cambiar
        System.out.println("Nombre de persona: " + persona.nombre); // El nombre si va a cambiar
    }
}
