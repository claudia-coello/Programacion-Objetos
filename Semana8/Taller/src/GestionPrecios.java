import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionPrecios {
    private ArrayList<Double> precios = new ArrayList<>();//Declarado e inicializado (sin el new arrayList<>() esta declarado pero no esta inicializado y no puedo agregar nada)
    Scanner entrada = new Scanner(System.in);

    //constructor
    public GestionPrecios(){
//constructor vacio
    }

    //getters y setters
    public ArrayList<Double> getPrecios() {
        return precios;
    }
    public void setPrecios(ArrayList<Double> precios) {
        this.precios = precios;
    }

    //metodos comunes
    public void ingresarPrecio(double precio){
        precios.add(precio);
    }
    public void mostrarPrecios(){
        //Para mostrar los precios, primero debe haber precios
        if(precios.isEmpty()){
            System.out.println("No existen precios registrados.");
        }else{
            for (int i = 0; i < precios.size(); i++) {
                System.out.println("Producto indice: "+ (i) +"\t|\tPrecio: " + precios.get(i));
            }
        }
    }
    public void precioMasAlto(){
        int indicePrecioMasAlto = 0;
        if(precios.isEmpty()){
            System.out.println("No existen precios registrados.");
        }else{
            for (int i = 1; i < precios.size(); i++) {
                if(precios.get(i) > precios.get(indicePrecioMasAlto)){
                    indicePrecioMasAlto = i;
                }
            }
            System.out.println("Producto precio mas alto en indice: "+ (indicePrecioMasAlto) +"\t|\tPrecio: " + precios.get(indicePrecioMasAlto));
        }
    }
    public void precioMasBajo(){
        int indicePrecioMasBajo = 0;
        if(precios.isEmpty()){
            System.out.println("No existen precios registrados.");
        }else{
            for (int i = 1; i < precios.size(); i++) {
                if(precios.get(i) < precios.get(indicePrecioMasBajo)){
                    indicePrecioMasBajo = i;
                }
            }
            System.out.println("Producto precio mas bajo en indice: "+ (indicePrecioMasBajo) +"\t|\tPrecio: " + precios.get(indicePrecioMasBajo));
        }
    }
    public void precioIguales(){
        boolean noCoincidencia = true;
        for (int i = 0; i < precios.size(); i++) {
            for (int j = 1; j < precios.size(); j++) {
                if (precios.get(i).equals(precios.get(j)) && (i != j)){//solo si los indices no son iguales porque si no se compararia consigo mismo
                    System.out.println("Coincidencia de precios en indices: "+ i + " y "+ j);
                    noCoincidencia = false;
                }
            }
        }
        if (noCoincidencia){
            System.out.println("No se encontraron coincidencias.");
        }
    }
    public void buscarPrecio(Double precioBuscado){
        if (precios.contains(precioBuscado))System.out.println("Se encontraron coincidencia");
        else System.out.println("No se encontraron coincidencias");
    }
}
