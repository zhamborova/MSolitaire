package cs3500.marblesolitaire.model.hw04;

import cs3500.marblesolitaire.model.hw02.SlotValue;

/**
 * Class TriangleSolitaireModelImpl represents the model for Marble Solitaire game.
 */
public class TriangleSolitaireModelImpl extends MarbleBase {
  private int armThick;

  /**
   * Default constructor with no arguments.
   */
  public TriangleSolitaireModelImpl() {
    this(5, 0, 0);
    this.armThick = 5;
  }

  /**
   * Second constructor that takes in an armThick.
   */
  public TriangleSolitaireModelImpl(int armThick) {

    this(armThick, 0, 0);
    this.armThick = armThick;
  }


  /**
   * Third constructor that takes in postition of an empty slot(row and column).
   */
  public TriangleSolitaireModelImpl(int sRow, int sCol) {
    this(5, sRow, sCol);
    this.armThick = 5;
  }

  /**
   * Fourth constructor that takes in and arm thickness and a position of an empty slot(row and
   * column).
   */
  public TriangleSolitaireModelImpl(int armThick, int rowV, int columnV) {

    if (armThick < 1) {
      throw new IllegalArgumentException("Invalid arm thickness");
    }
    this.armThick = armThick;
    longest = armThick * 2 - 1;
    board = new SlotValue[longest][longest];


    for (int i = 0; i < armThick; i++) {
      for (int j = 0; j < armThick; j++) {
        if (j <= i) {
          board[i][j] = SlotValue.peg;
        } else {
          board[i][j] = SlotValue.invalid;
        }
      }
    }
    validPosns(rowV, columnV);
  }

  @Override
  public String getGameState() {
    StringBuilder gameState = new StringBuilder();
    for (int i = 0; i < armThick; i++) {
      int spaces = armThick - i;
      for (int s = 1; s < spaces; s++) {
        gameState.append(" ");
      }
      for (int j = 0; j < armThick; j++) {
        if (board[i][j + 1] == SlotValue.invalid &&
                (board[i][j] == SlotValue.peg || board[i][j] == SlotValue.empty)) {
          gameState.append(board[i][j].getValue());
          break;
        }
        gameState.append(board[i][j].getValue() + " ");
      }
      if (i != armThick - 1) {
        gameState.append("\n");
      }
    }
    gameState.deleteCharAt(gameState.length() - 1);
    return gameState.toString();
  }


  @Override
  /**
   * Checks if a valid move could be made from the given position.
   *
   * @param fromRow is a row marbel is moving from.
   * @param fromCol is column marbel is moving from.
   * @param toRow   is  a row marbel is moving to.
   * @param toCol   is column marbel is moving to.
   * @return true if there is valid move from a given position, false otherwise.
   */
  protected boolean validMoveHelper(int fromRow, int fromCol, int toRow, int toCol) {
    return (((Math.abs(fromRow - toRow) == 2) && (fromCol == toCol))
            || ((Math.abs(fromCol - toCol) == 2) && (fromRow == toRow))
            || ((Math.abs(fromCol - toCol) == 2) && (Math.abs(fromRow - toRow)) == 2));

  }


  @Override
  protected int init(int armThick) throws IllegalArgumentException {
    if (armThick < 1) {
      throw new IllegalArgumentException("Invalid arm thickness");
    }
    longest = armThick * 2 - 1;
    board = new SlotValue[longest][longest];
    this.armThick = armThick;
    return armThick;

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
                || (validMove(x, y, x, y - 2))
                || (validMove(x, y, x + 2, y + 2))
                || (validMove(x, y, x - 2, y - 2))
                || (validMove(x, y, x + 2, y - 2))
                || (validMove(x, y, x - 2, y + 2))) {
          return false;
        }
      }
    }
    return true;
  }


}
































