fun main() {
    var firstName:String?=null

    println(firstName?.length)
    //firstName="Balaji"
    //println(firstName!!.length)
    var  result=if (firstName!=null) firstName.length else 0
    println(result)
}