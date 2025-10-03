import java.util.Scanner;

public class ejercicioTablasMultiplicar {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = entrada.nextInt();

        for(int i = 1 ; i <= 5; i++)
            System.out.println(i + "x" + num + "=" + num*i);
    }
}