package lectures

import scala.annotation.tailrec

object Recursion extends App {

  def factorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator)
    }
    factorialHelper(n,1)
  }

  println(factorial(100000))
}

