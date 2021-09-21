package com.backjeff.calc.core

import android.app.Application
import com.backjeff.calc.di.module
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class CalculatorApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@CalculatorApplication)
            modules(module)
        }
    }
}
