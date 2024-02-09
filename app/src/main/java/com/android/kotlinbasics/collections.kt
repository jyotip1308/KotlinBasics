package com.android.kotlinbasics

fun main(){

    val mutableList = mutableListOf(1,2,3,4,5,4,6);
    val list = listOf(58,900)
    mutableList.remove(4)  //only one element will be removed
    println(mutableList)

//    mutableList.add(0,38)
//    mutableList.removeAt(2)

//    mutableList.set(3,400)

//    mutableList.add(5)
        mutableList.addAll(list)
    println(mutableList)


    //Map
    val map = mutableMapOf<Int, String>(1 to "Ram", 2 to "Mohan" )

    println(map)

    map.put(4,"shyam")
    println(map)


    map.putIfAbsent(4,"Radha")
    println(map)

}

