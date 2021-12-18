fun main() {
    var day="hello"

    when(day){
        "Sunday"->{println("FirstDay")}
        "Monday"->{println("SecondDay")}
        "Tuesday"->{println("ThirdDay")}
        else->{
            println("Else Part")
        }
    }
    print("Enter Emp Name: ")
    var EmpName:String?= readLine()?.capitalize()
    when(EmpName){
        "Balaji"->{println("Programmer")}
        "Siva"->{println("Designer")}
        "Shankar"->{println("CEO")}
        else->{
            println("Pls check the name!!!")
        }
    }
    var a=20
    var b=30
    val max=if(a>b) a else if(a==b) "both are Equal" else b
    println("a=$a and b=$b :max_value: $max")

    val name ="Balaji".uppercase()
    val result=when(name){
        "Balaji".uppercase() ->"$name is Here"
        "siva".uppercase() ->"$name is Here"
        else ->"Invalid Name pls Check It".uppercase()
    }
    println(result)



    }

