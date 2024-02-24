package design.patterns.calculadoraTest


import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class CalculatorTest {
    private val calculadora = Calculadora()

    @Test
    fun testSumar() {
        assertEquals(8.0, calculadora.sumar(5.0, 3.0))
        assertEquals(0.0, calculadora.sumar(0.0, 0.0))
        assertEquals(-2.0, calculadora.sumar(-5.0, 3.0))
    }

    @Test
    fun testRestar() {
        assertEquals(2.0, calculadora.restar(5.0, 3.0))
        assertEquals(0.0, calculadora.restar(5.0, 5.0))
        assertEquals(-8.0, calculadora.restar(-5.0, 3.0))
    }

    @Test
    fun testMultiplicar() {
        assertEquals(15.0, calculadora.multiplicar(5.0, 3.0))
        assertEquals(0.0, calculadora.multiplicar(5.0, 0.0))
        assertEquals(-15.0, calculadora.multiplicar(-5.0, 3.0))
    }

    @Test
    fun testDividir() {
        assertEquals(1.6666666666666667, calculadora.dividir(5.0, 3.0))
        assertEquals(Double.POSITIVE_INFINITY, calculadora.dividir(5.0, 0.0))
        assertEquals(-1.6666666666666667, calculadora.dividir(-5.0, 3.0))

        assertFailsWith<IllegalArgumentException> { calculadora.dividir(5.0, 0.0) }
    }


}