/*
* Atributos del vehículo:
marca → pública (se puede ver directamente)
modelo → privada (requiere get y set)
velocidadMaxima → privada (solo lectura con get)
codigoSeguridad → privada (solo escritura con set)
color → privada (tiene get y set, solo acepta 'rojo', 'azul' o 'blanco')
Lo que tienes que hacer:
1. Crea la clase Vehiculo con esos atributos.
2. Define los métodos indicados (get o set según el caso).
3. En el constructor asigna velocidadMaxima.
4. En el main:
 - Muestra qué atributos puedes ver directamente.
 - Intenta leer codigoSeguridad (debe dar error).
 - Intenta poner un color no permitido.
 - Imprime los datos válidos del vehículo.
 * */
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
