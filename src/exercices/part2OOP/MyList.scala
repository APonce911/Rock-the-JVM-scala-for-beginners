package exercices.part2OOP

object MyList extends App {
  abstract class MyList {
    /*
      TO DO Methods
      MyList describe a list of integers
      head = first element of the list
      tail = remainder of the list
      isEmpty = is this list empty
      add(int) => new list with this element added
      toString => a string representation of the list

     */
    def isEmpty: Boolean = this eq Nil
  }
  class MyIntList extends MyList
  val myIntList  = new MyIntList()
  println(myIntList)
  println(myIntList.isEmpty)

}
