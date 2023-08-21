object NumberClassifier {
  def main(args: Array[String]): Unit = {
    if (args.length != 1) {
      println("Please provide a single integer argument.")
    } else {
      val input = args(0).toInt

      val classifyNumber: Int => String = {
        case x if x < 0 => "Negative"
        case 0 => "Zero"
        case x if x % 2 == 0 => "Even"
        case x if x % 2 != 0 => "Odd"
      }

      val classification = classifyNumber(input)
      println(s"$classification is input.")
    }
  }
}
