public class Main {
    public static void main(){
        //1
        //bloque de codigo
        System.out.println("Ejercicio 1: ");
        int a = 2;
        int b = 3;
        int c;

        c = a * b;

        System.out.printf("Con bloque de codigo: " + c);
        System.out.printf("Con metodo: " + Metodo.multiplicacion(a, b));

        //2
        System.out.println("Ejercicio 2: ");
        Funcion.Calculadora calculadora = new Funcion.Calculadora();

        Funcion.mostrarResultado(calculadora.sumar(1,2));
        Funcion.mostrarResultado(Funcion.sumar(1,2));

        //3
        System.out.println("Ejercicio 3: ");
        Estructura.sumar(1, 2);

        //4
        System.out.println("Ejercicio 4: ");
        Encapsular persona1 = new Encapsular(); // La clase se llama encapsular pero crea un objeto de persona

        persona1.setNombre("Carlos");
        persona1.setEdad(25);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

        persona1.mostrarInformacion();
    }
}
