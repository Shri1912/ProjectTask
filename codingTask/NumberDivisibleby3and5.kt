package practicetask

import java.util.Scanner

fun main(args: Array<String>) {

    println("Numbers divisible by 3 and 5:")
    for (number in 1..100){
        if(number%3==0 && number%5==0)
            print("$number" + " ")
    }
}