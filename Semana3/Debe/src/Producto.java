class Producto{
    private double precio;
    private String nombre;

    public void setPrecio(double p) {
        if(p > 0)
            precio = p;
        else
            System.out.println("El no puede ser negativo");
    }

    public String getNombre() {
        return nombre;
    }
}