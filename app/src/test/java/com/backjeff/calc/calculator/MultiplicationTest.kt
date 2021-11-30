package com.backjeff.calc.calculator

import io.kotest.matchers.shouldBe
import org.junit.Test

internal class MultiplicationTest {
    @Test
    fun `execute MUST multiply and return the result`() {
        // GIVEN
        val multiplication = Multiplication()

        // WHEN
        val result = multiplication.execute(10, 5)

        // THEN
        result shouldBe 50
    }
}
