class Rational_number(n: Int, d: Int) {
  require(d != 0, "Denominator cannot be zero")

  private val gcdValue: Int = gcd(n.abs, d.abs)
  val numer: Int = n / gcdValue
  val denom: Int = d / gcdValue

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)

  def neg: Rational_number = new Rational_number(-numer, denom)

  def sub(that: Rational_number): Rational_number = new Rational_number(
    numer * that.denom - that.numer * denom,
    denom * that.denom
  )

  override def toString: String = s"$numer / $denom"
}

object RationalTest2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational_number(3, 4)
    val y = new Rational_number(5, 8)
    val z = new Rational_number(2, 7)

    val result = x.neg.sub(y).sub(z)
    println("Result: " + result)  // Output: Result: 13 / 56
  }
}
