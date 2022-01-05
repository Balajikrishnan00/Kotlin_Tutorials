package `Kotlin Classes`

class SocialMedia constructor(var userName:String,var userPassword:String) {

    var IsLoggedIn=false

    init {
        println("Welcome TO SocialMedia Network...")
        Login(userName,userPassword)
    }

    fun Login(userName: String,userPassword: String){
        if ((userName=="balaji")&&(userPassword=="12345")){
            println("Welcome Mr.$userName")
             IsLoggedIn=true
        }else{
            println("Invalid Password")
        }
    }

    fun Like(){
        println("Liked ")

    }
    fun Comment(){
        println("Comment")
    }
    fun Share(){
        println("Share")
    }



}