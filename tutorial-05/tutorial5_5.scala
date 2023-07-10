object tutorial5_5 extends App{
   
  println(evenSum(5)) //2+4

  def isEven(n: Int): Boolean = n match {
    case 0 => true
    case _ => isOdd(n - 1)
  }

  def isOdd(n: Int): Boolean = !(isEven(n))

  def evenSum(n: Int): Int = n match {
    case x if x == 0    => 0
    case x if isEven(x) => n + evenSum(n - 2)
    case _              => evenSum(n - 1)
  }
}