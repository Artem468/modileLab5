package com.baldezh.lab5

import androidx.test.espresso.Espresso
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activityRule1: ActivityTestRule<MainActivity> =
        ActivityTestRule(MainActivity::class.java)
    @get:Rule
    var activityRule2: ActivityTestRule<InputActivity> =
        ActivityTestRule(InputActivity::class.java)
    @get:Rule
    var activityRule3: ActivityTestRule<CalcActivity> =
        ActivityTestRule(CalcActivity::class.java)
    @Test
    fun useAppContext() {
        Espresso.onView(withId(R.id.inputButton)).perform(click())
        Espresso.onView(withId(R.id.distance)).perform(ViewActions.typeText("200"))
        Espresso.onView(withId(R.id.nauticalMile)).perform(click())
        Espresso.closeSoftKeyboard()
        Espresso.onView(withId(R.id.saveButton)).perform(click())
        Espresso.onView(withId(R.id.calcButton)).perform(click())
        Espresso.onView(withId(R.id.resultView)).check(ViewAssertions.matches(withText("Расстояние: 370.40 km")))
    }
}