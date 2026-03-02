package Matematicas;

public class App {
    public static void main(String[] args) {

        Operacion operacion = new Operacion(10, 5);
        
        System.out.println("Suma: " + operacion.sumar());
        System.out.println("Resta: " + operacion.restar());
        System.out.println("Multiplicación: " + operacion.multiplicar());
        System.out.println("División: " + operacion.dividir());

    }
}