package com.example.firstprojct


data class Ticket(val companyName : String, val name : String, var date : String, var seatNumber : Int)
// data class included toString(), hashCode(), equals(), copy()

class TicketNormal(val companyName : String, val name : String, var date : String, var seatNumber : Int)


fun main(){
    val ticketA = Ticket( companyName = "koreanAir", name = "hyungjin", date = "2020-02-16", seatNumber= 14)
    val ticketB = TicketNormal( companyName = "koreanAir", name = "hyungjin", date = "2020-02-16", seatNumber= 14)

    println(ticketA)
    println(ticketB)
}