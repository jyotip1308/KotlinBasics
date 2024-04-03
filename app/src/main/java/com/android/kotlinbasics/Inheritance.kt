package com.android.kotlinbasics

fun main(){

    val truck = Truck("Orange","JNKD")
    println("${truck.color}, ${truck.model}")
    truck.drive()
    truck.speed(30,50)
}

class Truck(color: String, model: String) : Car2(color, model){
    override fun speed(minSpeed: Int, maxSpeed: Int) {
        val fullSpeed = minSpeed + maxSpeed
        println("Truck full speed $fullSpeed")
    }

    override fun drive(){
        println("RUN.......")
    }
}



open class Car2(var color: String, var model: String){


    // This will change color, model of car and secondCar to orange and ij0ij
    /*   init {
           color = "Orange"
           model = "ijoij"
       }*/

//    init {
//        if (color =="Green")
//            println("This is Green")
//
//        else{
//            println("This $color is not green")
//        }
//    }

   open fun speed(minSpeed:Int, maxSpeed:Int){
        println("MinSpeed is $minSpeed and maxSpeed is $maxSpeed")
    }

    open fun drive(){
        println("Let's Drive.......")
    }
}