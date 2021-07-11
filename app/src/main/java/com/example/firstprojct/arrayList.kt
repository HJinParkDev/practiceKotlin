package com.example.firstprojct

fun main() {

}

/*
    array fixed memory

    lise

    1. List
    2. MutableList

 */
fun array(){

    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1,"d",3.4f)
    val list2 = listOf(1,"d",11L)

    array[0] = 3
    //list.set(1,3)

    val arrayList = arrayListOf<Int>()
    arrayList.add(1)
    arrayList.add(2)
    arrayList.add(3)
}
