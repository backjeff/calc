package com.backjeff.calc.calculator

import com.backjeff.calc.di.module
import io.kotest.matchers.shouldBe
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin

internal class CalculatorNoMockkTest {

    @Before
    fun before() {
        startKoin {
            modules(module)
        }
    }

    @After
    fun after() {
        stopKoin()
    }

    @Test
    fun `sum MUST call Sum execute`() {
        // GIVEN
        val calculator = Calculator()
        val a = 10
        val b = 5
        val expectedResult = 15

        // WHEN
        val result = calculator.sum(a, b)

        // THEN
        result shouldBe expectedResult
    }

    @Test
    fun `subtract MUST call Subtraction execute`() {
        // GIVEN
        val calculator = Calculator()
        val a = 10
        val b = 5
        val expectedResult = 5

        // WHEN
        val result = calculator.subtract(a, b)

        // THEN
        result shouldBe expectedResult
    }

    @Test
    fun `multiply MUST call Multiplication execute`() {
        // GIVEN
        val calculator = Calculator()
        val a = 10
        val b = 5
        val expectedResult = 50

        // WHEN
        val result = calculator.multiply(a, b)

        // THEN
        result shouldBe expectedResult
    }

    @Test
    fun `divide MUST call Division execute`() {
        // GIVEN
        val calculator = Calculator()
        val a = 10
        val b = 5
        val expectedResult = 2

        // WHEN
        val result = calculator.divide(a, b)

        // THEN
        result shouldBe expectedResult
    }
}
