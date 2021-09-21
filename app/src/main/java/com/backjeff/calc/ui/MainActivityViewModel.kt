package com.backjeff.calc.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.backjeff.calc.calculator.Calculator

class MainActivityViewModelImpl(
    application: Application,
    private val calculator: Calculator,
) : MainActivityViewModel(application, calculator) {
    override val result = MutableLiveData<String?>()
    override fun sum(a: String, b: String) {
        result.value = calculator.sum(a.toInt(), b.toInt()).toString()
    }

    override fun subtract(a: String, b: String) {
        result.value = calculator.subtract(a.toInt(), b.toInt()).toString()
    }

    override fun multiply(a: String, b: String) {
        result.value = calculator.multiply(a.toInt(), b.toInt()).toString()
    }

    override fun divide(a: String, b: String) {
        result.value = calculator.divide(a.toInt(), b.toInt()).toString()
    }
}

abstract class MainActivityViewModel(
    application: Application,
    calculator: Calculator,
) : AndroidViewModel(application) {
    abstract val result: LiveData<String?>
    abstract fun sum(a: String, b: String)
    abstract fun subtract(a: String, b: String)
    abstract fun multiply(a: String, b: String)
    abstract fun divide(a: String, b: String)
}
