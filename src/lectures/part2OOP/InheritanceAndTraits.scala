package lectures.part2OOP

import lectures.part2OOP.Objects.Person

object InheritanceAndTraits extends App {

  class Person(name: String, age: Int ) {
    def this(name: String) = this(name, 2)
    def this() = this("Foo", 2)
  }
  class Adult(name:String, age: Int, IdCard: String) extends Person(name)
  class Adult2(name:String, age: Int, IdCard: String) extends Person
//  val adult = new Adult
//    println(adult)

}
