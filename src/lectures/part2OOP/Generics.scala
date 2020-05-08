package lectures.part2OOP

object Generics {
  //  generic class
  class MyList[A] {

  }
  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  object MyList {
    //  generic method
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]
}
