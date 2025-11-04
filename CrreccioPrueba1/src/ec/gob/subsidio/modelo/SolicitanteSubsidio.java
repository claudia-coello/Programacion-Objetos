package ec.gob.subsidio.modelo;

public class SolicitanteSubsidio {
    // Atributos privados
    private String nombreCompleto;
    private String cedula;
    private double ingresosMensuales;
    private int cantidadVehiculos;
    private boolean viveEnEcuador;

    public SolicitanteSubsidio(String nombreCompleto, String cedula,double ingresosMensuales, int cantidadVehiculos,boolean viveEnEcuador) {
        this.nombreCompleto = nombreCompleto;
        this.cedula = cedula;
        setIngresosMensuales(ingresosMensuales);
        setCantidadVehiculos(cantidadVehiculos);
        this.viveEnEcuador = viveEnEcuador;
    }

    // Getters y Setters
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public double getIngresosMensuales() {
        return ingresosMensuales;
    }

    public void setIngresosMensuales(double ingresosMensuales) {
        if (ingresosMensuales >= 470.0) {
            this.ingresosMensuales = ingresosMensuales;
        } else {
            System.out.println("Los ingresos mensuales deben ser mayores o iguales a " + 470.0);
        }
    }

    public int getCantidadVehiculos() {
        return cantidadVehiculos;
    }

    public void setCantidadVehiculos(int cantidadVehiculos) {
        if (cantidadVehiculos >= 0) {
            this.cantidadVehiculos = cantidadVehiculos;
        } else {
            System.out.println("La cantidad de vehículos debe ser un número positivo");
            this.cantidadVehiculos = 0; //valor por defecto
        }
    }

    public boolean getViveEnEcuador() {
        return viveEnEcuador;
    }

    public void setViveEnEcuador(boolean viveEnEcuador) {
        this.viveEnEcuador = viveEnEcuador;
    }

    // Metodo para verificar si el subsidio es aprobado
    public boolean subsidioAprobado() {
        return ingresosMensuales <= 1200.0 && cantidadVehiculos <= 1 && viveEnEcuador;
    }

    public void generarResultado() {
        System.out.println("\n=== RESULTADO DE SOLICITUD ===");
        System.out.println("Solicitante: " + nombreCompleto);
        System.out.println("Cedula: " + cedula);

        if (subsidioAprobado()) {
            System.out.println("SUBSIDIO APROBADO");
            System.out.println("Cumple con todos los requisitos");
            return;
        } else {
            System.out.println("SUBSIDIO RECHAZADO");
            System.out.println("Motivos:");
            if (ingresosMensuales > 1200.0) System.out.println("- Ingresos mensuales " + ingresosMensuales + " mayores a " + 1200.0);
            else if (cantidadVehiculos > 1) System.out.println("- Posee " + cantidadVehiculos + " vehículos (máximo permitido: " + 1 + ")");
            else if (!viveEnEcuador) System.out.println("- No reside en Ecuador");
        }
    }

    public String toString() {
        return "DATOS DEL SOLICITANTE:\n" + "Nombre: " + nombreCompleto + "\n" + "Cedula: " + cedula + "\n" + "Ingresos Mensuales: " + ingresosMensuales + "\n" + "Cantidad de Vehículos: " + cantidadVehiculos + "\n" + "Reside en Ecuador: " + (viveEnEcuador ? "Sí" : "No");//Operador ternario
    }

    public static void mostrarReglasSubsidio() {
        System.out.println("\n=== CONDICIONES PARA EL SUBSIDIO ===");
        System.out.println("1. Ingresos mensuales menores a " + 1200.0);
        System.out.println("2. Máximo " + 1 + " vehículo registrado");
        System.out.println("3. Residencia en Ecuador (no aplica para extranjeros)");
    }

    // Metodo sin parámetros (consumo base)
    public double calcularConsumoMensual() {
        // Suponiendo un recorrido mensual promedio de 1000 km
        return 1000.0 / 40.0;
    }

    // Metodo con parámetro para kilómetros adicionales
    public double calcularConsumoMensual(double kmExtra) {
        return 1000.0 + kmExtra / 40.0;
    }
}