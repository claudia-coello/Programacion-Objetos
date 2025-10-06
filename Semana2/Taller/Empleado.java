import java.util.Scanner;
/*
* Problema: Sistema de gestión de empleados en una empresa. Cada empleado tiene un nombre, un cargo, un salario y una fecha de ingreso a la empresa.
Objetivo: Desarrollar una clase en Java llamada Empleado que tenga los atributos mencionados anteriormente y un método
 para mostrar la información del empleado. Luego, crearemos tres objetos de esta clase, cada uno representando un empleado diferente,
 * y solicitaremos al usuario que ingrese los detalles de cada empleado a través del teclado.
* */
public class Empleado {
    String nombre, cargo, fechaIngreso;
    double salario;
    Scanner entrada = new Scanner(System.in);

    public Empleado(String nombre, String cargo, String fechaIngreso, double salario){
        this.cargo          = cargo;
        this.nombre         = nombre;
        this.fechaIngreso   = fechaIngreso;
        this.salario        = salario;
    }

    void presentarInformacion(){
        System.out.println("Informacion del empleado");
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Fecha: " + fechaIngreso);
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        String nombreEmpleado, cargoEmpleado, fechaIngresoEmpleado;
        double salarioEmpleado;

        System.out.println("Ingrese el nombre del primer empleado: ");
        nombreEmpleado = entrada.nextLine();
        System.out.println("Ingrese la fecha de ingreso del primer empleado: ");
        fechaIngresoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el cargo del primer empleado: ");
        cargoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el salario del primer empleado: ");
        salarioEmpleado = entrada.nextDouble();

        entrada.nextLine();
        Empleado empleadoUno = new Empleado(nombreEmpleado, cargoEmpleado, fechaIngresoEmpleado, salarioEmpleado);

        System.out.println("Ingrese el nombre del segundo empleado: ");
        nombreEmpleado = entrada.nextLine();
        System.out.println("Ingrese la fecha de ingreso del segundo empleado: ");
        fechaIngresoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el cargo del segundo empleado: ");
        cargoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el salario del segundo empleado: ");
        salarioEmpleado = entrada.nextDouble();

        entrada.nextLine();
        Empleado empleadoDos = new Empleado(nombreEmpleado, cargoEmpleado, fechaIngresoEmpleado, salarioEmpleado);

        System.out.println("Ingrese el nombre del tercer empleado: ");
        nombreEmpleado = entrada.nextLine();
        System.out.println("Ingrese la fecha de ingreso del tercer empleado: ");
        fechaIngresoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el cargo del tercer empleado: ");
        cargoEmpleado = entrada.nextLine();
        System.out.println("Ingrese el salario del tercer empleado: ");
        salarioEmpleado = entrada.nextDouble();

        Empleado empleadoTres = new Empleado(nombreEmpleado, cargoEmpleado, fechaIngresoEmpleado, salarioEmpleado);

        empleadoUno.presentarInformacion();
        empleadoDos.presentarInformacion();
        empleadoTres.presentarInformacion();
    }
}
