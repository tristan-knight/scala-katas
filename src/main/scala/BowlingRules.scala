import scala.collection.mutable.ArrayBuffer

class BowlingRules {

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

  var currentScore: ArrayBuffer[Int] = ArrayBuffer()

  def roll(pins: Int) = {
    currentScore += pins

  }

//  // returns score for game
//  def score(): Int = {
//    var totalScore: Int = 0
//    currentScore.foreach(score => totalScore += score )
////    for (d <- currentScore) {
////      totalScore += d
////    }
//    // check for spares
//    var currIndex: Int = 0
//    while (currIndex + 2 < currentScore.length) {
//      if (currentScore(currIndex) + currentScore(currIndex + 1) == 10) {
//        totalScore += currentScore(currIndex + 2)
//      }
//      currIndex += 2
//    }
//    totalScore
//  }

  // returns score for game
  def score(): Int = {
    if (currentScore(18) + currentScore(19) == 10) {
      val firstFrames: Seq[(Int, Int)] = Seq.tabulate(10) {
        currentScore.map(score => (score, score + 1))
      }
      val firstFrameScores: Seq[Int] = firstFrames.map(frame => {
        case frame._1 == 10 =>
          10 + firstFrames(firstFrames.indexOf(frame) + 1)._1 + firstFrames(firstFrames.indexOf(frame) + 1)._2
        case frame._1 + frame._2 == 10 =>
          10 + firstFrames(firstFrames.indexOf(frame) + 1)._1
        case _ =>
          frame._1 + frame._2
      }
      )
      val lastFrameScore = currentScore(18) + currentScore(19) + currentScore(20)
      firstFrameScores.sum + lastFrameScore
    }
    else
      {
        val frames: Seq[(Int, Int)] = Seq.tabulate(10){currentScore.map(score => (score, score + 1))}
        val frameScores: Seq[Int] = frames.map(frame => {
          case frame._1 == 10 =>
            10 + frames(frames.indexOf(frame) + 1)._1 + frames(frames.indexOf(frame) + 1)._2
          case frame._1 + frame._2 == 10 =>
            10 + frames(frames.indexOf(frame) + 1)._1
          case _ =>
            frame._1 + frame._2
        }
        )

        frameScores.sum

      }
    }
}
