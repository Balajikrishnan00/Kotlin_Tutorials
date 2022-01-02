class persion constructor(var name:String,var sex:String) {

    val name2="Balaji"


    init {
        println("This object Name:$name\nThis object Sex:$sex")

        println("--------- init 1------------------")

        val name1=name
        val sex1=sex
        
        println(this::name)

        println("----------init 1 end--------------")

    }

    init {

        println("------------- Init 2----------------")

        println()

        println("--------------Init 2 End------------")
    }

    fun sleep(){
        println("${this::name2} is Sleeping")


    }

    fun wakeup(){
        println(" Wake up")

    }

    fun eat(){
        println(" Eating")

    }

    fun run(){
        println(" Running")

    }

    fun sit(){
        println(" Sitting")

    }
    

}