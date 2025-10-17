//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*//Primer ejercicio
        Persona persona = new Persona("Maria", "Arquitecta", 18);
        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());

        persona.setEdad(-8);
        System.out.println(persona.getEdad());

        persona.setNombre("");
        System.out.println(persona.getNombre());*/

        //------------------------------Segundo Ejercicio
        /*CuentaBancaria c = new CuentaBancaria(200,"Maria");
        c.mostrarSaldoActual();

        c.depositar(200);
        System.out.println(c.getSaldo());

        c.retirar(150);
        c.mostrarSaldoActual();

        c.depositar(-4);
        System.out.println(c.getSaldo());

        c.retirar(1000);
        c.mostrarSaldoActual();

        System.out.println("Saldo final: " + c.getSaldo());*/

        //-------------------------------Tercer Ejercicio
        Vehiculo v = new Vehiculo("Toyota", "Corolla","rojo");

        System.out.println("Marca: " + v.marca);

        System.out.println("Modelo: " + v.getModelo());

        System.out.println("Velocidad máxima: " + v.getVelocidadMaxima());

        // System.out.println("Código: " + v.codigoSeguridad);//sale error

        System.out.println("Color: " + v.getColor());
        v.setColor("verde");

        v.setColor("azul");

        System.out.println("Color: " + v.getColor());
    }
}