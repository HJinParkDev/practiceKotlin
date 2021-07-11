package com.example.firstprojct

import java.util.*

/*NPE*/
fun main() {
    nullcheck()

    ignoreNulls("ss")
}
fun nullcheck(){
    //NPE : java found out in runtime

    /*nullcheck*/
    var name : String = "jin"

    /*Nullable*/
    var nullName : String? = null

    /*It's ok because null can't come*/
    var nameInUpperCase = name.uppercase(Locale.getDefault())

    var nullNameInUpperCase = nullName?.uppercase() /*nullName? */

    // ?: (like nvl in sql) elvis
    val lastName : String? = null
    val lastName1 : String? ="park"

    val fullName = name +" "+ (lastName?: "No lastName")
    val fullName1 = name +" "+ (lastName1?: "No lastName")

    println(fullName)
    println(fullName1)

    // !! grantee not null
}


fun ignoreNulls(str : String?){

    val mNotNull : String = str!!
    val upper = mNotNull.uppercase()

    val email = "kingcarnam@gmail.com"
    email?.let{
        println("my email is ${email}")
    }
}

