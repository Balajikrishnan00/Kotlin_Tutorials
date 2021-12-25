import java.awt.font.NumericShaper
import java.awt.print.Book

fun sayHello(greet:String, itemToGreet:List<String>){
    itemToGreet.forEach { itemToGreet ->
        println(greet+" "+itemToGreet)
    }
}

fun parameter(name:String,vararg languages:String){
    println(name)
    languages.forEach { it -> println(it) }

}

fun Book1(BookPrice:Double,vararg Book_Arthor:String){

    println(BookPrice)
    Book_Arthor.forEach { it  -> println(it) }
}

fun greetPersion(Greet:String,name:String){
    println("$Greet $name")
}

fun welcometo(greet:String="Goodmorning",name:String="anonymous"){
    println("$greet $name")
}

fun main() {

    val instrestingThings= listOf("Kotlin","programming","comic Books")

    sayHello("Balaji",instrestingThings)

    println("-----------------------------------------")

    val program= listOf("Java","Kotlin","Python","Web Developer")

    sayHello("Good Morning",program)

    println("---------------------------------------")
    println("Collection parameter")

    parameter("Balaji","balaji","Kotlin Developer","Python Developer")

    Book1(133.99,"Balaji","krishnan","siva","guna")

    println("-----------------------------------------")

    val array1= arrayOf("Balaji","Krishnan")

    Book1(134.09,*array1)

    val list1= listOf("welcome1","welcome2")
    Book1(134.90,)

    println("---------------------------------------------------")
    greetPersion("Good night","balaji")

    greetPersion(Greet = "Good Morning", name = "Balaji Krishnan")

    greetPersion(name="Balajieeee", Greet = "Welcome")

    println("--------------------------------------------------")
    welcometo(name = "Balaji")
    welcometo(greet = "Good night","Balaji")
    welcometo()

    println("-------------------------------------------------")

    val range1=1..10 step 2

    val range2=1.rangeTo(20)

    val range3='A'.rangeTo('Z')

    val range4='a'.rangeTo('z')

    val range5= 20..1

    val range6= 10.downTo(1)


    range1.forEach { it -> println(it)}

    for(i in range1){
       println(i)
    }
    println("------------------------------------")

    range1.reversed().forEach { it -> println(it)}

    println("---------------------------------------")
    println("HI Kotlin")

    for(i in 1..10 step 2){
        println(i)
    }
    var addNumber=1..20 step 2

    addNumber.forEach { it -> println(it) }
    println("------------uppercase-------------------")
    range1.forEach { it -> println(it) }

    for (ch in range3){
        println("${ch.lowercaseChar()}")
    }
    println("-----------------uppercase-------------------------")
    for (ch in range4){
        println("${ch.uppercaseChar()}")
    }
    println("------------Reversed--------------------")
    for (n in range2.reversed()){
        println(n)
    }
    println("--------------Until-------- step------------------")

    val num=1 until 5 //step 2

    for (n in num){
        println(n)
    }

    num.forEach { it -> println(it) }

    println("------------------first-----last----------------------")
    println(range5.first)

    println(range5.last)

    println("--------------------range Filter---------------------")

    val range7=range2.filter { it -> it%2==0 }
    println(range7)
    println(range7::class.simpleName)
    println(range7::class.java)

    println("--------------------distinct---------------")
    val a= arrayOf(1,2,3,1,3,4,1,2,3)
    println(a.distinct())
    println("----min max sum average count---------------")

    val total=1..10
    println(total.sum())
    println(total)
    println("")


}