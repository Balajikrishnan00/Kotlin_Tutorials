class Greeting(){

    init {
        println("Class Greeting")
    }

    fun goodMorning(){

    }
    fun goodEvening(){
        println("goodEvening")

    }
}

interface PersionInfoProvider{

    val providerInfo:String
    fun printInfo(greet: Greeting){
        println("interface fun  printInfo")
        //greet.goodEvening()
        println(providerInfo)


    }

}


class BasicInfoProvider:PersionInfoProvider{

    override val providerInfo: String
        get() = "BasicInfoProvider.com"

    init {
        println("BasicInfoProvider")
    }

    override fun printInfo(greet: Greeting) {
        println("Basicinfo printInfo")
        greet.goodEvening()
        println(providerInfo)
        super.printInfo(greet)

    }
}

fun main(arg:Array<String>) {
    val user1=BasicInfoProvider()
    user1.printInfo(Greeting())

}
