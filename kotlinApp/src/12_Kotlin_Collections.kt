

fun main() {
    val colors=arrayOf("Red","Green","Blue")

    val programming= arrayOf("C","C++","C#","Java","Python","Kotlin")
    var BothArray= emptyArray<String>()
    colors.forEach { it->println(it)}

    colors.forEach { it -> BothArray.plusElement(it) }

    programming.forEach { a->BothArray.plusElement(a) }

    println("----------------------------------------------------")

    for (p in programming){
        println(p)
    }

    println("-----------------------------------------------------")

    BothArray.forEach { it -> println(it) }

    println("-----------------------------------------------------")

    programming.reverse()
    programming.forEach { it ->println(it) }

    println("-----------------------------------------------------")

    println("Colors array size: ${colors.size}")

    println("Programming array size: ${programming.size}")

    println("BothArray size: ${BothArray.size}")

    println("------------------------------------------------------")

    // array append
    println(programming.get(0))

    val intArray= arrayOf(1..100)

    intArray.forEach { it -> print(it) }

    for (i in intArray){
        println(i)

    }

    val f1= arrayOf<String>("Apple","Banana","Orange")

    val f2=f1.clone()

    println(f2.forEach { it -> println(it) })


    // creating Array

    val f3= arrayOf<Int>(1,2,3,4,5,6,7,8,9,10)

    val f4= arrayOf<Char>('a','b','c','d')

    val f5= arrayOf<Byte>(12,23,45,67,4,23,1)

    val f6= arrayOf<Long>(1_00_000,2_00_000_000)

    val f7= arrayOf<Short>(122,123,13244,2345)


    // method 2

    val f8=intArrayOf(1,2,3,4,5,6,7,8,9,10)

    val f9= byteArrayOf(12,23,13,4,127,3,23)

    val f10= shortArrayOf()

    val f11= longArrayOf(1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,10,10)



    println(f1.size)
    println(f1[0])
    println(f1.get(1))
    println(f1.set(1,"Balaji"))

    println(f11.distinct())


}