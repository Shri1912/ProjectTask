fun main() {
    var mylambda:(Int)->String={age ->
        if(age<18) "Non-Adult"
        else if(age >= 18 && age <= 55) "Adult"
        else "Senior Citizen"
    }
    println("${mylambda(22)}")
}


