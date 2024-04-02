package com.android.kotlinbasics

fun main(){
    val car = Car()
    println(car.color)
    println(car.model)
    println(car.drive())
}

class Car{
    val color: String = "Black"
    val model: String = "XMD"

    fun drive(){
        println("Let's Drive.......")
    }
}

