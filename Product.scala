abstract class Product {
  val name: String
  
  override def toString: String = "product=" + name
}

abstract class Deposits extends Product {
  val interestRatePerYear: Double
  val minimumBalancePerMonth: Int
}

abstract class Checkings extends Deposits

abstract class Savings extends Deposits {
  val transactionsAllowedPerMonth: Int
}

class CoreChecking(bal: Int, rate: Double) extends Checkings {
  println("Created Core Checking Product")
  override val interestRatePerYear = rate
  override val minimumBalancePerMonth = bal
  override val name = "Core Checking"
}

class StudentChecking(bal: Int, rate: Double) extends Checkings {
  println("Created Student Checking Product")
  override val interestRatePerYear = rate
  override val minimumBalancePerMonth = bal
  override val name = "Student Checking"
}

class RewardsSavings(bal: Int, rate: Double, trans: Int) extends Savings {
  println("Created Rewards Savings Product")
  override val interestRatePerYear = rate
  override val minimumBalancePerMonth = bal
  val transactionsAllowedPerMonth = trans
  override val name = "Rewards Savings"
}

abstract class Lending extends Product {
  val annualFee: Double
  val apr: Double
  val rewardsPercent: Double
}

class CreditCard(fee: Double, rate: Double, pct: Double) extends Lending {
  println("Created Credit Card Product")
  override val annualFee = fee
  override val apr = rate
  val rewardsPercent = pct
  override val name = "Credit Card"
}
