/*Trabajas en un sistema bancario. El cliente tiene una CuentaBancaria con saldo y titular. El saldo no se puede modificar directamente, solo mediante depósitos o retiros.
* Lo que tienes que hacer:
1. En el main, intenta escribir c.saldo = 500; y observa el error.
‘saldo' has private access in 'CuentaBancaria'. Es decir, saldo es una clase privada y no puede accederse por el main.
2. Crea los métodos:
   - depositar(double monto) → suma al saldo si el monto es positivo.
   - retirar(double monto) → resta del saldo solo si hay suficiente dinero.
   - getSaldo() → muestra el saldo actual.
3. Prueba diferentes casos: depósito válido, retiro válido, y retiro mayor al saldo.
4. Muestra los resultados.
* */

public class CuentaBancaria {
    private double saldo = 0;
    private String titular;

    public CuentaBancaria(double saldo, String titular){
        this.saldo = saldo;
        this.titular=titular;
    }

    public void depositar(double monto){
        if (monto > 0){
            System.out.println("Se ha depositado correctamente");
            saldo += monto;
        }
        else
            System.out.println("Error. El monto ingresado no puede ser menor a cero.");
    }
    public void retirar(double monto){
        if (monto <= saldo){
            System.out.println("Se ha retirado correctamente");
            saldo-=monto;
        }
        else
            System.out.println("Error. El monto es mayor a valor del saldo.");
    }
    public double getSaldo(){
        return saldo;
    }
    public void mostrarSaldoActual(){
        System.out.println("Saldo actual " + saldo);
    }
}
