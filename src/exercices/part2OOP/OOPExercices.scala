package exercices

object OOPExercices extends App {

  class Writer(firstName: String , surname: String, val year: Int   ) {
    def fullName: String = s"$firstName $surname"
  }

  val writer: Writer = new Writer("Renan","Gomes",1980)
  println(writer)
  println(writer.fullName)
  val imposter: Writer = new Writer("Renan","Gomes",1980)


  class Novel(name: String, yearOfRelease: Int, author: Writer) {

    def isWrittenBy(author : Writer) : Boolean = (this.author == author)
    def authorAge :Int = this.yearOfRelease - this.author.year
    def copy(newYearOfRelease: Int) = new Novel (this.name, newYearOfRelease, this.author)
  }

  val novel: Novel = new Novel("A Grande Viagem", 1998, writer)
  println(novel)
  println(novel.isWrittenBy(writer))
  println(novel.isWrittenBy(imposter))
  println(novel.authorAge)
  println(novel.copy(1999))

  class Counter(val initialValue: Int) {

    def currentCount: Int = initialValue
    def increment: Counter = new Counter( initialValue + 1)
    def decrement: Counter = new Counter(initialValue - 1)
    def increment(incrementalAmount: Int) :Counter = new Counter( initialValue + incrementalAmount)
    def decrement(decrementalAmount: Int) :Counter = new Counter(initialValue - decrementalAmount)
  }

  val counter = new Counter(3)
  println(counter)
  println(counter.increment.currentCount)
  println(counter.decrement.currentCount)
  println(counter.increment(3).currentCount)
  println(counter.decrement(3).currentCount)















}
