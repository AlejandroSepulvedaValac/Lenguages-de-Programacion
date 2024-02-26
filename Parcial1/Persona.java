package Parcial1;

// Abstracción (capacidad de crear una clase con propiedades y métodos)
public class Persona {

    // Encapsulamiento (con los parámetros private y  se modificarán las
    // propiedades con métodos propios de la clase)
    private String nombre, ocupacion, horaLevantar, orientacionSexual;
    private int edad, numeroHermanos;

    // Constructor
    // Polimorfismo (hacer que un mismo método ejecute tareas diferentes)
    public Persona(String nombre, String ocupacion, String horaLevantar, String orientacionSexual, int edad, int numeroHermanos){
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.horaLevantar = horaLevantar;
        this.orientacionSexual = orientacionSexual;
        this.edad = edad;
        this.numeroHermanos = numeroHermanos;
    }

    public Persona(String nombre, String ocupacion, String horaLevantar, int edad){
        this.nombre = nombre;
        this.ocupacion = ocupacion;
        this.horaLevantar = horaLevantar;
        this.edad = edad;
    }

    // Getter and Setter
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public  void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHoraLevantar() {
        return horaLevantar;
    }
    
    public  void setHoraLevantar(String horaLevantar) {
        this.horaLevantar = horaLevantar;
    }

    public String getOrientacionSexual() {
        return orientacionSexual;
    }
    
    public  void setOrientacionSexual(String orientacionSexual) {
        this.orientacionSexual = orientacionSexual;
    }

    public int getEdad() {
        return edad;
    }
    
    public  void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroHermanos() {
        return numeroHermanos;
    }
    
    public  void setNumerosHermanos(int numeroHermanos) {
        this.numeroHermanos = numeroHermanos;
    }

    public void comerDesayuno(){
        System.out.println("¡" + nombre + " está comiendo su desayuno!");
    }

    public void cogerTransporte(){
        System.out.println("¡" + nombre + " está cogiendo su transporte!");
    }

    public void despedirseDeMama(){
        System.out.println("¡" + nombre + " está despidiendose de su madre!");
    }
}
