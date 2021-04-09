//object TicTacToe {
//
//  // If we were to set up a Tic-Tac-Toe game,
//  // we would want to know whether the board's current state is solved, wouldn't we?
//  // Our goal is to create a function that will check that for us!
//  //
//  // Assume that the board comes in the form of a 3×3 array,
//  // where the value is:  0 if a spot is empty, 1 if it is an X, or 2 if it is an O,
//  // like so:
//  //
//  // [[0,0,1],
//  // [0,1,2],
//  // [2,1,0]]
//  //
//  // We want our function to return:
//  // -1 if the board is not solved yet,
//  // 1 if X won,
//  // 2 if O won,
//  // or 0 if it's a cat's game (i.e. a draw).
//
//  def checkIfSolved(board: Array[Array[Int]]): Int = {
//    val rowSum = Array(checkRow(board(0)), checkRow(board(1)), checkRow(board(2))).sum
//    val rotatedBoard = rotateBoard(board)
//    val colSum = Array(checkRow(rotatedBoard(0)), checkRow(rotatedBoard(1)), checkRow(rotatedBoard(2))).sum
//
//    if (rowSum != 0) {
//      rowSum
//    }
//    else if (colSum != 0) {
//      colSum
//    }
//    else -1
//
//  }
//
//  private def rotateBoard(board: Array[Array[Int]]): Array[Array[Int]] = {
//    val numbers = Array(0, 1, 2)
//    numbers.map(number => Array(Array, Array(1)(number), Array(2)(number)))
////    Array(
////      Array(board(0)(0), board(1)(0), board(2)(0)),
////      Array(board(0)(1), board(1)(1), board(2)(1)),
////      Array(board(0)(2), board(1)(2), board(2)(2)))
//  }
//
//  private def checkRow(row: Array[Int]) = {
//    if (row.sum == 3) {
//      1
//    }
//    else if (row.sum == 6) {
//      2
//    }
//    else 0
//  }
//
//}
