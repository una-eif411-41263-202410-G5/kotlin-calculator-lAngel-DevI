package design.patterns.design.patterns.calculadora

class Calculadora{

    fun sumar(numero1: Float, numero2: Float): Float {
        return numero1 + numero2
    }

    fun restar(numero1: Float, numero2: Float): Float {
        return numero1 - numero2
    }

    fun multiplicacion(numero1: Float, numero2: Float): Float {
        return numero1 * numero2
    }

    fun division(numero1: Float, numero2: Float): Float {
        if (numero2 != 0.0f) {
            return numero1 / numero2
        } else {
            throw IllegalArgumentException("No se puede dividir por cero")
        }
    }

}