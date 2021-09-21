package com.backjeff.calc.calculator

import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.dsl.module

internal class CalculatorMockkTest {

    private var sum: Sum = mockk(relaxed = true)
    private var subtraction: Subtraction = mockk(relaxed = true)
    private var multiplication: Multiplication = mockk(relaxed = true)
    private var division: Division = mockk(relaxed = true)

    @Before
    fun before() {
        startKoin {
            modules(
                module {
                    single { sum }
                    single { subtraction }
                    single { multiplication }
                    single { division }
                }
            )
        }
    }

    @After
    fun after() {
        stopKoin()
    }

    /*@Test
    fun `sum MUST call Sum execute`() {
        // GIVEN
        val calculator: Calculator = Calculator()
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
        val calculator: Calculator = Calculator()
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
        val calculator: Calculator = Calculator()
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
        val calculator: Calculator = Calculator()
        val a = 10
        val b = 5
        val expectedResult = 2
        every { division.execute(a, b) } returns expectedResult

        // WHEN
        val result = calculator.divide(a, b)

        // THEN
        verify(exactly = 1) { division.execute(a, b) }
        result shouldBe expectedResult
    }*/
}
