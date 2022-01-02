class AccessCard(val Code:Int){

    var fingerVerify=false

    var sEnable=false

    val accessCodes= arrayOf(1,2,3,4,5,6,7,8,9,10)

    val packagingAccessCodes= arrayOf(9,10)

    val generalAreaCodes= arrayOf(1,2,3,4,5,6,7,8,9,10)

    val warehouseCodes= arrayOf(5,6,7,8)

    fun fingerEnable(){
        if (Code in accessCodes){
            fingerVerify=true
            println("Your access card is Enabled...")
        }else{
            println("Your Card Doesn't please try again!!!")
        }

    }

    fun fingerDisable(){
        if( fingerVerify){
            fingerVerify=false
            println("Your Access is disabled")
        }
    }

    fun securityEntrance(){

        if (fingerVerify){
            if (Code in accessCodes){
                sEnable=true
                println("Security Entrance is open")
            }

        }else{
            println("Please Enable your access card...")
        }
    }



    fun adminEntrance(){
        if (fingerVerify){
            if ((Code in accessCodes) &&(sEnable)){
                println("Admin door is open")
            }else{
                println("DID You Entered in Security Entrance!!!")
            }
        }else{
            println("cannot access ")
        }

    }

    fun packaging(){
        if (fingerVerify){
            if ((Code in accessCodes) &&(sEnable)){
                if (Code in packagingAccessCodes){
                    println("Packaging Door is Open")
                }else{
                    println("Access Denied")
                }
            }else{
                println("Did You Come From Security")
            }

        }else{
            println("this not your card")
        }

    }

}

fun main() {

    val balaji=AccessCard(5)
    balaji.fingerEnable()
    balaji.securityEntrance()
    balaji.fingerDisable()
    balaji.securityEntrance()

}