object EncodeText {

//  Implement a function that encodes a text by [ROT-13].
//
//  The ROT-13 coding exchanges every character by the character 13 positions further back in the alphabet.
  //  If the value lies behind the end of the alphabet it is fetched from the beginning.
//
// A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z.
//
//  Example:
//
//    Hello, World -> URYYB, JBEYQ
//  An „e" gets to an „R" and a „W" gets to a „J". Lower case letters are translated to upper case.
//
//  German "Umlaute" need to be replaced by the following character combinations before the coding: „Ö" = „OE", „Ä" = „AE", „Ü" = „UE", „ß" = „SS".
//
//    Characters that are no letters are not encoded.

  val lastCharacter = 'Z'.toInt
  val charactersInAlphabet = 26
  val offset = 13

  def encodeText(text: String): String = {
    val upperText = text.toUpperCase
    cleanUp(upperText).map(char => if (char.isLetter) encode(char) else char)
  }


  private def encode(char: Char) = {
    var currentCharacter = char.toInt + offset
    if (currentCharacter > lastCharacter) {
      currentCharacter -= charactersInAlphabet
    }
    currentCharacter.toChar
  }

  private def cleanUp(str: String): String = {
    str.replaceAll("Ö", "OE")
    .replaceAll("Ä", "AE")
    .replaceAll("Ü", "UE")
    .replaceAll("ß", "SS")
  }
}
