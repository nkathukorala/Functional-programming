object Q3 extends App{
def isPrime(number: Int): Boolean = {
  if (number <= 1) false
  else if (number == 2) true
  else !(2 to (number - 1)).exists(i => number % i == 0) 
}

def filterPrime(numbers: List[Int]): List[Int] = {
  numbers.filter(isPrime)
}

val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val outputList = filterPrime(inputList)
println(outputList) // Output: List(2, 3, 5, 7)
}