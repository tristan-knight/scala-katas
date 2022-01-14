import org.scalatest.FunSuite

class EncodeTextTest extends FunSuite {

  test("EncodeText.encodeText") {
    assert(EncodeText.encodeText("") == "")
    assert(EncodeText.encodeText("A") == "N")
    assert(EncodeText.encodeText("a") == "N")
    assert(EncodeText.encodeText("Z") == "M")
    assert(EncodeText.encodeText("S") == "F")
    assert(EncodeText.encodeText("U") == "H")


    assert(EncodeText.encodeText("AZ") == "NM")

    assert(EncodeText.encodeText("OE") == "BR")
    assert(EncodeText.encodeText("ö") == "BR")
    assert(EncodeText.encodeText("ä") == "NR")
    assert(EncodeText.encodeText("ß") == "FF")
    assert(EncodeText.encodeText("Ü") == "HR")


    assert(EncodeText.encodeText("1") == "1")
    assert(EncodeText.encodeText("a-1") == "N-1")


  }

}
