/*
    Crear una clase abstracta llamada Juego con atributos base y un método abstracto.
    Crear las clases hijas MarioBros y CarreraVehiculos que hereden de Juego.
    Implementar una excepción personalizada para validar datos incorrectos.
    Gestionar los juegos dentro de un ArrayList.
* */

public abstract class Juego {
    private String nombre;
    private int yearLanzamiento;
    private String[] categorias = {"Accion", "Aventura", "Terror", "Plataforma", "Deporte", "Carreras"};//array estatico
    private double precio;
    private boolean multijugador;
    private String categoriaElejida;
    //contains -> in
    //equals para comparar
    public Juego(String nombre, int yearLanzamiento, double precio, boolean multijugador, String categoriaElejida) {
        this.nombre = nombre;
        this.yearLanzamiento = yearLanzamiento;
        this.precio = precio;
        this.multijugador = multijugador;
        setCategoriaElejida(categoriaElejida); // validación incluida
    }

    public Juego(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYearLanzamiento() {
        return yearLanzamiento;
    }

    public void setYearLanzamiento(int yearLanzamiento) {
        this.yearLanzamiento = yearLanzamiento;
    }

    public String[] getCategorias() {
        return categorias;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isMultijugador() {
        return multijugador;
    }

    public void setMultijugador(boolean multijugador) {
        this.multijugador = multijugador;
    }

    public String getCategoriaElejida() {
        return categoriaElejida;
    }

    public void setCategoriaElejida(String categoriaElejida) {
        for (String categoria:categorias){
            if (categoriaElejida.equals(categoria)) {
                this.categoriaElejida = categoriaElejida;
                return;
            }
        }
        try {
            throw new ElementoNoEncontradoException("Error. Categoria no encontrada en la lista.");
        }catch (ElementoNoEncontradoException c){
            System.out.println(c.getMessage());
        }
    }

    public abstract void mostrarDatosJuego();
}
class MarioBros extends Juego{
    private String personajePrincipal;

    @Override
    public void mostrarDatosJuego() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Año de lanzamiento: " + getYearLanzamiento());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Multijugador: " + (isMultijugador() ? "Sí" : "No"));
        System.out.println("Categoría elegida: " + getCategoriaElejida());
        System.out.println("Personaje principal: " + personajePrincipal);
    }

    public MarioBros(){}

    public MarioBros(String nombre, int yearLanzamiento, double precio, boolean multijugador, String categoriaElejida, String personajePrincipal) {
        super(nombre, yearLanzamiento, precio, multijugador, categoriaElejida);
        this.personajePrincipal = personajePrincipal;
    }

    public String getPersonajePrincipal() {
        return personajePrincipal;
    }

    public void setPersonajePrincipal(String personajePrincipal) {
        this.personajePrincipal = personajePrincipal;
    }
}
class CarreraVehiculos extends Juego{
    private String[] carrosDisponibles = {
            "Deportivo",
            "F1",
            "Rally",
            "OffRoad",
            "Muscle",
            "SUV",
            "Kart"
    };//son todos los carros que pueden elejir, solo necesitariamos el indice
    private String carroElejido;
    private boolean modoCarrera;

    public CarreraVehiculos(){}
    public CarreraVehiculos(String nombre, int yearLanzamiento, double precio, boolean multijugador, String categoriaElejida, String carroElejido, boolean modoCarrera) {
        super(nombre, yearLanzamiento, precio, multijugador, categoriaElejida);
        setCarroElejido(carroElejido); // valida si existe
        this.modoCarrera = modoCarrera;
    }

    @Override
    public void mostrarDatosJuego() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Año de lanzamiento: " + getYearLanzamiento());
        System.out.println("Precio: " + getPrecio());
        System.out.println("Multijugador: " + (isMultijugador() ? "Sí" : "No"));
        System.out.println("Categoría elegida: " + getCategoriaElejida());
        System.out.println("Carro elegido: " + carroElejido);
        System.out.println("Modo carrera: " + (modoCarrera ? "Activado" : "Desactivado"));
    }

    public String[] getCarro() {
        return carrosDisponibles;
    }

    public boolean isModoCarrera() {
        return modoCarrera;
    }

    public void setModoCarrera(boolean modoCarrera) {
        this.modoCarrera = modoCarrera;
    }

    public String getCarroElejido() {
        return carroElejido;
    }

    public void setCarroElejido(String carroElejido) throws ElementoNoEncontradoException {
        for (String carro:carrosDisponibles){
            if (carroElejido.equals(carro)) {
                this.carroElejido = carroElejido;
                return;
            }
        }
        try {
            throw new ElementoNoEncontradoException("Error. Carro no encontrado en la lista.");
        }catch (ElementoNoEncontradoException c){
            System.out.println(c.getMessage());
        }

    }
}

