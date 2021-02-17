import scala.collection.mutable.ListBuffer


object WardrobeConfigure {


  def getWardrobeCombinations(length: Int): ListBuffer[List[Int]] = {
    val wardrobeSizes = List(50, 75, 100, 120)
    var wardrobeCombinations: ListBuffer[List[Int]] = ListBuffer()
    wardrobeCombinations.addAll(
        wardrobeSizes
          .filter(sizes => length % sizes == 0)
          .map{item => List(item).flatMap(item => List.fill(length/item)(item))}
    )
    wardrobeCombinations
  }

}



