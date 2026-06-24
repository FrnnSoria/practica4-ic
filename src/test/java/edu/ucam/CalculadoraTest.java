package edu.ucam;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Clase de pruebas de unidad para verificar la Calculadora.
 */
public final class CalculadoraTest {

    /** Constante para el primer sumando de la prueba. */
    private static final int VALOR_A = 2;

    /** Constante para el segundo sumando de la prueba. */
    private static final int VALOR_B = 3;

    /** Constante para el resultado esperado de la suma. */
    private static final int RESULTADO_ESPERADO = 5;

    /**
     * Constructor por defecto de la clase de pruebas.
     */
    public CalculadoraTest() {
    }

    /**
     * Verifica que el metodo de suma funcione de forma correcta.
     */
    @Test
    public void testSumar() {
        final Calculadora calc = new Calculadora();
        assertEquals(RESULTADO_ESPERADO, calc.sumar(VALOR_A, VALOR_B));
    }
}
