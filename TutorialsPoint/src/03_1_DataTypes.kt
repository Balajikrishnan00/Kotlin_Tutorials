fun main() {
    val a:Int=10
    println(a::class.java)

    val b=a+10
    println(b)
    println(b::class.java)
    println("$b ${b::class.java}")

    
}