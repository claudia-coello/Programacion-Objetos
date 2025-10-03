import  java.util.Scanner;
public class Main {
    public static void ejercicioSwitch(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("Ingrese un dia de la semana(Lunes,Martes,Jueves,Viernes,Sabado;domingo): " + diaSemana);
        String diaSemana = entrada.nextLine();

        switch (diaSemana){
            case "Lunes":
                System.out.println("Hoy es: " + diaSemana);
                break;
            case "Martes":
                System.out.println("Hoy es: " + diaSemana);
                break;
            case "Miercoles":
                System.out.println("Hoy es: " + diaSemana);
                break;
            case "Jueves":
                System.out.println("Hoy es: " + diaSemana);
                break;
            case "Viernes":
                System.out.println("Hoy es: " + diaSemana);
                break;
            case "Sabado":
                System.out.println("Hoy es: " + diaSemana);
                break;
            case "Domingo":
                System.out.println("Hoy es: " + diaSemana);
                break;
            default:
                System.out.println("Opcion no valida");
                break;
        }
    }
}