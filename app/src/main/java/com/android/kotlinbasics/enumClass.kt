package com.android.kotlinbasics

fun main(){

//    val input = Result.FAILURE
//    getResult(input)

    Repository.startFetch()
    getResult(result = Repository.getCurrentState())

    Repository.finishedFetch()
    getResult(Repository.getCurrentState())

    Repository.error()
    getResult(Repository.getCurrentState())
}

fun getResult(result: Result){
    return when(result) {

        Result.SUCCESS -> println("Success")
        Result.FAILURE -> println("Failure")
        Result.ERROR -> println("Error")
        Result.IDLE -> println("Idle")
        Result.LOADING -> println("Loading....")
    }
}

object Repository{

    private var loadState: Result = Result.IDLE
    private var dataFetched: String? = null
    fun startFetch(){
        loadState = Result.LOADING
        dataFetched = "data"
    }

    fun finishedFetch(){
        loadState = Result.SUCCESS
        dataFetched = null
    }

    fun error(){
        loadState = Result.ERROR

    }

    fun getCurrentState(): Result{
        return loadState
    }

}


enum class Result{
    SUCCESS,
    FAILURE,
    ERROR,
    IDLE,
    LOADING
}