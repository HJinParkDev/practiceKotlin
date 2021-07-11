package com.example.firstprojct

class ClassPractice {
}

//class Human constructor(name : String = "Annoymous")




    //val name = name
open class Human (val name : String= "Annoymous"){

        /* second constructor*/
        constructor(name: String, age: Int): this(name){
            println("my namee is ${name}, ${age}years old")
        }

        init {

            println("init process")
        }
    fun eatingCake(){

        println("this is no Yummy")
    }

    open fun singAsong(){

        println("lalala")
    }

}

/* have to open Human */
class Korean : Human() {

    override  fun singAsong(){

        super.singAsong()
        println("LALALA")
        println("my name is :${name}")
    }
}


fun main(){

    val human = Human("jin")
    val human1 = Human()
    human.eatingCake()

    val mom = Human("miku", 20)
    println("one man ${human.name}")
    println("one man ${human1.name}")

    human.singAsong()

    val korean = Korean()
    korean.singAsong()

}