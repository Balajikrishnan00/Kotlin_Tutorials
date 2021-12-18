class Rectangle(height:Double,length:Double){
    var parameter=(height+length)*2
}

fun main() {
    val rec=Rectangle(20.0,21.0)
    println(rec.parameter)
}