object Q2 extends App{
def countLetterOccurrences(words: List[String]): Int = {
  val lengths = words.map(_.length)  // Map words to their respective lengths
  val totalOccurrences = lengths.reduce(_ + _)  // Calculate the total count of occurrences
  totalOccurrences
}
val totalOccurrences = countLetterOccurrences(List("apple", "banana", "cherry", "date"))
println(s"Total count of letter occurrences: $totalOccurrences")
}