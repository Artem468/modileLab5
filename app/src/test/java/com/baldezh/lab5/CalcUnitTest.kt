package com.baldezh.lab5

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class CalcUnitTest {
    @Test
    fun calcIsCorrect() {
        val calc1=CalcImpl(false,200.0)
        assertEquals(321.8, calc1.Calc(),0.01)

        val calc2=CalcImpl(true,210.0)
        assertEquals(388.92, calc2.Calc(),0.01)

        val calc3=CalcImpl(false,200.0)
        assertEquals(321.8, calc3.Calc(),0.01)
    }
}