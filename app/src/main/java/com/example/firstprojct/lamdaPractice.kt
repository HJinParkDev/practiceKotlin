package com.example.firstprojct

/*
* Lambda is anonymous function like value
*
* 1) Lambda can passing by parameters
* ex) fun maxBy(a : Int)
* 2) Lambda can use by return value
*
* Basic Lambda format
* val lambdaName : Type = {argumentList -> codeBody}
* */
val square : (Int) -> (Int) ={number -> number * number}
//val square  ={number : Int -> number * number}

val nameAge = {name : String, age: Int ->
    "my name is ${name} I`m ${age}"
}

/* extended fun */
val pizzaIsGreat : String.() -> String = {
    this + "Pizza is the best!"
}


fun extendString(name : String, age : Int) : String {

    val introduceMyself : String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

/* return of lambda*/
val calculateGrade : (Int) -> String = {

    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "fass"
        in 71..100 -> "perfact"
        else -> "error"
    }
}

fun main(){
    println(square(12))
    println(nameAge("jin",35))
    val a = "jin said"

    val b = "mac said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())
    println(extendString("jin", 35))
    println(calculateGrade(40))
    println(calculateGrade(200))
}