class Greet(name:String,Sex:Char){



    init {
    val name1=name
        if ((Sex == 'M') || (Sex=='m')){
            println("Welcome Mr.${name1}")
        }else{
            println("Welcome Ms.${name1}")
        }
    }

    constructor():this("Balaji",'m'){
        println("I am Secondary constructor")

    }



}

fun main() {
    val user1=Greet("Balaji",'M')
    val user2=Greet("pushpa",'f')
    val user3=Greet("siva",'m')
    //val user4=Greet()

}