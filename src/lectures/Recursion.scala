package lectures

object Recursion extends App {

  def factorial(n: Int): Int ={
    def factorialHelper(x:Int, accumulator:Int): Int = {
      if (x <= 1) accumulator
      else factorialHelper(n-1, x * accumulator)
    }
    factorialHelper(n,1)
  }

  println(factorial(10))
}

