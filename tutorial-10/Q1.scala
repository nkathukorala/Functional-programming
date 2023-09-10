object Q1 extends App{
def calculateAverage(temperaturesCelsius: List[Double]): Double = {
  val temperaturesFahrenheit = temperaturesCelsius.map(c => (c * 9/5) + 32)
  val sumFahrenheit = temperaturesFahrenheit.reduce(_ + _)
  val averageFahrenheit = sumFahrenheit / temperaturesFahrenheit.length.toDouble
  averageFahrenheit
}

val averageFahrenheit = calculateAverage(List(0, 10, 20, 30))
println(s"Average Fahrenheit temperature: $averageFahrenheit")
}
