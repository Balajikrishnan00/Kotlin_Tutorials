fun main() {

    val AccessCodes= arrayOf(1,2,3,4,5,6,7,8,9,10)
    print("Enter your Access Code: ")
    var code = readLine()!!.toInt()

    if (code in AccessCodes){
        println("Available")
    }else{
        println("does not availble")
    }

}