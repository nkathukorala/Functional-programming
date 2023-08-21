object NameFormatter {
  def toUpper(name: String): String = name.toUpperCase

  def toLower(name: String): String = name.toLowerCase

  def formatNames(name: String, formatter: String => String): String = formatter(name)

  def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")
    
    for (name <- names) {
      val upperName = formatNames(name, toUpper)
      val lowerName = formatNames(name, toLower)
      
      println(s"Original name: $name")
      println(s"Formatted to upper case: $upperName")
      println(s"Formatted to lower case: $lowerName")
      println()
    }
  }
}
