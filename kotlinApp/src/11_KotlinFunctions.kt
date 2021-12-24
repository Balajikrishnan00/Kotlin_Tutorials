//      Kotlin Functions

/*
fun welcome(name:String){
    println("Welcome $name")
}

fun sayHello():Unit{
}
fun singleLineFunction(Name:String):String="Welcome to $Name"

fun nestedFunction(firstName:String,lastName:String){

    fun fulName(){
        println("Full name: $firstName $lastName")
    }
    fulName()
}
-------------------------------------------------------------


fun maths(a:Int,b:Int){

    fun addition(){
        println("Addition:${a+b}")
    }
    addition()

    fun subtraction(){
        println("Subtraction :${a-b}")
    }
    subtraction()

    fun multiplication(){
        println("Multiplication: ${a*b}")
    }
    multiplication()
    fun division(){
        println("Division : ${a/b}")
    }

    division()
    fun modulus(){
        println("Modulus :${a%b}")
    }
    modulus()
}

 */

fun sayGreet()=println("Ji Welcome ")

fun sayHi(greet:String="WELCOME"){
    println(greet)
}


fun main() {
    //welcome("Balaji")
    //println(singleLineFunction("Balaji Krishnan"))
    //nestedFunction("Balaji","Krishnan")

    //maths(10,20)
    sayGreet()

    sayHi("welcome")

}