public class Main {
    public static void main(String[] args) {
        Auto a1 = new Auto("POO-123","Mazda",2023,"Julian","Rojo",5);
        Moto m1 = new Moto("POO-124","Thunder",2025,"Andres","Azul",150);
        Camion c1 = new Camion("POO-125","Hino",2005,"Lucia","Verde",5000);
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