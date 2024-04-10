package com.android.kotlinbasics

fun main(){
/*
    val listOfItems = listOf("John", "Roman", "Rahul", "Jyoti")
    val listOfNumbers = listOf(4, 21, 54, 9) // without generics error
    val finder = Finder(list = listOfItems)
    finder.findItem(element = "Roman"){
        println("Found $it")
    }*/

    val listOfItems = listOf("John", "Roman", "Rahul", "Jyoti")
    val listOfNumbers = listOf(4, 21, 54, 9)
    val finder = Finder(list = listOfNumbers)
    finder.findItem(element = 44){
        println("Found $it")
    }

}


// Here we cannot pass int value to list so to handle this situation we use generics.
// Without generic
/*class Finder(private val list: List<String>){
    fun findItem(element: String, foundItem:(element: String?) -> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNullOrEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}*/


// With generic
class Finder<T>(private val list: List<T>){
    fun findItem(element: T, foundItem:(element: T?) -> Unit){
        val itemFoundList = list.filter {
            it == element
        }
        if (itemFoundList.isNullOrEmpty()) foundItem(null) else foundItem(itemFoundList.first())
    }
}
