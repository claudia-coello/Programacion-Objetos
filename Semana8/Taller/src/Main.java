import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int opc = 0;
        Scanner entrada = new Scanner(System.in);
        /*
    1. Estructura de Datos
        ◦ Utilice un ArrayList<Double> para almacenar los precios ingresados por el usuario.
        */
        GestionPrecios precios = new GestionPrecios();
        /*
    2. Menú Principal
El sistema debe presentar un menú en consola con las siguientes opciones:
===== MENÚ DE PRECIOS INMOBILIARIOS =====
    1. Ingresar precio
    2. Mostrar todos los precios
    3. Mostrar precio más alto
    4. Mostrar precio más bajo
    5. Mostrar precio iguales
    6. Buscar un precio específico
    7. Salir
Seleccione una opción:
        * */
        do{
            boolean valido = false;
            while (!valido){
                try {
                    //Si ocurre un error y el menu no esta en este try no aparecera
                    System.out.println("===== MENÚ DE PRECIOS INMOBILIARIOS =====");
                    System.out.println("1. Ingresar precio");
                    System.out.println("2. Mostrar todos los precios");
                    System.out.println("3. Mostrar precio más alto");
                    System.out.println("4. Mostrar precio más bajo");
                    System.out.println("5. Mostrar precio iguales");
                    System.out.println("6. Buscar un precio específico");
                    System.out.println("7. Salir");

                    System.out.println("Seleccione una opción:");
                    opc = entrada.nextInt();
                    valido = true;
                }catch (InputMismatchException e){
                    System.out.println("Error. Por favor ingrese un numero entero.");
                    entrada.nextLine();//Consume el buffer para evitar un ciclo infinito
                }
            }

            entrada.nextLine();
            switch (opc){
                case 1:
                    mostrarMensaje("\rIngresando precio");
                    /*
                    Opción 1: Ingresar precio
                        ◦ Solicitar al usuario un valor numérico (double). Con try catch
                        ◦ Agregar el valor al ArrayList.
                        ◦ Validar que sea un número mayor que cero. Con if
                    * */
                    try{//Las clases no deberian pedir datos por eso lo pedimos en main
                        System.out.println("Ingrese el precio del producto: ");
                        double precio = entrada.nextDouble();
                        entrada.nextLine();

                        precio = Math.round(precio * 100.0) / 100.0;//Redondea a dos decimales para evitar conflictos (Math viene por defecto y no necesita importarse)

                        if (precio < 0.00){
                            System.out.println("Error. El numero no puede ser menor a 0.");
                        }else{
                            precios.ingresarPrecio(precio);
                            System.out.println("El precio fue ingresado exitosamente.");
                        }

                    }catch (Exception e){
                        System.out.println("Error. Debe ser un numero.");
                    }
                    break;

                case 2:
                    /*
                    * Opción 2: Mostrar todos los precios
                        ◦ Mostrar cada precio almacenado.
                        ◦ Si no hay precios, mostrar el mensaje: "No existen precios registrados."
                    * */

                    mostrarMensaje("\rMostrando todos los precios");
                    precios.mostrarPrecios();
                    break;
                case 3:
                    /*
                    * Opción 3: Mostrar el precio más alto
                        ◦ Recorrer el ArrayList para obtener el valor máximo.
                        ◦ Mostrar el resultado.
                    * */
                    mostrarMensaje("\rMostrando precio más alto");
                    precios.precioMasAlto();
                    break;
                case 4:
                    mostrarMensaje("\rMostrando precio más bajo");
                    precios.precioMasBajo();
                    break;
                case 5:
                    mostrarMensaje("\rMostrando precio iguales");
                    /*
                    * Opción 5: Mostrar el precio iguales
                        ◦ Recorrer el ArrayList para obtener el valor igual.
                        ◦ Mostrar el resultado.
                    * */
                    precios.precioIguales();
                    break;
                case 6:
                    mostrarMensaje("\rBuscando un precio específico");
                    /*
                    *Opción 6: Buscar un precio
                            ◦ Pedir un precio al usuario.
                            ◦ Verificar si ese precio existe en el ArrayList usando contains.
                            ◦ Mostrar un mensaje indicando si se encontró o no.
                    * */
                    try {
                        System.out.println("Ingrese el precio que desea buscar: ");
                        double precio = entrada.nextDouble();

                        if (precio < 0) System.out.println("Error. El precio debe ser un numero mayor a cero.");
                        else precios.buscarPrecio(precio);

                    }catch (InputMismatchException e){
                        System.out.println("Error. El precio debe ser un numero.");
                    }
                    break;
                case 7:
                    mostrarMensaje("\rSaliendo");
                    break;
                default:
                    System.out.println("Error. Esa opcion no existe.");
            }
        }while(opc!=7);
    }

    static void mostrarMensaje(String mensaje){//Es static porque el main al ser static solo puede llamar metodos estaticos
        //Muestra un mensaje con efecto de retardo
        for (int i = 0; i < 3; i++) {
            mensaje += '.';
            System.out.print(mensaje);
            try { Thread.sleep(250); } catch (Exception e) {}//hace el efecto de retardo para que se note el cambio
            //Usa try catch porque sleep() puede ser interrumpido, por eso Java te obliga a manejarlo.
        }
        System.out.println();
    }

}