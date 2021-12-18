import Rectangle



open class Greeting(){

    open fun GoodMorning(){
        println("Good Morning Sir")
    }
    open fun GoodAfretnoon(){
        println("Good Afternoon sir")
    }
    open fun Goodnight(){
        println("Good Night Sir")
    }
}

class Greeting1() : Greeting() {
   override fun GoodMorning(){
        println("Good Moring1")
    }
   override fun GoodAfretnoon(){
        println("GoodAfternoon1")
    }
   override fun Goodnight(){
        println("GoodNight1")
    }
}

fun main() {

    val ans=Rectangle(12.0,14.0)
    println(ans.parameter)

    var gret1=Greeting1()
    gret1.GoodMorning()
    gret1.GoodAfretnoon()
    gret1.Goodnight()


}