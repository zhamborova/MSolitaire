package cs3500.marblesolitaire.model.hw04;


import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.SlotValue;

/**
 * Base Class for various MarbleSolitair Models. All methods were pulled here for abstraction.
 */
public abstract class MarbleBase implements MarbleSolitaireModel {

  protected SlotValue[][] board;
  protected int longest;


  /**
   * <p> Move a single marble from a given position to another given position. A move is valid only
   * if the from and to positions are valid. Specific implementations may place additional
   * constraints on the validity of a move.</p>
   *
   * @param fromRow the row number of the position to be moved from (starts at 0)
   * @param fromCol the column number of the position to be moved from (starts at 0)
   * @param toRow   the row number of the position to be moved to (starts at 0)
   * @param toCol   the column number of the position to be moved to (starts at 0)
   * @throws IllegalArgumentException if integers fromRow,fromCol, toRow, toCol are out of bounds,
   *                                  if the distance between fromRow and toRow/ fromCol and toCol
   *                                  is not equal to 2, if the move is diagonal, if the move trying
   *                                  to be made is from empty slot, if the move trying to be made
   *                                  is without jumping over a peg, if the move is to a slot that
   *                                  is not empty.
   */

  public void move(int fromRow, int fromCol, int toRow, int toCol) throws IllegalArgumentException {
    if (validMove(fromRow, fromCol, toRow, toCol)) {
      board[toRow][toCol] = SlotValue.peg;
      board[fromRow][fromCol] = SlotValue.empty;
      board[((fromRow + toRow) / 2)][((fromCol + toCol) / 2)] = SlotValue.empty;
    } else {
      informativeMessage(fromRow, fromCol, toRow, toCol);
    }
  }

  /**
   * Determine and return if the game is over or not. A game is over if no more moves can be made.
   *
   * @return true if the game is over, false otherwise
   */
  public boolean isGameOver() {
    boolean result = false;
    for (int x = 0; x < board.length; x++) {
      for (int y = 0; y < board.length; y++) {
        if ((validMove(x, y, x - 2, y))
                || (validMove(x, y, x + 2, y))
                || (validMove(x, y, x, y + 2))
                || (validMove(x, y, x, y - 2))) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Return a string that represents the current state of the board. The string should have one line
   * per row of the game board. Each slot on the game board is a single character (O, _ or space for
   * a marble, empty and invalid position respectively). Slots in a row should be separated by a
   * space. Each row has no space before the first slot and after the last slot.
   *
   * @return the game state as a string
   */
  public String getGameState() {
    StringBuilder gameState = new StringBuilder();
    for (int x = 0; x < longest; x++) {
      for (int y = 0; y < longest; y++) {
        if ((board[x][y].getValue().equals(" ")) && (y > longest / 2)) {
          break;
        } else {
          gameState.append(board[x][y].getValue() + " ");
        }
      }
      gameState.deleteCharAt(gameState.length() - 1);
      gameState.append("\n");
    }
    gameState.deleteCharAt(gameState.length() - 1);
    return gameState.toString();
  }


  /**
   * Return the number of marbles currently on the board.
   *
   * @return the number of marbles currently on the board
   */
  public int getScore() {
    int score = 0;
    for (int x = 0; x < board.length; x++) {
      for (int y = 0; y < board.length; y++) {
        if (board[x][y] == SlotValue.peg) {
          score++;
        }
      }
    }
    return score;
  }

  /**
   * Checks if a valid move could be made from the given position.
   *
   * @param fromRow is a row marbel is moving from.
   * @param fromCol is column marbel is moving from.
   * @param toRow   is  a row marbel is moving to.
   * @param toCol   is column marbel is moving to.
   * @return true if there is valid move from a given position, false otherwise.
   */
  protected boolean validMove(int fromRow, int fromCol, int toRow, int toCol) {
    return (!outOfBounds(fromRow, fromCol, toRow, toCol)
            && (board[fromRow][fromCol] == SlotValue.peg)
            && (board[toRow][toCol] == SlotValue.empty))
            && (board[((fromRow + toRow) / 2)][((fromCol + toCol) / 2)] == SlotValue.peg)
            && validMoveHelper(fromRow, fromCol, toRow, toCol);
  }

  /**
   * Checks if a valid move could be made from the given position. Was pulled out from validMove
   * method for abstraction, as there is an additional condition for triangular board.
   *
   * @param fromRow is a row marbel is moving from.
   * @param fromCol is column marbel is moving from.
   * @param toRow   is  a row marbel is moving to.
   * @param toCol   is column marbel is moving to.
   * @return true if there is valid move from a given position, false otherwise.
   */
  protected boolean validMoveHelper(int fromRow, int fromCol, int toRow, int toCol) {
    return (((Math.abs(fromRow - toRow) == 2) && (fromCol == toCol))
            || ((Math.abs(fromCol - toCol) == 2) && (fromRow == toRow)));
  }

  /**
   * Check if the given parameters outside of game bounds.
   *
   * @param fromRow is a row marbel is moving from.
   * @param fromCol is a column marbel is moving from.
   * @param toRow   is a row marbel is moving to.
   * @param toCol   is a column marbel is moving to.
   * @return true if any variables are out of bounds, false otherwise.
   */
  protected boolean outOfBounds(int fromRow, int fromCol, int toRow, int toCol) {
    return (fromRow < 0 || fromRow > longest - 1)
            || (fromCol < 0 || fromCol > longest - 1)
            || (toRow < 0 || toRow > longest - 1)
            || (toCol < 0 || toCol > longest - 1);

  }

  /**
   * Determines what kind of invalid move was made and outputs appropriate message describing it in
   * the exception.
   *
   * @param fromRow is a row marbel is moving from.
   * @param fromCol is a column marbel is moving from.
   * @param toRow   is a row marbel is moving to.
   * @param toCol   is a column marbel is moving to.
   * @throws IllegalArgumentException for invalid move made.
   */
  protected void informativeMessage(int fromRow, int fromCol, int toRow, int toCol)
          throws IllegalArgumentException {
    String message = "";
    if (outOfBounds(fromRow, fromCol, toRow, toCol)) {
      message = "One or more inputs are out of bounds.";
    } else if (board[fromRow][fromCol] != SlotValue.peg) {
      message = "Cannot move from an empty slot.";
    } else if (board[toRow][toCol] != SlotValue.empty) {
      message = "Cannot move to a slot that is not empty.";
    } else if (board[((fromRow + toRow) / 2)][((fromCol + toCol) / 2)] != SlotValue.peg) {
      message = "Cannot move over an empty slot.";
    } else if (((Math.abs(fromRow - toRow) != 2) || (fromCol != toCol))
            || ((Math.abs(fromCol - toCol) != 2) || (fromRow != toRow))) {
      message = "Cannot move further than 2 positions away.";
    }

    throw new IllegalArgumentException(message);

  }


  /**
   * Check if the given parameters outside of game bounds. This part of code was pulled out from
   * constructors for abstraction.
   *
   * @param rowV    is a row marbel is moving to.
   * @param columnV is a column marbel is moving to.
   * @return true if any variables are out of bounds, false otherwise.
   */
  protected void validPosns(int rowV, int columnV) {
    //have to check if it is in bounds else throws IndexOutOfBoundsException
    //thus two elses


    if (rowV >= 0 && rowV < longest && columnV >= 0 && columnV < longest) {

      if (board[rowV][columnV] != SlotValue.invalid) {

        board[rowV][columnV] = SlotValue.empty;
      } else {


        throw new IllegalArgumentException("Invalid empty cell position (" + rowV + ","
                + columnV + ")");
      }
    } else {
      throw new IllegalArgumentException("Invalid empty cell position (" + rowV + ","
              + columnV + ")");
    }
  }

  /**
   * * Initializes the game board, sets the longest variable and the mid.
   *
   * @return mid
   */
  protected int init(int armThick) throws IllegalArgumentException {
    if (armThick % 2 == 0 || armThick < 3) {
      throw new IllegalArgumentException("Invalid arm thickness");
    }

    longest = armThick * 3 - 2;
    int mid = longest / 2;
    board = new SlotValue[longest][longest];

    return mid;

  }
}






