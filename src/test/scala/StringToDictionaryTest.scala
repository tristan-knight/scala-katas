import org.scalatest.FunSuite

class NewKataTest extends FunSuite {

//  Implement a function that maps a special formatted string into a dictionary. The function should have the following signature:
//
//    IDictionary<string, string> ToDictionary(string input);
//  The following table shows some examples for input strings and the resulting dictionary.
//
//  „a=1;b=2;c=3“	{{„a“, „1“}, {„b“, „2“},{„c“, „3“}}
//  „a=1;a=2“	{{„a“, „2“}}
//  „a=1;;b=2“	{{„a“, „1“}, {„b“, „2“}}
//  „a=“	{{„a“, „“}}
//  „=1“	Exception
//  „“	{}
//  „a==1“	{{„a“, „=1“}}


  test("stringToDictionary") {
//    assert(StringToDictionary.toDictionary("") == Map())
//    assert(StringToDictionary.toDictionary("a=1") == Map("a" -> "1"))
//    assert(StringToDictionary.toDictionary("a=12") == Map("a" -> "12"))
//    assert(StringToDictionary.toDictionary("a=") == Map("a" -> ""))
//    assert(StringToDictionary.toDictionary("a==1") == Map("a" -> "=1"))
    assertThrows[Exception]{StringToDictionary.toDictionary("=1")}


  }

}
