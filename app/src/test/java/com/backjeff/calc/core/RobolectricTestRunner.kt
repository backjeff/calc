package com.backjeff.calc.core

import android.app.Activity
import android.os.Build
import androidx.test.core.app.ApplicationProvider
import com.backjeff.calc.di.module
import com.backjeff.calculator.core.RobolectricTestApplication
import io.mockk.unmockkAll
import org.junit.After
import org.junit.Before
import org.junit.runner.RunWith
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.context.stopKoin
import org.koin.core.module.Module
import org.koin.test.KoinTest
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.android.controller.ActivityController
import org.robolectric.annotation.Config
import org.robolectric.annotation.LooperMode
import org.robolectric.annotation.LooperMode.Mode.PAUSED

@RunWith(RobolectricTestRunner::class)
@Config(
    sdk = [Build.VERSION_CODES.O_MR1],
    application = RobolectricTestApplication::class
)
@LooperMode(PAUSED)
abstract class RobolectricTestRunner : KoinTest {

    private lateinit var activityController: ActivityController<Activity>

    internal lateinit var activity: Activity

    open fun onSetup() {}

    open fun onTearDown() {}

    open fun loadKoinModules(): List<Module> {
        return emptyList()
    }

    @Before
    fun setUp() {
        stopKoin()
        startKoin {
            androidContext(ApplicationProvider.getApplicationContext())
            modules(module)
            modules(loadKoinModules())
        }

        activityController = Robolectric.buildActivity(Activity::class.java)
        activity = activityController.get()

        onSetup()
    }

    @After
    fun tearDown() {
        onTearDown()
        unmockkAll()
    }
}
