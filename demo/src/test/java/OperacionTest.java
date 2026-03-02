import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import Matematicas.Operacion;

public class OperacionTest {
    int pruebas = 0;
    int pruebasTotales = 5;
    
    @Test
    public void testSumar() {
        Operacion operacion = new Operacion(5, 3);
        assertEquals(8, operacion.sumar());
        pruebas++;
    }

    @Test
    public void testRestar() {
        Operacion operacion = new Operacion(5, 3);
        assertEquals(2, operacion.restar());
        pruebas++;
    }

    @Test
    public void testMultiplicar() {
        Operacion operacion = new Operacion(5, 3);
        assertEquals(15, operacion.multiplicar());
        pruebas++;
    }

    @Test
    public void testDividir() {
        Operacion operacion = new Operacion(10, 2);
        assertEquals(5, operacion.dividir());
        pruebas++;
    }

        @Test
        public void testDividirPorCero() {
            Operacion operacion = new Operacion(10, 0);
            assertThrows(ArithmeticException.class, () -> operacion.dividir());
            pruebas++;
        }

    
}
