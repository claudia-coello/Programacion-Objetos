import java.util.ArrayList;
import java.util.List;
import java.util.InputMismatchException;
import java.util.Scanner;

abstract class Dispositivo {
    private String marca;
    private String modelo;
    private double precio;

    public Dispositivo() {}

    public Dispositivo(String marca, String modelo, double precio) throws DatoInvalidoException {
        setMarca(marca);
        setModelo(modelo);
        setPrecio(precio);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) throws DatoInvalidoException {
        if (marca == null || marca.isEmpty()) {
            throw new DatoInvalidoException("Marca no puede estar vacia.");
        }
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws DatoInvalidoException {
        if (modelo == null || modelo.isEmpty()) {
            throw new DatoInvalidoException("Modelo no puede estar vacio.");
        }
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) throws DatoInvalidoException {
        if (precio < 0) {
            throw new DatoInvalidoException("Precio no puede ser negativo.");
        }
        this.precio = precio;
    }
    public abstract void mostrarInfo();
}

class Laptop extends Dispositivo {
    private boolean esGaming;

    public Laptop() { super(); }

    public Laptop(String marca, String modelo, double precio, boolean esGaming) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.esGaming = esGaming;
    }

    public boolean isEsGaming() {
        return esGaming;
    }

    public void setEsGaming(boolean esGaming) {
        this.esGaming = esGaming;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Laptop ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Laptop Gaming: " + (esGaming ? "Si" : "No"));
    }
}

class Telefono extends Dispositivo {
    private boolean es5G;

    public Telefono() { super(); }

    public Telefono(String marca, String modelo, double precio, boolean es5G) throws DatoInvalidoException {
        super(marca, modelo, precio);
        this.es5G = es5G;
    }

    public boolean isEs5G() {
        return es5G;
    }

    public void setEs5G(boolean es5G) {
        this.es5G = es5G;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("=== Telefono ===");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Compatible 5G: " + (es5G ? "Sí" : "No"));
    }
}