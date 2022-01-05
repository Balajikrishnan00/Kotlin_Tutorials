package `Kotlin Classes`

class BikeEngine {
    init {
        println("This is Bike Engine Class")

    }

    var engineOn:Boolean=false
        set(value) {
        field=value
            println("Engine $field $value")
    }

        get() {
        println("Engine in on $field ")
        return field
    }

    fun engineStart(){
        if (engineOn){
            println("Engine Started......")
        }else{
            println("engine on")
        }

    }
    fun engineStop(){
        println("Engine Stopped!!!.")
    }
}