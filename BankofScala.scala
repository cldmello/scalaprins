import main.scala.com.h2.entities.Product
import main.scala.com.h2.entities.Bank
import main.scala.com.h2.entities.Account

object BankofScala {
  def main(args: Array[String]): Unit = {
    println("Instantiating Bank ...")
    
    val coreChecking = new CoreChecking(bal = 1000, rate = 0.025)
    val studentChecking = new StudentChecking(bal = 0, rate = 0.010)
    val rewardsSavings = new RewardsSavings(bal = 10000, rate = 0.10, trans = 1)
    val creditCard = new CreditCard(fee = 99.00, rate = 14.23, pct = 20.00)
    val products = new Set(coreChecking, studentChecking, rewardsSavings, creditCard)
    
    val bobMartin = new Customer("Bob", "Martin", "bob@martin.com", LocalDate.of(year = 1983, month = 8, dayOfMonth = 22))
    val bobCheckingAccount = new Account(bobMartin, coreChecking, 1000)
    val bobSavingsAccount = new Account(bobMartin, rewardsSavings, 20000)
    val bobCreditAccount = new Account(bobMartin, creditCard, 4500)
    
    val accounts = Set(coreChecking, rewardsSavings, creditCard)
    
    val bank = new Bank("Bank of Scala", "Auckland", co = "New Zealand", "bank@scala.com", products, Set(bobMartin), accounts)
    
    println(bobCheckingAccount)
    
    bobCheckingAccount.deposit(amount=100)
    println(bobCheckingAccount)
    
    bobCheckingAccount.withdraw(amount=100)
    println(bobCheckingAccount)
  }
}
