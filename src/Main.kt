fun main() {
    var account=CurrentAccount("236000670","Ahimbisibwe prudence","200,000")
    println(account.AccountNumber)
    println(account.accountName)
    account.deposit(10000.0)
    account.withdraw(2000.0)

}
open class CurrentAccount(var AccountNumber:String,var accountName:String,var balance:String){
    open fun deposit(amount:Double){
        var x=0.0
        var total=x++

    }
    open fun withdraw(amount: Double){
        var y=0.0
        var totalAmount=y--

    }
    open fun details(){

    }
}
class SavingAccount(AccountNumber: String,accountName: String,balance: String):CurrentAccount(AccountNumber,accountName,balance){
    fun withdraws(amount:Int){

    }
}
data class Product(var name:String,var weight:Int,var price:Int,var category:String)
        fun product(product:String){
            }
fun word(text:String):String{
    var text=0

}