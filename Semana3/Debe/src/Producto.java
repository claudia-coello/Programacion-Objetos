/*
* Lo que tienes que hacer:
1. Cambia los atributos a privados.
2. Corrige los nombres de los métodos a getNombre() y setPrecio(double).
3. Valida que el precio sea mayor a 0.
4. Crea un método que muestre toda la información del producto.
5. En el main, crea un objeto Producto y prueba con precios válidos e inválidos.
* */

class Producto{
    private double precio;
    private String nombre;

    public Producto(double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
    }

    public void setPrecio(double p) {
        if(p > 0)
            precio = p;
        else
            System.out.println("El precio no puede ser negativo");
    }

    public String getNombre() {
        return nombre;
    }

    public void mostrarInformacion(){
        System.out.println("Precio: " + precio + " Nombre: " + nombre);
    }
}