package com.android.kotlinbasics

fun main(){
    println("Hello Rohan,".append("Friend :)"))

    println(5.add(4))

    println("Who is she,".sub(9))

    println("This is fun".removeFirstAndLastChars())


}

fun String.append(toAppend : String) : String{
    return this.plus(toAppend)
}

fun Int.add(toAdd : Int) : Int{
    return this.plus(toAdd)
}

fun String.sub(toAdd : Int) : String {
    return this.plus(toAdd)
}

fun String.removeFirstAndLastChars() : String = this.substring(1, this.length-1)


/*
fun String.removeFirstAndLastChars() {
    substring(1, this.length-1)
}
*/
