import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String placa, marca,prop, color;
        int anio, num_puertas,cilindrada,carga_maxima;

        System.out.println("Ingrese la placa: ");
        placa = entrada.nextLine();
        System.out.println("Ingrese la marca: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        prop=entrada.nextLine();
        System.out.println("Ingrese el color de su vehiculo: ");
        color=entrada.nextLine();
        System.out.println("Ingrese el numero de puertas: ");
        num_puertas=entrada.nextInt();
        entrada.nextLine();

        Auto a1 = new Auto(placa,marca,anio,prop,color,num_puertas);

        System.out.println("Ingrese la placa: ");
        placa = entrada.nextLine();
        System.out.println("Ingrese la marca: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        prop=entrada.nextLine();
        System.out.println("Ingrese el color de su vehiculo: ");
        color=entrada.nextLine();
        System.out.println("Ingrese el cilindraje:");
        cilindrada=entrada.nextInt();
        entrada.nextLine();

        Moto m1 = new Moto(placa,marca,anio,prop,color,cilindrada);

        System.out.println("Ingrese la placa: ");
        placa = entrada.nextLine();
        System.out.println("Ingrese la marca: ");
        marca = entrada.nextLine();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Ingrese su nombre:");
        prop=entrada.nextLine();
        System.out.println("Ingrese el color de su vehiculo: ");
        color=entrada.nextLine();
        System.out.println("Ingrese la carga maxima: ");
        carga_maxima= entrada.nextInt();
        entrada.nextLine();

        Camion c1 = new Camion(placa,marca,anio,prop,color,carga_maxima);


        System.out.println("Auto");
        a1.tocar_bocina();
        a1.apagar();
        a1.acelerar();
        a1.encender();
        System.out.println("Valor de la matricula: "+a1.calcularValorMatricula());
        System.out.println("-------");
        System.out.println("Moto");
        m1.caballito();
        m1.apagar();
        m1.acelerar();
        m1.encender();
        System.out.println("Valor de la matricula: "+m1.calcularValorMatricula());
        System.out.println("-------");
        System.out.println("Camión");
        c1.descargar();
        c1.apagar();
        c1.acelerar();
        c1.encender();
        System.out.println("Valor de la matricula: "+c1.calcularValorMatricula());
    }
}