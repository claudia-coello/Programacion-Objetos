/*
🔹 2. Qué es una función

    Definición general (programación estructurada)
Bloques de codigo reutilizables que realiza una funcion especifica.

    Diferencias entre función y método en programación orientada a objetos
Los bloques de codigo se pueden usar sin la necesidad de clases.
Los metodos solo pueden usarse si estan asociados a un objeto o clase

    Ejemplos sencillos

 */
public class Funcion {
    //Metodo
    public static class Calculadora{
        public int sumar(int a, int b){
            return a+b;
        }
    }

    public static int sumar(int a, int b){//static significa que pertenece a una clase y no a un objeto
        return a + b;
    }

    public static void mostrarResultado(int numero){
        System.out.println("Suma: " + numero);
    }

}
