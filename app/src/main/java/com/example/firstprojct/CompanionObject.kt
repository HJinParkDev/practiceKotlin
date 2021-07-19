package com.example.firstprojct


/* static method */

class Book private constructor(val id : Int, val name : String){

    companion object BookFactory : IdProvider {

        override fun getId(): Int {
            return 444
        }

        private var myBook = "new book"

        //fun create() = Book(id= 0, name= "animal farm")

        //fun create() = Book(id= 0, myBook)
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId() : Int
}




fun main(){

    val book = Book.create()

    val bookId = Book.BookFactory.getId()

    println("${book.id} ${book.name}")
    println(bookId)
}