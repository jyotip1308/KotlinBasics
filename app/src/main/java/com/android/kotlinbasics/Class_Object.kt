package com.android.kotlinbasics

fun main(){
    val car = Car(color = "Green", model = "NJKD")
    println("Color : ${car.color} Model : ${car.model}")


    val secondCar = Car(color = "Purple", model = "dekep")
    println("Color : ${secondCar.color} Model : ${secondCar.model}")

    car.color = "Black"
    car.model = "IUUE"
    println("Color : ${car.color} Model : ${car.model}")

    car.speed(30,40)
    car.speed(maxSpeed = 89, minSpeed = 34)

    println(car.drive())


}

//ONE WAY

/*class Car(color: String = "Red", model: String = "JKHK"){
 *//*   val color: String = "Black"
    val model: String = "XMD"*//*

    var color: String = color
    var model: String = model

    fun drive(){
        println("Let's Drive.......")
    }
}*/


//BETTER WAY

class Car(var color: String, var model: String){
    /*   val color: String = "Black"
       val model: String = "XMD"*/

    // This will change color, model of car and secondCar to orange and ij0ij
 /*   init {
        color = "Orange"
        model = "ijoij"
    }*/

   init {
       if (color =="Green")
           println("This is Green")

       else{
           println("This $color is not green")
       }
   }

    fun speed(minSpeed:Int, maxSpeed:Int){
        println("MinSpeed is $minSpeed and maxSpeed is $maxSpeed")
    }

    fun drive(){
        println("Let's Drive.......")
    }
}


