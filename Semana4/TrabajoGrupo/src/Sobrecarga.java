/*
 8. Sobrecarga de métodos (Overloading)
Concepto
Reglas básicas (mismo nombre, distintos parámetros)
Ejemplo práctico: sistema de mensajería personalizada

-La sobrecarga de metodos es cuando llamamos a un metodo de la misma forma varias
 veces aunque los parametros que tenga sean distintos.
- Debe de tener el mismo nombre, paramentro distintos, y puede tener distinto tipo de retorno.

 */
public class Sobrecarga {

    // Metodo 1: envía un mensaje sin destinatario
    static void enviar(String texto) {
        System.out.println("Mensaje: " + texto);
    }
    //  Metodo 2: envía un mensaje con destinatario
    static void enviar(String texto, String destinatario) {
        System.out.println("Mensaje para " + destinatario + ": " + texto);
    }
    // Metodo 3: envía un mensaje con prioridad
    static void enviar(String texto, int prioridad) {
        System.out.println("Mensaje (prioridad " + prioridad + "): " + texto);
    }
    public static void main(String[] args) {
        // Llamadas a los distintos métodos
        enviar("Hola"); // Aqui esta usando el metodo solo con un parametro
        enviar("Buenas tardes", "María"); // Aqui lo esta usando con 2
        enviar("Reunión importante", 1);  // Aqui 2 igualmente pero con diferente parametro
    }
}
