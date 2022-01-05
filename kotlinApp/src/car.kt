interface Car{
    fun engineStart(){
        println("Engine Started.......")

    }
    fun engineOff(){
        println("Engine Turn Off")
    }

}

interface boostEngine{
    fun engineBoost(){
        println("Engine Boosted....................")
    }
    fun engineNormal(){
        println("Engine Normal........")
    }
}

class tataInnovoCar:Car,boostEngine{

    init {
        println("This is my Tata Innovo Car ")
    }

    override fun engineStart() {
        super.engineStart()
    }

    override fun engineOff() {
        super.engineOff()
    }

    override fun engineBoost() {
        super.engineBoost()
    }

    override fun engineNormal() {
        super.engineNormal()
    }
}
fun main() {
    val balaji=tataInnovoCar()
    balaji.engineStart()
    //balaji.engineOff()
    balaji.engineBoost()
    balaji.engineNormal()
    balaji.engineOff()



}
