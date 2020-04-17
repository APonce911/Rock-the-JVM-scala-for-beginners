package exercices.part2OOP

object MyList extends App {
  abstract class MyList {
    /*
      TO DO Methods
      MyList describe a list of integers

      head: Int = first element of the list
      tail: List = remainder of the list
      isEmpty: Boolean = is this list empty
      add(int): new List => new list with this element added
      toString => a string representation of the list

     */
    def head: Int
    def tail: List[Int]
    def isEmpty: Boolean
    def add(int : Int): List[Int]
    def toString: String

  }
//  class MyIntList extends MyList
//  val myIntList  = new MyIntList()
//  println(myIntList)
//  println(myIntList.isEmpty)

}
