fun main() {
    val animal = "Dog"

//    if (animal == "Horse")
//        println("Horse")
//
//    else if (animal == "cat"){
//        println("Cat")
//    }
//    else if (animal == "Dog")
//        println("Dog")
//    else
//        println("Animal Not Found")

    // Using When Statement
//    when(animal){
//        "Horse" -> println("Animal is Horse")
//        "Cat" -> println("Animal is Cat")
//        "Dog" -> println("Animal is Dog")
//        else -> println("No animal Found")
//    }

    // We can assign when statement into a particular variable

    var result =  when(animal){
        "Horse" -> println("Animal is Horse")
        "Cat" -> println("Animal is Cat")
        "Dog" -> println("Animal is Dog")
        else -> println("No animal Found")
    }


    println(result)
}