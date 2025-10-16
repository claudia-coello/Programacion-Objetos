public class Instrumento {
    private String nombre;
    private int stock;
    private double precio;

    public Instrumento(){
        nombre = "Trompeta";
        stock = 15;
        precio = 250.50;
    }
//this y scaner
    public Instrumento(String nombre, int stock, double precio){
        this.nombre=nombre;
        this.stock=stock;
        this.precio=precio;
    }

    void mostrarInformacion(){
        System.out.println("Nombre instrumento: " + nombre);
        System.out.println("Stock instrumento: " + stock);
        System.out.println("Precio instrumento: " + precio);
    }

    void calcularBeneficiosEsperados(){
        System.out.println("De " + nombre + ", se espera obtener: $" + stock*precio);
    }
}
