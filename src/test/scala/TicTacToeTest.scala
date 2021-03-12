import org.scalatest.FunSuite

class TicTacToeTest extends FunSuite {

  // If we were to set up a Tic-Tac-Toe game,
  // we would want to know whether the board's current state is solved, wouldn't we?
  // Our goal is to create a function that will check that for us!
  //
  // Assume that the board comes in the form of a 3×3 array,
  // where the value is:  0 if a spot is empty, 1 if it is an X, or 2 if it is an O,
  // like so:
  //
  // [[0,0,1],
  // [0,1,2],
  // [2,1,0]]
  //
  // We want our function to return:
  // -1 if the board is not solved yet,
  // 1 if X won,
  // 2 if O won,
  // or 0 if it's a cat's game (i.e. a draw).

  test("TicTacToeTest") {
    assert(TicTacToe.checkIfSolved(Array(Array(0, 0, 0), Array(0, 0, 0), Array(0, 0, 0))) === -1)
    assert(TicTacToe.checkIfSolved(Array(Array(1, 1, 1), Array(0, 0, 0), Array(0, 0, 0))) === 1)
    assert(TicTacToe.checkIfSolved(Array(Array(2, 2, 2), Array(0, 0, 0), Array(0, 0, 0))) === 2)
    assert(TicTacToe.checkIfSolved(Array(Array(1, 0, 1), Array(0, 0, 0), Array(0, 0, 0))) === -1)
    assert(TicTacToe.checkIfSolved(Array(Array(0, 0, 0), Array(1, 1, 1), Array(0, 0, 0))) === 1)
    assert(TicTacToe.checkIfSolved(Array(Array(1, 0, 0), Array(1, 0, 0), Array(1, 0, 0))) === 1)
    assert(TicTacToe.checkIfSolved(Array(Array(0, 1, 0), Array(0, 1, 0), Array(0, 1, 0))) === 1)




  }

}
