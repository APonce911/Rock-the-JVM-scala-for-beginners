package lectures.part2OOP

import lectures.part2OOP.Objects.Person

object InheritanceAndTraits extends App {

  class Person(val name: String,val  age: Int ) {
    def this(name: String) = this(name, 2)
    def this() = this("Foo", 2)
  }
  class Adult(name:String, age: Int, IdCard: String) extends Person(name)
  class Adult2(name:String, age: Int, IdCard: String) extends Person
  val adult : Person = new Adult2("carlos",30,"832989")
    println(adult.name)
    println(adult.age)

}
