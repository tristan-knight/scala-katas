import org.scalatest.FunSuite


//String calculator
//Create a simple String calculator with a method int Add(string numbers)
//
//The method can take 0, 1 or 2 numbers, and will return their sum
// for example ” ” or “1” or “1,2”
// (for an empty string it will return 0)
//
//Start with the simplest test case of an empty string and move to 1 and two numbers
//Remember to solve things as simple as possible so that you force yourself to write tests you did not think about
//Remember to refactor after each passing test
//
//All

class StringCalculatorTest extends FunSuite {
  test("New Argument Case") {
    assert(StringCalculator.add("") === 0)
    assert(StringCalculator.add("1") === 1)
    assert(StringCalculator.add("2") === 2)
    assert(StringCalculator.add("1,2") === 3)
    assertThrows[IllegalArgumentException] {
      StringCalculator.add("1,2,3")
    }




  }

}
