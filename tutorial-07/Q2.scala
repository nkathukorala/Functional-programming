object Q2 extends App{
def calculateSquare(numbers: List[Int]): List[Int] = {
  numbers.map(number => number * number)
}
val inputList = List(1, 2, 3, 4, 5)
val outputList = calculateSquare(inputList)
println(outputList) // Output: List(1, 4, 9, 16, 25)
}