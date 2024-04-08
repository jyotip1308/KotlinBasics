package com.android.kotlinbasics

fun main(){
    val person = Person(
        name = " Jyoti",
        lastName = " Pandey",
        age =  21
    )
//    println(person)

    val listofPerson = listOf(person, Person(name = "Roman", lastName = "Reings", age= 34),
        Person("Riya", "Pandey", 12)
    )

    listofPerson.forEach{ item ->
        println(item.age)

    }

//    println(listofPerson)
}
data class Person(val name: String, val lastName: String, val age: Int)