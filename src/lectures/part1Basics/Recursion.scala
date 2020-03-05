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
    def fibonacciNumberHelper(x: Int, lastFibonacci: Int, beforeLastFibonacci: Int): Int =
      if (x  >= n) lastFibonacci
      else fibonacciNumberHelper(x + 1, lastFibonacci + beforeLastFibonacci,lastFibonacci )

    if (n <= 2) 1
    else fibonacciNumberHelper(2 ,1 ,1)
  }
  println(tailrecFibonacciNumber(6))

  def tailrecIsPrime( n: Int) = {
    def isPrimeHelper(x: Int, isStillPrime: Boolean): Boolean = {
      if (!isStillPrime) false
      else if (x <= 1) true
      else isPrimeHelper(x - 1 , n % x != 0 && isStillPrime)
    }
    isPrimeHelper(n / 2, true)
  }
  println(tailrecIsPrime(2003))
  println(tailrecIsPrime(629))

}

