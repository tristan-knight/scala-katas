import scala.collection.mutable.{Map => MutableMap}

object StringToDictionary {

  def toDictionary(string: String): MutableMap[String, String] = {
    val map: MutableMap[String, String] = MutableMap()
    val splitString = string.split(";").filterNot(string => string.isEmpty)

    splitString.foreach { string =>
      val (key, value) = buildKeyAndValue(string)
      if (map.contains(key)) {
        map(key) = value
      }
      else {
        map.addOne(key, value)
      }
    }
    map
  }

  private def buildKeyAndValue(string: String): (String, String) = {
    val splitIndex =
      if (string.indexOf("=") > 0) string.indexOf("=")
      else throw new IllegalArgumentException("String must contain key before '='")
    (string.substring(0, splitIndex), string.substring(splitIndex + 1))
  }

}

