package lectures

object StringOperations extends App {

  val aString: String = "Hello, I am learning scala"

  //  Java methods

  println(aString.charAt(3))
  println(aString.substring(7,11))
  println(aString.split(" ").toList)
  println(aString.startsWith("Hello"))
  println(aString.replace(" ","-"))
  println(aString.toLowerCase())
  println(aString.length)

  // Scala Methods

  println(aString.reverse)
  println(aString.take(2))

  val aNumberString = "5"
  val aNumber = aNumberString.toInt

  println(aNumber)
  println('a' +: aNumberString :+ 'b')
  println(s"tenho $aNumberString passaros")
  println(s"tenho ${aNumber - 4} passaros")

  //  F-Interpolators

  val speed = 1.2f
  val name = "Daniel"
  val myth = f"$name%s can eat $speed%2.2f burgers per minute"
  println(myth)

  // Raw-Interpolator

  val newLine = "This is a \n newline"
  println(raw"$newLine")
  println(raw"This is a \n newline")
}
