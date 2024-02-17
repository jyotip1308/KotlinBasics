package com.android.kotlinbasics


fun main(){

    val mList = mutableListOf<String>("amzad","jyoti","Gaurav","komal","bhavna","amit")
    var allItem = ""

    mList.forEach {
//        print(it)

        allItem += "$it,"
        /*    allitem = allitem + "$it,"
            j   = j + "$it,"    ,,,,,   j + k,    jk,

            jk, = jk, + m,
            jk,m,*/
//        println(allItem)

        val newItem = allItem.dropLast(1)
        println(newItem)

    }
}
