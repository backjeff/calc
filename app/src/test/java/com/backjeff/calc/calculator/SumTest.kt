package com.backjeff.calc.calculator

import io.kotest.matchers.shouldBe
import org.junit.Test

internal class SumTest {
    @Test
    fun `execute MUST sum and return the result 15`() {
        // GIVEN
        val sum = Sum()

        // WHEN
        val result = sum.execute(10, 5)

        // THEN
        result shouldBe 15
    }

    @Test
    fun `execute MUST sum and return the result 10`() {
        // GIVEN
        val sum = Sum()

        // WHEN
        val result = sum.execute(5, 5)

        // THEN
        result shouldBe 10
    }
}
