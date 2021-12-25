class persion constructor(name:String,sex:String) {

    val newName=name
    val Sex=sex

    init {
        val newName1=newName
        val Sex1=Sex

        println("--------- init 1------------------")
        println(" $newName1  , $Sex1")

        println("----------init 1 end--------------")

    }

    init {

        println("------------- Init 2----------------")

        println("--------------Init 2 End------------")
    }

    fun sleep(){
        println("$newName  is Sleeping")

    }

    fun wakeup(){
        println("${this.newName} Wake up")

    }

    fun eat(){
        println("$newName Eating")

    }

    fun run(){
        println("$newName Running")

    }

    fun sit(){
        println("$newName Sitting")

    }


}