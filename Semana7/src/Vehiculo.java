/*
* Una institución encargada del control vehicular requiere un sistema básico que permita registrar diferentes tipos de vehículos (por ejemplo: autos, motos o camiones) y calcular el valor de la matrícula de cada uno según sus características.
El sistema debe contemplar una estructura de clases bien definida, aplicando los conceptos de herencia y abstracción para representar los distintos tipos de vehículos y sus comportamientos.
Requerimientos funcionales:
1.	Se debe crear una clase base llamada Vehiculo, que servirá como clase abstracta.
	Debe incluir atributos privados como mínimo: placa, marca, anio y propietario.
	Debe tener un constructor para inicializar dichos valores.
	Implementar los métodos get y set para mantener el encapsulamiento de los datos.
	Declarar un método abstracto que permita calcular el valor de la matrícula.
	public abstract double calcularValorMatricula();

* */
abstract class Vehiculo {
    private String placa, marca,propietario, color;
    private int anio;

    public Vehiculo(String placa, String marca, int anio, String propietario, String color){
        this.placa=placa;
        this.anio=anio;
        this.propietario=propietario;
        this.marca=marca;
        this.color=color;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    public abstract double calcularValorMatricula();

    public void encender(){
        System.out.println("El vehiculo se encendio");
    }
    public void acelerar(){
        System.out.println("El vehiculo esta acelerando");
    }
    public void apagar(){
        System.out.println("El vehiculo se apago");
    }
}


class Auto extends Vehiculo{
    int num_puertas;
    public Auto(String placa, String marca, int anio, String propietario, String color, int num_puertas){
        super(placa, marca, anio, propietario, color);
        this.num_puertas=num_puertas;
    }
    @Override
    public double calcularValorMatricula(){
        int year_actual=2025;
        return 15;
    }
    public void tocar_bocina(){
        System.out.println("HOOOONK!!!!");
    }
}
class Moto extends Vehiculo{
    int cilindrada;
    public Moto(String placa, String marca, int anio, String propietario, String color, int cilindrada) {
        super(placa, marca, anio, propietario, color);
        this.cilindrada=cilindrada;
    }

    @Override
    public double calcularValorMatricula(){
        int year_actual=2025;
        return 20;
    }
    public void caballito(){
        System.out.println("*Hace caballito*");
    }
}
class Camion extends Vehiculo{
    double carga_maxima;
    public Camion(String placa, String marca, int anio, String propietario, String color,double carga_maxima){
        super(placa, marca, anio, propietario, color);
        this.carga_maxima=carga_maxima;
    }
    @Override
    public double calcularValorMatricula(){
        int year_actual=2025;
        return 100;
    }
    public void descargar(){
        System.out.println("⚠️pi pi pi⚠️ Camion descargando.");
    }
}

