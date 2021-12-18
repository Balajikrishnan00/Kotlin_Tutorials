/*
Arithmetic operator
Relation operator
Assignment operator
Unary operator
Logical operator
Bitwise operator
*/

fun main(args:Array<String>) {

    var A= 10


    var B= 10

    // Arithmetic operator

    println("$A + $B = "+(A+B))
    println("$A - $B = "+(A-B))
    println("$A * $B = "+(A*B))
    println("$A / $B = "+(A/B))
    println("$A % $B = "+(A%B))
    println("___________________")
    println("TOTAL:"+(A+B+(A-B)+(A*B)+(A/B)+(A%B)))
    println("-------------------")
    println(A.plus(B))
    println(A.minus(B))
    println(A.times(B))
    println(A.div(B))
    println(A.mod(B))


    println("Relational Operator")
    // Relational Operator

    var Name="Balaji"
    var Name2="Krishnan"

    println(A>B)
    println(A<B)
    println(A==B)
    println(A>=B)
    println(A<=B)
    println("-------------------")
    println(A.compareTo(B))
    println(B.compareTo(A))
    println(A.equals(B))
    println(A?.equals(B))

}