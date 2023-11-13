fun main() {

    // for loop
    for (i in 1..5 step 2){
        print(i)
    }

    //
    println("Until")
    for (i in 1 until  5){
        println(i)
    }

    // decreasing number using loop
    println("Decreasing ")
    for (i in 10 downTo 1 step 2){
        println(i)
    }

    // printing table of 2
    val  number = 2
    println("Table of 2")
    for (i in 1 .. 10){
        println("$number x $i = ${number * i}")
    }
}