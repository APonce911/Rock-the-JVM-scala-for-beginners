package lectures

object Functions extends App {

  def greeting(name: String,age: Int):String = {
    s"Hi, my name is $name and I am $age years old."
  }
  println(greeting("Doug",30))

  def deepFactorial(n:Int):Int ={
    if (n <= 0) 1
    else n * deepFactorial(n-1)
  }
  println(deepFactorial(10))

  def deepFibonacciNumber(n: Int):Int = {
    if (n <= 2) 1
    else deepFibonacciNumber(n-1) + deepFibonacciNumber(n-2)
  }
  println(deepFibonacciNumber(6))

  def deepTestPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int):Boolean = {
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)
    }
    isPrimeUntil(n/2)
  }
  println(deepTestPrime(37))
  println(deepTestPrime(2003))
  println(deepTestPrime(37*17))

}
