fun main() {

    val  result = add(10,20)
    println(result)
    evenOrOdd(12)
    evenOrOdd(13)


    // Function OverLoading - it can be defined as the , the function which have same names but have different
                            // parameters is called as function overloading

    println(addition(1,2))
    println(addition(33.33, 25.2))

    // we can store function into variables
    var fn = ::add
    println(fn(2,33))

}

fun add(num1:Int, num2:Int):Int{
    return num1 + num2
}

fun evenOrOdd(num:Int){
    var result = if (num % 2 == 0) "Even" else "Odd"
    println(result)
}

// Function overloading

fun  addition(a:Int, b:Int):Int{
    return  a + b;
}

fun addition(a:Double, b:Double):Double{
    return  a + b
}