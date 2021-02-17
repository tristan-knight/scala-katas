


object StringCalculator {
  def add(numbers: String): Int = {
    val stringArray = numbers.split(",")
    if (stringArray.length > 2) throw new IllegalArgumentException
    var sum = 0
    stringArray.foreach(sum += convertToInt(_))
    sum
  }


  def convertToInt(number: String): Int = {
    if (number == "") 0
    else number.toInt

  }

}
