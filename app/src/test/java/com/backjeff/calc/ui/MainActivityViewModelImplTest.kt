package com.backjeff.calc.ui

import android.app.Application
import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.backjeff.calc.calculator.Calculator
import io.kotest.matchers.shouldBe
import io.mockk.every
import io.mockk.mockk
import io.mockk.verify
import org.junit.Rule
import org.junit.Test

class MainActivityViewModelImplTest {

    @Rule
    @JvmField
    val instantTaskExecutorRule = InstantTaskExecutorRule()

    private lateinit var application: Application
    private lateinit var calculator: Calculator

    /*@Test
    fun `sum`() {
        // GIVEN
        val viewModel = getViewModel()
        val a = "10"
        val b = "5"
        val expectedResult = "15"
        every { calculator.sum(a.toInt(), b.toInt()) } returns expectedResult.toInt()

        // WHEN
        viewModel.sum(a, b)

        // THEN
        verify(exactly = 1) { calculator.sum(a.toInt(), b.toInt()) }
        viewModel.result.value shouldBe expectedResult
    }

    @Test
    fun `subtraction`() {
        // GIVEN
        val viewModel = getViewModel()
        val a = "10"
        val b = "5"
        val expectedResult = "5"
        every { calculator.subtract(a.toInt(), b.toInt()) } returns expectedResult.toInt()

        // WHEN
        viewModel.subtract(a, b)

        // THEN
        verify(exactly = 1) { calculator.subtract(a.toInt(), b.toInt()) }
        viewModel.result.value shouldBe expectedResult
    }

    @Test
    fun `multiplication`() {
        // GIVEN
        val viewModel = getViewModel()
        val a = "10"
        val b = "5"
        val expectedResult = "50"
        every { calculator.multiply(a.toInt(), b.toInt()) } returns expectedResult.toInt()

        // WHEN
        viewModel.multiply(a, b)

        // THEN
        verify(exactly = 1) { calculator.multiply(a.toInt(), b.toInt()) }
        viewModel.result.value shouldBe expectedResult
    }

    @Test
    fun `division`() {
        // GIVEN
        val viewModel = getViewModel()
        val a = "10"
        val b = "5"
        val expectedResult = "2"
        every { calculator.divide(a.toInt(), b.toInt()) } returns expectedResult.toInt()

        // WHEN
        viewModel.divide(a, b)

        // THEN
        verify(exactly = 1) { calculator.divide(a.toInt(), b.toInt()) }
        viewModel.result.value shouldBe expectedResult
    }

    private fun getViewModel(): MainActivityViewModelImpl {
        application = mockk(relaxed = true)
        calculator = mockk(relaxed = true)
        return MainActivityViewModelImpl(application, calculator)
    }*/
}
