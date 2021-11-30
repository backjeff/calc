package com.backjeff.calc.calculator

class Calculator(
    private val sum: Sum,
    private val subtraction: Subtraction,
    private val multiplication: Multiplication,
    private val division: Division,
) {

    fun sum(a: Int, b: Int): Int {
        return sum.execute(a, b)
    }

    fun subtract(a: Int, b: Int): Int {
        return subtraction.execute(a, b)
    }

    fun multiply(a: Int, b: Int): Int {
        return multiplication.execute(a, b)
    }

    fun divide(a: Int, b: Int): Int {
        return division.execute(a, b)
    }
}
