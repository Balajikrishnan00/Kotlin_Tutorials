/*
    Arithmetic Operator
    Relational Operator
    Assignment Operator
    Unary Operator
    Bitwise Operator
    Logical Operator
 */
fun main() {
    val kotlinOperator= arrayOf("Arithmetic Operator","Relational Operator","Assignment Operator","Unary Operator","Bitwise Operator","Logical Operator")
    var num=1
    for (operator in kotlinOperator){
        println("$num) $operator")
        ++num
    }
    if ("Arithmetic Operator" in kotlinOperator){
        println("----------Arithmetic----------")
        val n1=10
        val n2=20
        println("10,20")
        val addition=n1+n2
        println("Addition: $addition")   // .plus()

        val subtraction=n1-n2
        println("Subtraction: $subtraction") // .minus()

        val multiplication=n1*n2
        println("Multiplication: $multiplication") // .times()

        val division=n1/n2
        println("Division: $division") // .div()

        val modulus=n1%2
        println("Modulus: $modulus")  // .rem()
    }
    if ("Relational Operator" in kotlinOperator){
        println("----------Relational Operator----------")
        val a=25
        val b=20

        if(a>b){
            println("a is bigger than b")
        }
        if (b<a){
            println("b is less than a")
        }
        if (a>=b){
            println("a is grater than of equal of  b")
        }
        if (b<=a){
            println("b is less than or equal of a")
        }

        if (a==b){
            println("both are equals")
        }else{
            println("both doesn\'t equal ")
        }
        if (a!=b){
            println("A is not equal b")
        }else{
            println("both are equal")
        }

    }
    if ("Assignment Operator" in kotlinOperator) {
        println("----------Assignment Operator----------")
        var x=10
        var y=20
        x+=y
        println("$x")

        x+=1
        println("$x")

        y+=20
        println("$y")

        y*=2
        println(y)

        y-=20
        println(y)

        y/=10
        println(y)

        y%=2
        println(y)
    }
    if("Unary Operator" in kotlinOperator){
        println("---------Unary Operator----------")
        var z=10

        var Balaji=true

        ++z
        println(z)
        --z
        println(z)
        z!=10
        println(z)
        Balaji=!Balaji
        println(Balaji)
        println(!Balaji)
    }
    if ("Logical Operator" in kotlinOperator) {
        println("----------Logical Operator----------")
        var a2 = 10;
        var a3 = 20
        var bool1 = true
        if ((a2 == 10) and (a3 == 20)) {
            println("True")
        } else {
            println(false)
        }
        if (a2 == 10 || a3 == 100) {
            println("Right")
        } else {
            println("Wrong!..")
        }
        println(!bool1)
    }

}