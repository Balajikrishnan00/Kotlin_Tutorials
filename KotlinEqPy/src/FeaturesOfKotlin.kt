/*
object SampleJavaProgram{
    @JvmStatic fun main(args:Array<String>){
    printMsg("Hello")
    }
    private fun printMsg(S:String){
        println(S)
    }

}
*/
fun main() {
   val user1=User("Balaji",24)
    println(user1)

    var Balaji=studentMarks(60,80,50,60,73)
    println(Balaji)
    var oops=KotlinOOps()

}

data class User(val name:String,val Age:Int)
data class studentMarks(var Tamil:Int,var English:Int,var Maths:Int,var Science:Int,var Social:Int)