object Q4 extends App{
  val a1: Account4 = new Account4("1", "001", 5000)
  val a2: Account4 = new Account4("2", "002", 2000)
  val a3: Account4 = new Account4("3", "003", -3000)
  val a4: Account4 = new Account4("4", "004", -1000)

  var bank: List[Account4] = List(a1, a2, a3, a4)

  def negativeBalancesAccounts(): List[Account4] = bank.filter(x => x.accBalance < 0)

  def sumOfAccounts(): Double = bank.map(x => x.accBalance).reduce((x, y) => x + y)

  def interest(x: Account4): Unit = {
    if (x.accBalance > 0) {
      x.accBalance *= 1.05
    } else if (x.accBalance < 0) {
      x.accBalance *= 1.1
    }
  }

  println("Accounts with negative balances: ")
  negativeBalancesAccounts().foreach(x => println(x))

  println("\nSum of all account balances: " + sumOfAccounts())

  println("\nFinal balances of all accounts: ")
  bank.foreach(x => (interest(x), println(x)))
}

class Account4(i: String, a: String, b: Double) {
  var id: String = i
  var accNum: String = a
  var accBalance: Double = b

  override def toString: String = id + " : " + accNum + " : " + accBalance
}