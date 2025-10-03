import java.util.Scanner;
import java.util.HashMap;
/*
* Ejercicio 1: Registro de inventarios de plásticos
Objetivo: Registrar producto plástico y calcular valor total de stock.
*/
public class EjercicioUnoDeberUno {
    public static void main(String[] args){
        /*En Java, para “diccionarios” usas HashMap<K, V>.
        K = tipo de la clave, V = tipo del valor.
        put(clave, valor)	        Inserta o actualiza
        get(clave)	                Obtiene el valor
        remove(clave)	            Elimina la clave y su valor
        containsKey(clave)	        Comprueba si existe la clave
        containsValue(valor)	    Comprueba si existe el valor
        keySet()	                Devuelve todas las claves
        values()	                Devuelve todos los valores
        size()	                    Cantidad de pares
        */
        HashMap<String, Integer> producto = new HashMap<>();
        Scanner entrada = new Scanner(System.in);
        int stockFinal = 0, opc;
        do {
            String nombreProducto = " ";
            int stockProducto = 0, stockRetirado = 0;

            System.out.println("0.-Salir");
            System.out.println("1.-Agregar producto");
            System.out.println("2.-Retirar producto");
            System.out.println("3.-Ver stock");

            System.out.println("Ingrese su opcion: ");
            opc = entrada.nextInt();

            if (opc<0 || opc>3) System.out.println("Ingrese un numero entre 0 y 3");

            switch (opc){
                case 0:
                    System.out.println("Saliendo...");
                    break;
                case 1:
                    System.out.println("Ingrese el nombre del producto: ");
                    nombreProducto = entrada.nextLine();
                    entrada.nextLine(); //limpia el buffer

                    System.out.println("Ingrese el stock del producto: ");
                    stockProducto = entrada.nextInt();

                    producto.put(nombreProducto, stockProducto);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre del producto: ");
                    nombreProducto = entrada.nextLine();
                    entrada.nextLine();

                    if (producto.containsKey(nombreProducto)){
                        System.out.println("Ingrese el stock a retirar: ");
                        stockRetirado = entrada.nextInt();

                        stockFinal = producto.get(nombreProducto) - stockRetirado;
                        if (stockFinal < 0)
                            System.out.println("El valor ingresado es mayor a la que existe en el inventario. No se puede realizar la operacion.");
                        else
                            producto.put(nombreProducto, stockFinal);
                    }else System.out.println("El producto no esta registrado");
                    break;
                case 3:
                    for (String productoActual : producto.keySet())
                        System.out.println("Producto: " + productoActual + "\tStock: " + producto.get(productoActual));
                    break;
                default:
                    System.out.println("Opcion no valida. Intentelo nuevamente.");
                    break;
            }
        }while (opc != 0);
    }
}
/*
* Hola
* */