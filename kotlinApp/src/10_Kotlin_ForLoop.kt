fun main() {
    val marks= arrayOf(80,90,100,90,80)
    var i=1
    for (mark in marks){
        if (i==1){
        println("${i}st : $mark")
        }
        else if (i==2){
            println("${i}nd : $mark")
        }else if (i==3){
            println("${i}rd : $mark")
        }else{
            println("${i}th : $mark")
        }
        i++
    }
}