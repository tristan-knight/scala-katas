import org.scalatest.FunSuite

class RomanNumeralsTest extends FunSuite {
  test("RomanNumerals.convertToRoman") {
    assert(RomanNumerals.convertToRoman(1) === "I")
    assert(RomanNumerals.convertToRoman(2) === "II")
    assert(RomanNumerals.convertToRoman(3) === "III")
    assert(RomanNumerals.convertToRoman(4) === "IV")
    assert(RomanNumerals.convertToRoman(5) === "V")
    assert(RomanNumerals.convertToRoman(6) === "VI")
    assert(RomanNumerals.convertToRoman(10) === "X")
    assert(RomanNumerals.convertToRoman(11) === "XI")
    assert(RomanNumerals.convertToRoman(15) === "XV")
    assert(RomanNumerals.convertToRoman(18) === "XVIII")
    assert(RomanNumerals.convertToRoman(20) === "XX")
    assert(RomanNumerals.convertToRoman(38) === "XXXVIII")
  }

//  test("RomanNumerals.addNumber") {
//    assert(RomanNumerals.addNumber(1) === "I")
//    assert(RomanNumerals.addNumber(3) === "III")
//    assert(RomanNumerals.addNumber(5) === "V")
//    assert(RomanNumerals.addNumber(8) === "V")
//  }
}
