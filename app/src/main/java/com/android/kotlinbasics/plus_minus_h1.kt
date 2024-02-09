package com.android.kotlinbasics

fun main(){
    val a = intArrayOf(2,3,4,5,0,6,-1,-3,-39)
    val s = a.size
    println(s)

    var positive = 0
    var negative = 0
    var zero = 0

    for (i in a) {
        when {
            i > 0 -> positive++
            i < 0 -> negative++
            else -> zero++
        }
    }

    println("Positive num: $positive")
    println("Negative num: $negative")
    println("Zero num: $zero")

    val pos = positive.toDouble()/s
    val formattedPos = String.format("%.6f", pos)
    println(formattedPos)

    val neg = negative.toDouble()/s
    val formattedNeg = String.format("%.6f", neg)
    println(formattedNeg)

    val zerroo = zero.toDouble()/s
    val formattedZero = String.format("%.6f", zerroo)
    println(formattedZero)

}