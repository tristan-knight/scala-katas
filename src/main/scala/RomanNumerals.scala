
// The Romans wrote numbers using letters - I, V, X, L, C, D, M.
//
//Write a function to convert from normal numbers to Roman Numerals:
//eg
//
//1 -->  I
//10 --> X
//7 --> VII
//2751--> MMDCCLI
//
//
//The easiest way to note down a number is to make that many marks - little I's.
// Thus I means 1, II means 2, III means 3.
// However, four strokes seemed like too many....
//
// So the Romans moved on to the symbol for 5 - V.
// Placing I in front of the V — or placing any smaller number in front of any larger number — indicates subtraction.
// So IV means 4. After V comes a series of additions - VI means 6, VII means 7, VIII means 8.

// X means 10. But wait — what about 9? Same deal. IX means to subtract I from X, leaving 9.
// Numbers in the teens, twenties and thirties follow the same form as the first set, only with X's indicating the number of tens.
// So XXXI is 31, and XXIV is 24.
//
// I: 1
// V: 5
// X: 10
// L: 50
// C: 100
// D: 500
// M: 1000
//

object RomanNumerals {

  // create a list containing each single-letter Roman numeral and its corresponding integer value
  val numeralList = List(("M", 1000), ("D", 500), ("C", 100), ("L", 50), ("X", 10), ("V", 5), ("I", 1), ("null", 0))
  var listIndex: Int = 0

  def convertToRoman(number: Int): String = {
    // filter list so it only contains relevant values (e.g. we don't need to know that C = 100 if the number given is less than 100).
    val filteredList = numeralList.filter((item: (String, Int)) => item._2 <= number)
    var result: String = ""
    result = doIt(number, filteredList.head._2, result)
    listIndex = 0
    result
  }

  @scala.annotation.tailrec
  def doIt(number: Int, greatestNumeral: Int, result: String): String = {
    // should end if the number passed in equals 0
    if (number == 0) return result

    var divisor: Int = greatestNumeral
    var temp: Int = number
    var result1: String = result
    if (temp >= divisor) {
      val numberAdded = addNumber(temp)
      result1 += numberAdded._1
      divisor = divisor * numberAdded._2
      temp -= divisor
    }

    listIndex += 1
    val nextGreatestNumeral: Int = numeralList(listIndex)._2
    doIt(temp, nextGreatestNumeral, result1)

  }
  // 4, 9, 14, 19, 24, 29, etc so if number ends in 4 or 9 it will be an exception and we'll need to use subtraction
  // so maybe a rule involving this?
  def addNumber(number: Int): (String, Int) = {
    // "case number / greatestNumeral.value >= 4 => use subtraction
    // Otherwise add as specified below
    if (number >= 10) ("X" * (number / 10), 1 * (number / 10))
    else if (number >= 5) ("V", 1)
    else if (number == 4) ("IV", 4)
    else ("I" * number, 1 * number)

}

}


