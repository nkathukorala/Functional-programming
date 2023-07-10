object tutorial5_4 extends App{

oddOrEven(10)

def oddOrEven(n: Int): Unit = {
    if (isEven(n)) println(s"$n is even")
    else println(s"$n is odd")
  }


def isEven(n: Int): Boolean = n match {
  case 0 => true
  case _ => isOdd(n - 1)
}

def isOdd(n: Int): Boolean = !isEven(n)

}