package com.example.firstprojct

fun forWhile(){


    val arrayList = arrayListOf<Int>()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)

    for( vales in arrayList){
        println(vales)

    }

    for((index, vales) in arrayList.withIndex()){

        println("${index+1}번째 학생 : ${vales}")
    }

    var sum = 0
    for( i in 1..10 step 2){
        //for( i in 10 downTo 1){
        //for( i in 1 until 10 ){ // not include 100
        sum +=i
        println(sum)
    }


    var index = 0
    while (index < 10){
        index++
        println("current index: ${index}")
    }


}

fun main() {
    forWhile()
}