fun main(args:Array<String>) {
    var total=sum(10,20)
    println(total)
    println("Total Sum:${sum(20,30)}")
    println(sum(-1,-20))

}
fun sum(a:Int,b:Int):Int{
    return a+b
}
fun totalSum(vararg numbers:Int): IntArray {
    return numbers+numbers
}