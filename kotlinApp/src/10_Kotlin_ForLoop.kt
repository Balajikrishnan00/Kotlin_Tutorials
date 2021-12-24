fun main() {

    /*

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



    val mk= arrayOf(1,2,3,4,5,6,7,8,9,10)
    for (i in mk.indices) {
        println("$i ${mk[i]}")
    }

    var input= readLine()!!
    var sum=10
    sum+=input.toInt()
    println(sum)

     -------------------------------

    print("Enter Your Name:")

    var name= readLine()!!

    var length=name.length
    var count=name.count()

    var mid=length/2
    //println(name)
    //println(length)
    //println(count)
    //println(mid)

    var newName=""
    var i=0
    //println(name[mid-1].uppercase())
    while (i<mid){
        newName+=name[i].toString()
        i++
    }

    newName+=name[mid].uppercase()
    println("New Name: $newName")
    var j=mid+1

    while (j<length){
        newName+=name[j]
        j++
    }
    println(newName)
    ----------------------------------------------


    // Mind Gaming

    val mindNumber= readLine()!!.toInt()

    print("Enter Your Guess!")
    val guess= readLine()!!.toInt()

    if (guess>mindNumber){
        println("Your Guess Is Grater!!")
    }else if (guess==mindNumber){
        println("Perfect Guess Guess is $guess")
    }else{
        println("Your Guess is To Little")
    }
    ----------------------------------------------------
     */

    // Guess is While Game
    var myProperty = "xyz"

    var otherProperty= 123
    println(myProperty::class.simpleName)

    println(otherProperty::class.simpleName)

    println((myProperty !is String))

    print("please Enter Integer!")

    






}
