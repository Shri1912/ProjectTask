package practicetask

class Wrestler(name:String,age:Int,height:Double,weight:Double){
    var name:String=name
    var age:Int=age
    var height:Double=height
    var weight:Double=weight
}

fun main() {

    var wrestlers= mutableListOf<Wrestler>()
    wrestlers.add(Wrestler("John",37,5.7,105.0))
    wrestlers.add(Wrestler("Samuel",29,5.9,208.0))
    wrestlers.add(Wrestler("Kabir",36,5.78,285.0))

    for (wrestler in wrestlers){
        println("${wrestler.name}  ${wrestler.age}  ${wrestler.height}  ${wrestler.weight}")
    }

    println("----List of wrestlers who's age is greater than 35----")
    for(wrestler in wrestlers){
        if (wrestler.age>35)
            println("${wrestler.name}  ${wrestler.age}")
    }

    println("----List of wrestler who's weight is greater than 200----")
    for (wrestler in wrestlers){
        if(wrestler.weight>200)
            println("${wrestler.name}  ${wrestler.weight}")
    }
}