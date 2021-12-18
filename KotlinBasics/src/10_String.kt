fun main() {
    var a=1

    var s1="a is $a"
    println(s1)
    
    val s2="${s1.replace("is","Was")}"
    println(s2)
    println(s2.length)
    println(s2.count())
    println(s2)
}