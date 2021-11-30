package com.backjeff.calc.calculator

import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Test

internal class CalculatorTest {

    private lateinit var sum: Sum
    private lateinit var subtraction: Subtraction
    private lateinit var multiplication: Multiplication
    private lateinit var division: Division

    @Test
    fun `sum MUST call Sum execute`() {
        // GIVEN
        val calculator: Calculator = getCalculator()
        val a = 10
        val b = 5
        val expectedResult = 15
        every { sum.execute(a, b) } returns expectedResult

        // WHEN
        val result = calculator.sum(a, b)

        // THEN
        verify(exactly = 1) { sum.execute(a, b) }
        result shouldBe expectedResult
    }

    @Test
    fun `subtract MUST call Subtraction execute`() {
        // GIVEN
        val calculator: Calculator = getCalculator()
        val a = 10
        val b = 5
        val expectedResult = 5
        every { subtraction.execute(a, b) } returns expectedResult

        // WHEN
        val result = calculator.subtract(a, b)

        // THEN
        verify(exactly = 1) { subtraction.execute(a, b) }
        result shouldBe expectedResult
    }

    @Test
    fun `multiply MUST call Multiplication execute`() {
        // GIVEN
        val calculator: Calculator = getCalculator()
        val a = 10
        val b = 5
        val expectedResult = 50
        every { multiplication.execute(a, b) } returns expectedResult

        // WHEN
        val result = calculator.multiply(a, b)

        // THEN
        verify(exactly = 1) { multiplication.execute(a, b) }
        result shouldBe expectedResult
    }

    @Test
    fun `divide MUST call Division execute`() {
        // GIVEN
        val calculator: Calculator = getCalculator()
        val a = 10
        val b = 5
        val expectedResult = 2
        every { division.execute(a, b) } returns expectedResult

        // WHEN
        val result = calculator.divide(a, b)

        // THEN
        verify(exactly = 1) { division.execute(a, b) }
        result shouldBe expectedResult
    }

    private fun getCalculator(): Calculator {
        sum = mockk(relaxed = true)
        subtraction = mockk(relaxed = true)
        multiplication = mockk(relaxed = true)
        division = mockk(relaxed = true)
        return Calculator(
            sum = sum,
            subtraction = subtraction,
            multiplication = multiplication,
            division = division,
        )
    }
}
