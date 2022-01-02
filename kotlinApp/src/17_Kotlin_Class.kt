class FaceBook constructor(val firstName:String,lastName:String) {
    var nickName:String?=null

    set(value) {
        field=value
        println("This is NickName")
    }

    get() {
        println("Nick Name Return get()")
        return field
    }

    init {
        println("FirstName:$firstName\nLastName:$lastName")

        if (nickName!=null){
            println(nickName)
        }else{
            println("No nickName")
        }
    }

    init {
        val newNickName=nickName?:null

        println(newNickName)
    }



}

fun main() {

    val user1=FaceBook("Balaji","Krishnan")
    user1.nickName="Palti"





}