import org.scalatest.FunSuite

import scala.collection.mutable.ListBuffer

//Configure your own Wardrobe
// Imagine you have just moved into your new apartment,
// and then you notice that you still need a new wardrobe for your dressing room.
// Regrettably, you won't find a wardrobe that fits exactly to the size of your wall.
// But fortunately, the Swedish furniture dealer of your choice offers you the opportunity to build your own,
// customized wardrobe by combining individual wardrobe elements.
//
// The wardrobe elements are available in the following sizes: 50cm, 75cm, 100cm, and 120cm.
// The wall on which the wardrobe elements are placed has a total length of 250cm.
// With which combinations of wardrobe elements can you make the most of the space?
//
//Write a function that returns all combinations of wardrobe elements that exactly fill the wall.
//

class ConfigureWardrobeTest extends FunSuite {
  test("WardrobeConfigure.getWardrobeCombinations") {
    assert(WardrobeConfigure.getWardrobeCombinations(40) === ListBuffer())
    assert(WardrobeConfigure.getWardrobeCombinations(50) === ListBuffer(List(50)))
    assert(WardrobeConfigure.getWardrobeCombinations(75) === ListBuffer(List(75)))
    assert(WardrobeConfigure.getWardrobeCombinations(100) === ListBuffer(List(50, 50), List(100)))
    assert(WardrobeConfigure.getWardrobeCombinations(120) === ListBuffer(List(120)))
    assert(WardrobeConfigure.getWardrobeCombinations(150) === ListBuffer(List(50, 50, 50), List(75, 75), List(50, 100)))

  }

}
