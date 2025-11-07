public class Main {
    public static void main(String[] args){
        Persona p1 = new Persona("122154","CC",22);
        Estudiante p2 = new Estudiante("547896","MP",25, "BCG-88");
        Limpieza l1 = new Limpieza("1758492","MG",28,"GTO-789");

        p1.imprimir();
        p2.imprimir();
        l1.imprimir_limpieza();
    }
}