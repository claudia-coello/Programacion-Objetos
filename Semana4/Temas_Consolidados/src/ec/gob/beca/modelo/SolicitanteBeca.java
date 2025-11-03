package ec.gob.beca.modelo;
/*
Parte 1: Clase SolicitanteBeca

Ubicación: paquete ec.ec.gob.beca.modelo

Atributos privados:
String nombreCompleto
String cedula
double promedio
double ingresosFamiliares
boolean tieneRecomendacion

Constructor: recibe todos los atributos.*/
public class SolicitanteBeca {
    private String nombreCompleto;
    private String cedula;
    private double promedio;
    private double ingresosFamiliares;
    private boolean tieneRecomendacion;

    public SolicitanteBeca(String nombreCompleto, String cedula, double promedio, double ingresosFamiliares, boolean tieneRecomendacion){
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        this.promedio = promedio;
        this.ingresosFamiliares = ingresosFamiliares;
        this.tieneRecomendacion = tieneRecomendacion;
    }
    /*
    Getters y setters con validaciones:

    setPromedio: 0.0 <= promedio <= 10.0

    setIngresosFamiliares: >= 0

    setCedula: 10 dígitos

    becaAprobada(): retorna true si cumple requisitos

    generarResultado(): imprime aprobado/rechazado con motivos

    toString(): muestra todos los datos

    static mostrarReglasBeca(): imprime condiciones

    calcularHorasEstudio(): sobrecarga, sin parámetros y con parámetro adicional
    * */
    //validaciones para setters y becaAprobada
    private Boolean validarcedula(String cedula){
        return cedula.length() == 10;
    }

    private Boolean validaPromedio(double promedio){
        return 0.0 <= promedio && promedio<= 10.0;
    }
    private Boolean validarIngresosFamiliares(double ingresosFamiliares){
        return ingresosFamiliares >= 0;
    }

    //setters
    public void setCedula(String cedula) {
        if (validarcedula(cedula)){
            System.out.println("Cedula ingresada exitosamente");
            this.cedula = cedula;
        }else
            System.out.println("La cedula debe tener 10 digitos");
    }

    public void setPromedio(double promedio) {
        if (validaPromedio(promedio)){
            System.out.println("Promedio ingresado exitosamente");
            this.promedio = promedio;
        }else
            System.out.println("El promedio debe estar en el rango 0.0-10.0");
    }

    public void setIngresosFamiliares(double ingresosFamiliares) {
        if (validarIngresosFamiliares(ingresosFamiliares)){
            System.out.println("Ingresos guardados exitosamente");
            this.ingresosFamiliares = ingresosFamiliares;
        }else
            System.out.println("Los ingresos no deben ser negativos");
    }
    //getters
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    public String getCedula() {
        return cedula;
    }
    public double getPromedio() {
        return promedio;
    }
    public double getIngresosFamiliares() {
        return ingresosFamiliares;
    }
    public boolean isTieneRecomendacion() {
        return tieneRecomendacion;
    }


    public Boolean becaAprobada(){//retorna true si cumple requisitos
        return (validarcedula(cedula) && validarIngresosFamiliares(ingresosFamiliares) && validaPromedio(promedio));
    }

    public void generarResultado() {
        String mensaje = "";

        if (!validarcedula(cedula)) {
            mensaje = nombreCompleto + " no ha sido aprobado. La cédula no tiene 10 dígitos.";
        } else if (!validaPromedio(promedio)) {
            mensaje = nombreCompleto + " no ha sido aprobado. El promedio no está entre 0.00 y 10.00.";
        } else if (!validarIngresosFamiliares(ingresosFamiliares)) {
            mensaje = nombreCompleto + " no ha sido aprobado. Los ingresos no pueden ser negativos.";
        } else {
            mensaje = nombreCompleto + " ha sido APROBADO.";
        }

        System.out.println(mensaje);
    }

    public static void mostrarReglasBeca() {
        System.out.println("------Reglas para obtener la beca------");
        System.out.println("1- Promedio mínimo: 8.0");
        System.out.println("2- Ingresos familiares máximos: $1200");
        System.out.println("3- Cédula válida de 10 dígitos");
        System.out.println("4- Recomendación: opcional, pero puede ayudar en casos límite");
    }

    public int calcularHorasEstudio() {
        // Promedio alto = menos horas necesarias
        if (promedio >= 9) return 2;
        if (promedio >= 8) return 4;
        return 6;
    }

    public int calcularHorasEstudio(int horasExtra) {
        return calcularHorasEstudio() + horasExtra;
    }

    // ---------------- TO STRING ----------------
    @Override
    public String toString() {
        return "SolicitanteBeca {" +
                "\n  Nombre completo: " + nombreCompleto +
                "\n  Cédula: " + cedula +
                "\n  Promedio: " + promedio +
                "\n  Ingresos familiares: $" + ingresosFamiliares +
                "\n  Tiene recomendación: " + (tieneRecomendacion ? "Sí" : "No") +
                "\n}";
    }
}
