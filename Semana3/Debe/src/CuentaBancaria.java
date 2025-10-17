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
