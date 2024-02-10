package com.android.kotlinbasics

fun main(){
    val a = mData.a
    var max = a[0]
    var min = a[0]
    var sum = 0

    for (i in a){
        sum += i
        if(i > max){
            max = i
        }
        else if (i < min){
            min = i
        }
    }

    println(sum)

    println("Maximum value is: $max")
    println("Minimum Value is: $min")
}