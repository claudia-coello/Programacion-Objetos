/*
Tarea práctica
Objetivo: Comprender y aplicar los tipos de constructores en Java. Indicaciones:
    1. Explica con tus propias palabras qué es un constructor.
    Metodo automatico al crear un objeto, este inicializa sus atributos
    2. Crea una clase llamada Producto con tres atributos: nombre, precio, cantidad.
    3. Implementa los tres tipos de constructores: uno con parámetros, uno con valores fijos, y uno vacío.
    4. Crea tres objetos usando cada tipo de constructor.
    5. Muestra los datos de cada objeto en consola.
* */
public class Producto {
    String nombre;
    double precio;
    int cantidad;

    public Producto(String nombre, double precio, int cantidad){
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }
    public Producto(String vacio){//necesita almenos un parametro pra diferenciarse de los otros dos
        nombre = "cepillo";
        cantidad = 3;
        precio = 2.99;
    }
    public Producto(){
//nada
    }
    public void mostrarParametro(){
        System.out.printf("Nombre: " + nombre + "\tPrecio: " + precio + "\tCantidad " + cantidad + "\n");
    }
    public static void main(String[] args){
        Producto productoUno = new Producto("pasta", 2.50, 3);
        Producto productoDos = new Producto("naa");
        Producto productoTres = new Producto();

        productoTres.nombre = "arroz";
        productoTres.precio = 1.5;
        productoTres.cantidad = 5;

        productoUno.mostrarParametro();
        productoDos.mostrarParametro();
        productoTres.mostrarParametro();
    }
}
