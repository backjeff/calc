package com.backjeff.calc.di

import com.backjeff.calc.calculator.Calculator
import com.backjeff.calc.calculator.Division
import com.backjeff.calc.calculator.Multiplication
import com.backjeff.calc.calculator.Subtraction
import com.backjeff.calc.calculator.Sum
import com.backjeff.calc.ui.MainActivityViewModel
import com.backjeff.calc.ui.MainActivityViewModelImpl
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val module = module {
    single { Sum() }
    single { Subtraction() }
    single { Multiplication() }
    single { Division() }

    factory {
//        Calculator()
        Calculator(get(), get(), get(), get())
    }

    viewModel<MainActivityViewModel> {
        MainActivityViewModelImpl(
            application = get(),
            calculator = get()
        )
    }
}
