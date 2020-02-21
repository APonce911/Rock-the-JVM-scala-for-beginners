package lectures

import scala.annotation.tailrec

object Recursion extends App {

  def tailrecfactorial(n: Int): BigInt = {
    @tailrec
    def factorialHelper(x: Int, accumulator: BigInt): BigInt = {
      if (x <= 1) accumulator
      else factorialHelper(x-1, x * accumulator)
    }
    factorialHelper(n,1)
  }

  println(tailrecfactorial(10))

  def tailrecConcatenate(aString: String, n: Int) : String = {

    def concatenateHelper(aString: String, x: Int, accumulator: String): String = {
      if (x <= 1) accumulator
      else concatenateHelper(aString, x-1, aString + accumulator)
    }
    concatenateHelper(aString, n, "")
  }
  println(tailrecConcatenate("Hello Scala! ",5))


  def tailrecFibonacciNumber(n: Int):Int = {
    def fibonacciNumberHelper(x: Int, lastFibonacci: Int, beforeLastFibonacci: Int): Int = {
      if (x <= 2) lastFibonacci
//      else {
////        fibonacciNumberHelper(x - 1???, lastFibonacci + beforeLastFibonacci)
////        beforeLastFibonacci = lastFibonacci
////        lastFibonacci = x-1
//      }
      fibonacciNumberHelper(n, 1,0)
    }
  }
  println(tailrecFibonacciNumber(3))

  //  create isprime test function using tailrecursion
}

