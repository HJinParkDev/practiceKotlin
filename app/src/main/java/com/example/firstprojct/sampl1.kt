package com.example.firstprojct

fun main(){
    helloWorld()

    println(add(1,2))

    stringTem("hyungjin")

    checkNum(1)
}


/*void : Unit*/
fun helloWorld(){
    println("hello kotlin world")
}

/* clarify argument and return*/
fun add(a : Int, b : Int) : Int{
    return a+b
}

/* val vs var */
fun hi(){
    val a  = 10

    var b  = 9


//    a = 100
    b = 10
    val c = 11
    var d = 12
    var name = "jin"

    println("$a$b$c$d$name")
}

/* String Template */
fun stringTem(str : String) {
    println("my name is ${str}desu")
    println("is this true? ${1==2}")
    println("is this true? 2\$a")
}


/*case state*/
fun maxBy(a : Int, b : Int) : Int {

    if( a>b ){
        return a
    } else{
        return b
    }
}

fun maxBy2(a : Int, b: Int) = if(a>b) a else b

/* when (like switch in java) */
fun checkNum(score : Int) {
    when(score) {
        0-> println("this is 0")
        1-> println("this is 1")
        2-> println("this is 2")
        2,3-> println("this is 2 or 3")
        else -> println("I don't know")

    }


    /* when can use return value*/

    var b : Int = when(score){
        1->11
        2->22
        else -> 33 /* must clarify else state*/
    }

    println("b:${b}")

    when(score){
        in 90..100 -> println("god")

        in 10..89 -> println("nice")
        else -> println("good")
    }
}


/*Expression vs Statement
*
* Expression -> every functions
* what make return values
* */