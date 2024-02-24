package design.patterns.calculadoraTest


import design.patterns.design.patterns.calculadora.Calculadora
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
class CalculatorTest {
    private val calculadora = Calculadora()
    @Test
    fun `Calcular la suma de dos valores`() {
        val numero1: Float = 10.0f
        val numero2: Float = 25.23f
        assertEquals(35.23f, calculadora.sumar(numero1, numero2))
    }

    @Test
    fun `Calcular la resta de dos valores`() {
        val numero1: Float = 10.0f
        val numero2: Float = 25.23f
        assertEquals(-15.23f, calculadora.restar(numero1, numero2))
    }

    @Test
    fun `Calcular la multiplicacion de dos valores`() {
        val numero1: Float = 1.0f
        val numero2: Float = 2.0f
        assertEquals(2.0f, calculadora.multiplicacion(numero1, numero2))
    }

    @Test
    fun `Calcular la division de dos valores`() {
        val numero1: Float = 6.0f
        val numero2: Float = 2.0f
        assertEquals(3.0f, calculadora.division(numero1, numero2))
    }

}