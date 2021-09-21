package com.backjeff.calc.ui

import android.os.Looper.getMainLooper
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Lifecycle
import androidx.test.core.app.launchActivity
import com.backjeff.calc.R
import com.backjeff.calc.core.RobolectricTestRunner
import com.google.android.material.textfield.TextInputEditText
import io.kotest.matchers.shouldBe
import org.junit.Test
import org.robolectric.Shadows.shadowOf

internal class MainActivityTest : RobolectricTestRunner() {

    @Test
    fun `GIVEN MainActivity WHEN sum THEN result must match`() {
        // GIVEN
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.STARTED)

        scenario.onActivity { activity ->
            val a = activity.findViewById<TextInputEditText>(R.id.a)
            val b = activity.findViewById<TextInputEditText>(R.id.b)
            val button = activity.findViewById<Button>(R.id.buttonSum)
            val result = activity.findViewById<TextView>(R.id.result)

            // WHEN
            a.setText("20")
            b.setText("2")
            button.performClick()

            shadowOf(getMainLooper()).idle()

            // THEN
            result.text shouldBe "22"
        }
    }

    @Test
    fun `GIVEN MainActivity WHEN subtract THEN result must match`() {
        // GIVEN
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.STARTED)

        scenario.onActivity { activity ->
            val a = activity.findViewById<TextInputEditText>(R.id.a)
            val b = activity.findViewById<TextInputEditText>(R.id.b)
            val button = activity.findViewById<Button>(R.id.buttonSubtract)
            val result = activity.findViewById<TextView>(R.id.result)

            // WHEN
            a.setText("20")
            b.setText("2")
            button.performClick()

            shadowOf(getMainLooper()).idle()

            // THEN
            result.text shouldBe "18"
        }
    }

    @Test
    fun `GIVEN MainActivity WHEN multiply THEN result must match`() {
        // GIVEN
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.STARTED)

        scenario.onActivity { activity ->
            val a = activity.findViewById<TextInputEditText>(R.id.a)
            val b = activity.findViewById<TextInputEditText>(R.id.b)
            val button = activity.findViewById<Button>(R.id.buttonMultiply)
            val result = activity.findViewById<TextView>(R.id.result)

            // WHEN
            a.setText("20")
            b.setText("2")
            button.performClick()

            shadowOf(getMainLooper()).idle()

            // THEN
            result.text shouldBe "40"
        }
    }

    @Test
    fun `GIVEN MainActivity WHEN divide THEN result must match`() {
        // GIVEN
        val scenario = launchActivity<MainActivity>()
        scenario.moveToState(Lifecycle.State.STARTED)

        scenario.onActivity { activity ->
            val a = activity.findViewById<TextInputEditText>(R.id.a)
            val b = activity.findViewById<TextInputEditText>(R.id.b)
            val buttonSum = activity.findViewById<Button>(R.id.buttonDivide)
            val result = activity.findViewById<TextView>(R.id.result)

            // WHEN
            a.setText("20")
            b.setText("2")
            buttonSum.performClick()

            shadowOf(getMainLooper()).idle()

            // THEN
            result.text shouldBe "10"
        }
    }
}
