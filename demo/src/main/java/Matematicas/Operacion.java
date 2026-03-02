package Matematicas;

public class Operacion {
    private float num1;
    private float num2;

    public Operacion(float num1, float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public float sumar(){
        return num1 + num2;
    }

    public float restar(){
        return num1 - num2;
    }

    public float multiplicar(){
        return num1 * num2;
    }

    public float dividir(){
        if(num2 != 0){
            return num1 / num2;
        } else {
            throw new ArithmeticException("No se puede dividir entre cero.");
        }
    }

    
}
