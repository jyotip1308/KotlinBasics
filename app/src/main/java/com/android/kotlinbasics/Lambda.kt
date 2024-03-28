package com.android.kotlinbasics

fun main(){

    var myFuncVariable: (a: Double, b: Double) -> Double = ::mySum

    //Three tarikas of passing function into a function also known as higher order function
    calc(28.0, { a,b->a+b })
    calc(28.0) { a, b -> a + b }
    calc(28.0,::mySum)
}




fun mySum(a: Double, b: Double): Double {
    return a + b
}

fun calc(x: Double, power :(a:Double, b:Double) -> Double){
    println(power(3.0,4.0))
}


