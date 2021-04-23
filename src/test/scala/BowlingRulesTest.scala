import org.scalatest.FunSuite

//    Bowling Rules
//    The game consists of 10 frames. In each frame the player has two rolls to knock down 10 pins.
//    The score for the frame is the total number of pins knocked down,
//    plus bonuses for strikes and spares.
//    A spare is when the player knocks down all 10 pins in two rolls.
//    The bonus for that frame is the number of pins knocked down by the next roll.
//    A strike is when the player knocks down all 10 pins on his first roll. The frame is then completed with a single roll.
//    The bonus for that frame is the value of the next two rolls.
//    In the tenth frame a player who rolls a spare or strike is allowed to roll the extra balls to complete the frame.
//    However no more than three balls can be rolled in tenth frame.
//    Requirements
//    Write a class Game that has two methods
//    void roll(int) is called each time the player rolls a ball. The argument is the number of pins knocked down.
//    int score() returns the total score for that game.

class BowlingRulesTest extends FunSuite {

  test("BowlingRules.roll") {

  }

  test("BowlingRules.score") {
    val bowlingRules = new BowlingRules
    assert(bowlingRules.score() == 0)


  }

  test("single frame") {
    val bowlingRules = new BowlingRules
    bowlingRules.roll(7)
    bowlingRules.roll(0)
    assert(bowlingRules.score() == 7)

  }

  test("spare") {
    val bowlingRules = new BowlingRules
    bowlingRules.roll(3)
    bowlingRules.roll(7)
    bowlingRules.roll(1)
    bowlingRules.roll(2)
    // First frame score of 11, second frame score of 3
    assert(bowlingRules.score() == 10 + 1 + 3)

  }

  test("spare second frame") {
    val bowlingRules = new BowlingRules
    bowlingRules.roll(3)
    bowlingRules.roll(5)
    bowlingRules.roll(9)
    bowlingRules.roll(1)
    bowlingRules.roll(1)
    bowlingRules.roll(2)
    // First frame score of 11, second frame score of 3
    assert(bowlingRules.score() == 8 + 10 + 1 + 3)

  }

  test("whole game - all strikes") {
    val bowlingRules = new BowlingRules
    (1 to 21) foreach (roll => bowlingRules.roll(10))
    assert(bowlingRules.score() == 300)
  }

  test("no strike or spares") {
    val bowlingRules = new BowlingRules
    (1 to 20) foreach (roll => bowlingRules.roll(7))
    assert(bowlingRules.score() == 7 * 20)
  }

  test("a soar") {
    ???
  }

}
