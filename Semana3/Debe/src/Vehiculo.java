public class Vehiculo {
    public String marca;
    private String modelo;
    private double velocidadMaxima;
    private String codigoSeguridad;
    private String color;//solo acepta rojo azul o blanco

    public Vehiculo(String marca, String modelo, String colorInicial){
        this.marca = marca;
        this.modelo = modelo;
        velocidadMaxima = 50;
        setColor(colorInicial);
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String colorMinusculas = color.toLowerCase();
        if (colorMinusculas.equals("azul") || colorMinusculas.equals("rojo")  || colorMinusculas.equals("blanco"))
            this.color = color;
        else
            System.out.println("El color solo puede ser azul, rojo o blanco");
    }
}
