object InterestCalculator {
  def calculateInterest(deposit: Double): Double = {
    val interestRate: Double => Double = {
      case amount if amount <= 20000 => amount * 0.02
      case amount if amount <= 200000 => amount * 0.04
      case amount if amount <= 2000000 => amount * 0.035
      case amount => amount * 0.065
    }

    interestRate(deposit)
  }

  def main(args: Array[String]): Unit = {
    val depositAmount = 250000.0 // Example deposit amount
    val earnedInterest = calculateInterest(depositAmount)
    println(s"The earned interest on Rs. $depositAmount is Rs. $earnedInterest")
  }
}
