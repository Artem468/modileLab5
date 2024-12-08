package com.baldezh.lab5

class CalcImpl(var isSeaMile: Boolean, var miles: Double) {

    fun Calc() : Double {
        val conversionFactor = if (isSeaMile) 1.852 else 1.609
        return miles * conversionFactor

    }
}