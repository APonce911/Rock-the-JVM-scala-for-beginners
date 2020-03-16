package lectures.part2OOP

object Objects extends App {

  object Person {
    val Number_of_eyes = 2
    def canFly = false
    // apply is a factory method, used to instantiate new persons
    def apply (mother: Person, father: Person) = new Person("Bobby")
  }

  class Person(val name: String) {
  }

  println(Person.Number_of_eyes)
  println(Person.canFly)

  // Person is a singleton object
  val mary = Person
  val john = Person

  //  each Person is a different instance of the Person class
  val carl = new Person("Carl")
  val eli = new Person("Eli")

  println(mary == john)

  // Uses of factory method
  println(Person.apply(carl,eli).name)
  println(Person(carl,eli).name)
  // It do not work on mary,john because they are the singleton object, not an instance of Person class.

}
