fun main() {
    val a1= arrayOf("Apple","Banana","Orange","PineApple")
    for (each in a1){
        println(each)
    }
    if ("Apple" in a1){
        println("True")
    }else{
        println("False")
    }

    val a2= arrayOf<String>("Welcome","I am Good","Good Morning")
    println(a2)
    for (a in a2){
        println(a)
    }
    println("-----------------------------------")
    println("Int Array")
    val a3= arrayOf<Int>(1,2,3,4,5,6,7,8,9,0)
    println(a3)
    for (a in a3){
        println(a)
    }
    println("----------------------------------")
    println("Mixed array")
    val a4= arrayOf("balaji",12,'B',2.0)
    for (a in a4){
        println("$a types is ${a::class.java}")
    }
    println("------------------------------------")
    println("----------Tutorials-----------------")
    println(a1[0])
    println(a1[2])
    println(a1[3])
    //println(a1[4]) Exception indent out of Range
    println(a1.get(0))
    val app=a1.get(2)
    println("app: $app")
    a1.set(0,"White Apple")

    println(a1.get(0))
    println(a1[0])
    val a1_Clone=a1.clone()
    val  array_a1_size=a1.size
    println(array_a1_size)
    var a1_size=0
    for (a in a1){
        ++a1_size
        println("$a a1 size: $a1_size")
    }
    println("-------A1 Clone----------")
    for (a in a1_Clone){
        println(a)
    }

    println("-------INT Array---------")
    a3.contentToString()
    println(a3::class.java)
    println(a3[0]::class.java)
    println(a1.size)
    println(a1.count())



}