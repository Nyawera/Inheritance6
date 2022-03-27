fun main(){
var subaru = Car("subaru","nissan","red",5)
    subaru.carry(6)
    subaru.identity()
    println(subaru.calculatepackingFees(2))

    var mercedez=Bus("v8","harmer","green",10)
    mercedez.calledMaxTripFare(400.40)
    mercedez.calculatepackingFees(7)






}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var x= people-capacity
        if (people<=capacity )
            println("Carrying $people passengers.")
        else{
            println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model")
    }

    open fun calculatepackingFees(hours: Int):Int{
        var Fees= hours*20
        //println(Fees)

        var amount = hours*capacity
        println(amount)

        return Fees
    }

}
class Bus( make:String, model:String, colour: String, capacity:Int):Car(make,model,colour,capacity){

    fun  calledMaxTripFare(fare:Double):Double{
        var y  =  fare * capacity
        println(y)

        return y

    }

}































//
//Assignment 6: Inheritance
//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
//-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
//-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
//-calculateParkingFees(hours: Int) : Calculates andreturns the
//parking fees by multiplying the hours by 20(1 point)
//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method calledmaxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)
//The bus’calculateParkingFees method returns the productof hours and
//the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.