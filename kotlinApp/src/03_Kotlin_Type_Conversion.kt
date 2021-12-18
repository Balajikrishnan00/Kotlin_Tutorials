/*
    toByte()
    toString()
    toShort()
    toInt()
    toLong()
    toFloat()
    toDouble()
    toChar()

 */
fun main() {
    var num1=10
    num1=21
    val num2=num1
    num1=20
    println("num1: $num1")
    println("num2: $num2")

    var num3=num1.toLong()
    println("num2: $num3 \tdatatype:${num3::class.java}")


}