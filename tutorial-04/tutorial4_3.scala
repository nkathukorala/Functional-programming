object Q3 {
  def main(args: Array[String]): Unit = {
    println(formatNames("Benny")(toUpper))
    println(
      formatNames("Niroshan")((name: String) =>
        toUpper(name.substring(0, 2)) + name.substring(2)
      )
    )
    println(formatNames("Saman")(toLower))
    println(
      formatNames("Kumara")((name: String) =>
        name.substring(0, name.length() - 1) + toUpper(
          name.substring(name.length() - 1, name.length())
        )
      )
    )
  }

  def toUpper(input: String): String = input.toUpperCase()
  def toLower(input: String): String = input.toLowerCase()
  def formatNames(name: String)(fn: String => String): String = fn(name)
}

