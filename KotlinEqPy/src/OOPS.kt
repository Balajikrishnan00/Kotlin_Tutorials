import java.awt.font.NumericShaper
import kotlin.reflect.jvm.internal.impl.platform.SimplePlatform

fun main() {
    var sentance="""
        hai 
        my name  is Balaji
    """.trimIndent()
    println(sentance)
    var name="langscape"

    // indexing
/*
    println(name[0])
    println(name[1])
    println(name[2])
    println(name[3])
    println(name[4])
    println(name[5])
    println(name[6])
    println(name[7])
    println(name[8])
    //println(name[9])
    print(name[0])
    print(name[1])
    println()
    println(name.indexOf("a"))

 */
    var i=name.length-1
    while (i>=0){
        println(name[i])
        --i
    }
    var Input= readLine()
    println(Input::class.java)


}
