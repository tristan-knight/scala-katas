import org.scalatest.FunSuite

//User Story:
//
//As a user, I want to know if a year is a leap year,
// So that I can plan for an extra day on February 29th during those years.
//
//Acceptance Criteria:
//
//All years divisible by 400 ARE leap years (so, for example, 2000 was indeed a leap year),
//All years divisible by 100 but not by 400 are NOT leap years (so, for example, 1700, 1800, and 1900 were NOT leap years, NOR will 2100 be a leap year),
//All years divisible by 4 but not by 100 ARE leap years (e.g., 2008, 2012, 20

class LeapYearTest extends FunSuite {

  test("LeapYear.isLeapYear") {
    assert(LeapYear.isLeapYear(2019) == false)
    assert(LeapYear.isLeapYear(2000) == true)
    assert(LeapYear.isLeapYear(1600) == true)
    assert(LeapYear.isLeapYear(2020) == true)
    assert(LeapYear.isLeapYear(1900) == false)
    assert(LeapYear.isLeapYear(1800) == false)
    assert(LeapYear.isLeapYear(1700) == false)



  }


}
