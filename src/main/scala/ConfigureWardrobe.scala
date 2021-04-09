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

object ConfigureWardrobe {

  def getWardrobeCombinations(length: Int): ListBuffer[List[Int]] = {
    val wardrobeSizes = List(50, 75, 100, 120)
    val wardrobeCombinations: ListBuffer[List[Int]] = ListBuffer()
    wardrobeCombinations.addAll(
        wardrobeSizes
          .filter(sizes => length % sizes == 0) // I think this will actually break for other configurations
          .map{item => List(item).flatMap(item => List.fill(length/item)(item))}
    )
    wardrobeCombinations
  }
}



