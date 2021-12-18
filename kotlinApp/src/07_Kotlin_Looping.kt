import com.sun.jdi.IntegerValue
import java.util.*

fun main() {
    /*

    var no=5
    no=no+1
    no-=2
    println(no)

    no*=1
    no/=1
    no%=1
    println(no)

    println("Welcome Enter your name:")
    // var n1=Scanner(System.`in`)
     //n1.nextInt()

    //var sc=n1.nextInt()
    //println(n1::class.java)

    //println(n1::class.java)
     println("User Data Types")
    var n1=readLine()
    var n2=n1?.toInt()
    println(n2!!::class.java)
    println(n2+10)

    var result2=10+20+30
    println(result2::class.java)


        var a=20;var b=20
        println(a+b)

        var name="Balaji"
    var name1="Welcome"
    println("$name $name1")
    var length=name.length
    println(name[0])

    //var name2= "Balaji Krishnan"
    //var len=name2.length/2
    //var cun=name2.count()
    //println("len $len \ncun $cun")
    //println(name2[len].lowercase())

    //println(name2[0] until name2[len])


    while (len<name2.length){
        println(name2[len])
        ++len
    }

--------------------------------------------------------
    // find mid string of captial
    val myName= "sivashanger"
    val len=myName.length
    var mid=len/2
    println(mid)
    println(myName[mid])
    var i=0
    var j=mid+1
    var newName=""
    while (i<mid){

        newName+=myName[i]
        i++
    }
    println(newName)
    newName+=myName[mid].uppercase()
    println(newName)
    while (j<len){
    println(myName[j])
        newName+=myName[j]
    j++
    }
    println(newName)
    println(myName.capitalize())


-----------------------------------------------------------
    // control flow statement
    val mark=89
    val Result=if (mark>=90) "Very Good"  else "Good"
    println(Result::class.java)
    println(Result)

    var userName="Balaji123"
    if (userName=="Balaji123"){
        println("Welcome mr.$userName")
    }
    else{
        println("hai mr.$userName")
    }
----------------------------------------------------------



    val mark=90

    if (mark>90){
        println("Excellent This is your Mark $mark+")
    }else if (mark>80){
        println("very Good  This is your Mark $mark+")
    }else if(mark>60){
        println("GOOD! This is Your mark $mark+")
    }else if(mark>=35){
        println("Okay your Pass get Happy")
    }else{
        println("Better Than next time")
    }
-----------------------------------------------------




    var mark1=190
    var mark2=190
    if (mark1>mark2){
        println("First Mark Graterthan")
    }else if(mark2>mark1){
        println("second Mark Graterthan")
    }
    else{
        println("Both are Same!")
    }



    print("Enter Your Total!: ")
    var total= readLine()

    if (total!!.toInt()>=400){
        print("Enter Tamil Mark! :")
        var tamil=readLine()
        if ((tamil!!.toInt())>=90){
            println("Excellent!...")
        }else{
            println("Super")
        }
    }else{
        println("Nice ")
    }

-----------------------------------------------------
     */
    // Iterative loop
    val mind=20
    var attempt=1
    print("Enter Your Guess Number :")
    var guess= readLine()
    if (guess!!.toInt()==mind){
    println("Wow Super attempt : $attempt")
    }else if (guess!!.toInt()>mind){
        println("Your Guess is Grater ")
    }else{
        println("Guess is LessThan")
    }



}
