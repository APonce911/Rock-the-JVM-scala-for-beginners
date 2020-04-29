package exercices.part2OOP

import exercices.part2OOP.MyList.Cons

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
    def tail: MyList
    def isEmpty: Boolean
    def add(int : Int): MyList
//    def toString: String

  }
  object Empty extends MyList {
    def head: Int = throw new NoSuchElementException
    def tail: MyList = throw new NoSuchElementException
    def isEmpty: Boolean = true
    def add(element : Int): MyList = new Cons(element, Empty)
  }
  class Cons(val head: Int, val tail: MyList) extends MyList {
    def isEmpty: Boolean = false
    def add(element : Int): MyList = new Cons(element, this)
  }

  val myList  = new Cons(1, Empty)
  println(myList)
  println(myList.head)

}
