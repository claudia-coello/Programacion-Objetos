/* 1. Qué es un método
    Definición
Conjunto de instucciones que describe lo que hace un objeto.

    Estructura básica en Java
public tipoDeRetorno nombreDelMetodo(parámetros) {
    //Codigo
    return valor; // (si el método devuelve algo)
}

    Diferencia entre método y bloque de código
Los metodos son reutilizables, pueden devolver valores y tienen parametros.
Los bloques de codigo no se pueden reutilizar.
*/

public class Metodo {
    public static int multiplicacion(int a, int b){
        return a*b;
    }

}