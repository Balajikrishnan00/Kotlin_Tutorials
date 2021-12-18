import kotlin.test.assertFalse

/*
    1) Number
    2) Character
    3) Boolean
    4) Array
    5) String

 */
fun main() {
    println("---------Numbers----------")
    val numberArray= arrayOf("Byte","Short","Int","Long","Float","Double")
    var num=1
    for (number in numberArray){
        println("$num) $number")
        ++num
    }

    println("----------Char----------")
    val c='C'
    println(" This is Char: $c")

    println("----------Boolean----------")
    val do_You_Like_ME=true

    val doYoulikeSmoke=false

    println("Do You Like Me : ${ if(do_You_Like_ME) "yes" else "no"}")
    println("Do You Like Smoke: ${if(doYoulikeSmoke) "yes" else "no"}")

    println("-----------Array-----------")

    val array1:IntArray= intArrayOf(1,2,3,4,5,6,7,8,9)

    if (11 in array1){
        println("it has in array1")
    }else{
        println("it does\'nt in array1")
    }



}