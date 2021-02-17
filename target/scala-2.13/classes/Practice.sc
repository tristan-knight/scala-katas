import scala.collection.immutable.ListMap

println("Hello world")

val multipliedString: String = "Hello" * 3

var pair = (1, "5")

println(pair._1)
println(pair._2)

val numeralList = List(("I", 1), ("V", 5), ("X", 10), ("L", 50), ("C", 100), ("D", 500), ("M", 1000))
for ((numeral, integer) <- numeralList) {
  println(s"$numeral is equivalent to $integer")
}

val basicList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
val filteredList = basicList.filter((i: Int) => i / 2 > 3)

//val numeralMap = ListMap("I" -> 1, "V" -> 5, "X" -> 10, "L" -> 50, "C" -> 100, "D" -> 500, "M" -> 1000)
//val firstMapValue = numeralMap("I")
//val firstMapIndex = ???

val myList = List(1, 2, 3, 4)

val testIndex = myList.indexOf(3)
val y = 7

val anonymousFunction: Int => Int = (x: Int) => y * 2

def myFunction(func: Int => Int, randomNumber: Int ): Int = {
  func(2) * randomNumber
}

def f(s: String): String = "f(" + s + ")"

def g(s: String): String = "g(" + s + ")"

val fAndThenG = f andThen g

