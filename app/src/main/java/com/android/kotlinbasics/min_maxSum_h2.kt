package com.android.kotlinbasics

fun main(){
    val a = mData.a
    val max = a[0]
    val min = a[0]
    var maxsum = 0
    var minsum = 0
    var counter = 0


    a.sort()
//    println(a)
    a.forEach {
        println(it)

        if(counter<4){
            minsum += it
        }
        if(counter>0){
            maxsum += it
        }
        counter++

    }



/*    for (i in a){
        sum += i

        if(i > max){
            max = i
        }
        else if (i < min){
            min = i
        }
    }*/



   /*val m =  (sum-max)
   val n =  (sum-min)*/

    println("Maximum value is: $max")
    println("Minimum Value is: $min")

//    println("$m $n")
    println("$minsum $maxsum")





}


