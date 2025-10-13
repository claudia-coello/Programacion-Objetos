import java.util.Scanner;

/*Actividad 4: Simulación básica de una cuenta bancaria

Objetivo:
Aplicar los conceptos básicos de Programación Orientada a Objetos (POO) creando una clase con atributos privados, constructor público y tres métodos propios públicos.

Enunciado:
Imagina que estás desarrollando un programa sencillo para un banco. Cada cliente puede abrir una cuenta, consultar su saldo, depositar dinero y retirar dinero.

Tu tarea es crear una clase llamada CuentaBancaria que permita reutilizar la información del cliente y realizar acciones mediante métodos propios.

Requisitos técnicos:
    6. Crear la clase CuentaBancaria con los siguientes atributos privados:
        ◦ nombreTitular (String)
        ◦ saldo (double)
    7. Crear un constructor público que permita inicializar los datos del titular y el saldo inicial.
    8. Implementar los siguientes métodos propios públicos:
        ◦ mostrarInformacion(): Muestra el nombre del titular y el saldo actual.
        ◦ depositar(double monto): Aumenta el saldo.
        ◦ retirar(double monto): Disminuye el saldo si hay suficiente dinero.
    9. En la clase principal (Main):
        ◦ Crear un objeto de tipo CuentaBancaria.
        ◦ Llamar a los tres métodos en orden lógico.
        ◦ Mostrar cómo se reutiliza la información del objeto en cada acción.

          ¿Qué acciones realiza el objeto?
El objeto creado a partir de la clase CuentaBancaria puede realizar acciones a través de sus métodos propios. Estas acciones son:
    • mostrarInformacion(): muestra los datos almacenados en el objeto.
    • depositar(): modifica el saldo sumando un monto.
    • retirar(): modifica el saldo restando un monto si hay fondos suficientes.

Estas acciones se ejecutan desde la clase principal usando el objeto. Por ejemplo: CuentaBancaria cuenta1 = new CuentaBancaria("Lucía", 100.0); cuenta1.mostrarInformacion();
cuenta1.depositar(50.0); cuenta1.retirar(30.0);*/
public class CuentaBancaria {
    private String nombreTitular;
    private double saldo;
    Scanner entrada = new Scanner(System.in);

    public CuentaBancaria(String nombreTitular, double saldo){
        this.nombreTitular = nombreTitular;
        this.saldo = saldo;
    }

    public void mostrarInformacion(){
        System.out.printf("Nombre titular: " + nombreTitular + "\nSaldo: " + saldo + "\n");
    }

    public void depositar(double monto){
        saldo += monto;
    }

    public void retirar(double monto){
        if (saldo < monto){
            System.out.println("Fondos insuficientes");
        }else {
            saldo -= monto;
        }
    }

    public static void main(String[] args){
        double monto;
        Scanner entrada = new Scanner(System.in);
        CuentaBancaria cliente = new CuentaBancaria("Maria", 150.5);

        cliente.mostrarInformacion();

        System.out.println("Ingrese el monto a depositar: ");
        monto = entrada.nextDouble();
        cliente.depositar(monto);

        System.out.println("Cuanto monto desea retirar: ");
        monto = entrada.nextDouble();
        cliente.retirar(monto);

        cliente.mostrarInformacion();
    }
}
