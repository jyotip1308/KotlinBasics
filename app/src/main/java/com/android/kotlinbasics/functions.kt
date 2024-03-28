package com.android.kotlinbasics

import android.os.Build
import android.util.Log
import java.time.Duration
import java.time.LocalTime
import java.time.format.DateTimeFormatter

fun main(){
//    kotlin()

/*    println(sum(3,4))

   val c = age(2)

    println(age(3))

    println(checkAge(c))

    println(checkAge(age(1)))*/

    val currentTime = LocalTime.now()
   
    println("READING 3 ADD TASK: " + "Adding Data")
    
    // Format the current time as "hh:mm a" (12-hour clock with AM/PM)
    var time = currentTime.format(DateTimeFormatter.ofPattern("hh:mm a"))
    time = time.replace("am", "AM").replace("pm", "PM")

    println("TIME" + "Current time: $time")

    val time1 = LocalTime.parse(time, DateTimeFormatter.ofPattern("hh:mm a"))

    println("TIME 2" + "Current time: $time1")
//    println("TIME 3","server time: ${mainViewModel.MASTERDATA.value?.shift_timings?.get(0)?.lunch_start.toString().trim()}")

    val time2 = LocalTime.parse("12:00 pm", DateTimeFormatter.ofPattern("hh:mm a"))

    // Calculate difference in minutes
    val duration = Duration.between(time1, time2)
    val differenceInMinutes = duration.toMinutes()
    println("TIME DIFF: " + "Time difference: $differenceInMinutes minutes")

    }
   /* trailingLambda("Hello world"){
        sum(3,5)
    }


    trailingLambda2("Hello world"){
        print(it)
        sum(3,5)
        //print(it) --> this statement will cause error as last statement is always returned
                        // and here print(it) is not returning required Integer
    }*/


fun kotlin(){
      val x = 20
      val y = 30
      val c = x + y
    println(c)
}

val sum: (Int,Int) -> Int = { a , b -> a+b}
val sum2: (Int,Int) -> Int = { a , b -> a+b}

val age: (Int) -> Int = { a -> 7*a}
val checkAge: (Int) -> Boolean = { a -> a>14}

fun trailingLambda(m: String, funAsParameter:()->Int){
    println("$m ${funAsParameter()}")
}

fun trailingLambda2(m: String, funAsParameter:(String)->Int){
    println("$m ${funAsParameter("Message")}")
}