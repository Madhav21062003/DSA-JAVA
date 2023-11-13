package oops

class Car(val name: String, val type: String, var kmRan:Int)
{
    fun driveCar(){
        println("$name Car is driving")
    }

    fun applyBrakes(){
        println("$name Applied Brakes")
    }
}
fun main() {

    val mustang = Car("Mustang", "Petrol", 200)
    val beetle = Car("Beetle", "Diesel",300);

    println(mustang.name)
    println(mustang.type)
    println(mustang.kmRan)
        mustang.driveCar()
    println(beetle.name)
    println(beetle.type)
    println(beetle.kmRan)
    beetle.applyBrakes()
}
