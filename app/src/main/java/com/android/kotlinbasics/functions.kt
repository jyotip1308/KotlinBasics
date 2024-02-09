package com.android.kotlinbasics

fun main(){
//    kotlin()

/*    println(sum(3,4))

   val c = age(2)

    println(age(3))

    println(checkAge(c))

    println(checkAge(age(1)))*/

    trailingLambda("Hello world"){
        sum(3,5)
    }


    trailingLambda2("Hello world"){
        print(it)
        sum(3,5)
        //print(it) --> this statement will cause error as last statement is always returned
                        // and here print(it) is not returning required Integer
    }
}

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