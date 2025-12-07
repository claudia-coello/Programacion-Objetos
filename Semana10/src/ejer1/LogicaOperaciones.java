/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer1;

/**
 *
 * @author cla
 */
public class LogicaOperaciones {

    /**
     * @param args the command line arguments
     */

    public static double sumar(double primerNum, double segundoNum){
        return primerNum + segundoNum;
    }

    public static double restar(double primerNum, double segundoNum){
        return primerNum - segundoNum;
    }

    public static double multiplicar(double primerNum, double segundoNum){
        return primerNum * segundoNum;
    }

    public static double dividir(double primerNum, double segundoNum){
        if(segundoNum == 0) throw new FormatoInvalido("Error. no se puede dividir para cero.");
        return primerNum / segundoNum;
    }
}
