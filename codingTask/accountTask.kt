package practicetask

import java.time.temporal.TemporalAmount
import java.util.Scanner

fun main() {
    var scan=Scanner(System.`in`)

    println("Enter the account number:")
    var accountNo=scan.nextInt()

    println("Enter the amount:")
    var amount=scan.nextInt()

    println("Enter the balance:")
    var balance=scan.nextInt()

    println("Enter the account type:")
    var accountType=scan.next()

    var account=Account(accountNo,amount,balance,accountType)

    println("-----------------------------------------------------------")
    println("\n1.Withdraw\n2.Deposit\n3.Rate of Interest\n4.Balance\n")

    var choice=scan.nextInt()
    when(choice){
        1->account.withdraw()
        2->account.deposit()
        3->account.calculateRateOfInterest()
        4->account.getBalance()
        else-> println("Inappropriate Choice!!...")
    }
}

class Account(accountNo:Int,amount:Int,balance:Int,accountType:String){

    var accountNo:Int=accountNo
    var amount:Int=amount
    var balance:Int=balance
    var accountType:String=accountType

    fun withdraw(){
        println("Balance=$balance")
        balance-=amount
        println("After withdrawal remaining balance: $balance")
    }
    fun deposit(){
        println("Balance=$balance")
        balance+=amount
        println("After deposit total balance: $balance")
    }
    fun calculateRateOfInterest(){
        if(accountType=="savings"){
            var intrest=balance*0.06
            println("Rate of interest: $intrest")
        }
        else{
            var intrest=balance*0.1
            println("Rate of interest: $intrest")
        }
    }
    fun getBalance(){
        if(accountType=="savings"){
            var intrest=balance*0.06
            var totalBalance=intrest+balance
            println("Total balance: $totalBalance")
        }
        else{
            var intrest=balance*0.1
            var totalBalance=intrest+balance
            println("Total balance: $totalBalance")
        }
    }

}