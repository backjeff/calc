package com.backjeff.calc.calculator

import io.kotest.matchers.shouldBe
import org.junit.Test

internal class SubtractionTest {
    @Test
    fun `execute MUST subtract and return the result`() {
        // GIVEN
        val subtraction = Subtraction()

        // WHEN
        val result = subtraction.execute(10, 5)

        // THEN
        result shouldBe 5
    }
}
