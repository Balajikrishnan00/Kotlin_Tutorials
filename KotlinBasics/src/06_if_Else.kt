import kotlin.math.E

fun main() {
    val studentName:String="Balaji Krishnan"
    val RegNo:String="I143004"
    val Tamil:Int=56
    val English:Int=45
    val Maths:Int=34
    val Science:Int=58
    val Social:Int=59
    var Result:String?=null
    var Total:Double?=null

    print("Enter Your StudentName: ")
    var Username: String? = readLine()
    print("Enter Student DOB (dd mm yyyy): ")
    var DOB:String?= readLine()

    if((Username=="Balaji Krishnan" ||Username=="balajikrishnan") && (DOB=="26041997")){
        if ((Tamil>=35) && (English>=35) && (Maths>=35) && (Science>=35) && (Social>=35)){
            println("Student Name: $studentName")
            println("RegNo: $RegNo")
            println("Tamil: $Tamil")
            println("English : $English")
            println("Maths : $Maths")
            println("Science : $Science")
            println("Social : $Social")
            Total=(Tamil+English+Maths+Science+Social).toDouble()
            Result="Pass"
            println("-----------------------------------------")
            println("Total: $Total")
            println("Result: $Result")
            }
            else{
            Result="Fail"
            println("Student Name: $studentName")
            println("RegNo: $RegNo")
            println("Tamil: $Tamil")
            println("English : $English")
            println("Maths : $Maths")
            println("Science : $Science")
            println("Social : $Social")
            Total=(Tamil+English+Maths+Science+Social).toDouble()

            println("-----------------------------------------")
            println("Total: $Total")

            println("Result: $Result")
        }

    }else{
        println("Invalid Username or DoB")
    }


}