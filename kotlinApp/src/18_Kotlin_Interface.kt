class Greeting(){

    init {
        println("Class Greeting")
    }

    fun goodMorning(){

    }
    fun goodEvening(){

    }
}

interface PersionInfoProvider{
    fun printInfo(greet: Greeting){
        println("interface fun  printInfo")
    }

}


class BasicInfoProvider:PersionInfoProvider{

    init {
        println("BasicInfoProvider")
    }

    override fun printInfo(greet: Greeting) {

    }
}

fun main(arg:Array<String>) {
    val user1=BasicInfoProvider()

}
