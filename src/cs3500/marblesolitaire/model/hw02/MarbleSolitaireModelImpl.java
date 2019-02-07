package cs3500.marblesolitaire.model.hw02;


import cs3500.marblesolitaire.model.hw04.MarbleBase;

/**
 * Class MarbleSolitaireModelImpl represents the model for Marble Solitaire game.
 */
public class MarbleSolitaireModelImpl extends MarbleBase {
  /**
   * Default constructor that takes no arguments.
   */
  public MarbleSolitaireModelImpl() {
    this(3, 3, 3);
  }

  /**
   * Second constructor that takes in an armThick.
   */
  public MarbleSolitaireModelImpl(int armThick) {
    this(armThick, (armThick * 3 - 2) / 2, (armThick * 3 - 2) / 2);
  }


  /**
   * Third constructor that takes in a postition of an empty slot(row and column).
   */
  public MarbleSolitaireModelImpl(int sRow, int sCol) {

    this(3, sRow, sCol);
  }

  /***
   *  <p>Constructor4 takes in coordinates x and y of initial empty slot and arm thickness "a"
   * and constructs aXa board with empty slot at position (x,y).</p>
   * @throws IllegalArgumentException if given invalid coordinates or given thickness is
   *                                  non-odd or negative integer or integer less than 3.
   */
  public MarbleSolitaireModelImpl(int armThick, int rowV, int columnV) {
    int mid = init(armThick);

    for (int row = 0; row < longest; row++) {
      for (int column = 0; column < longest; column++) {
        if (row < mid - (armThick / 2) || row > mid + (armThick / 2)) {
          if (column < mid - (armThick / 2) || column > mid + (armThick / 2)) {
            board[row][column] = SlotValue.invalid;

          } else if (column == mid + (armThick / 2)) {

            board[row][column] = SlotValue.peg;

          } else {
            board[row][column] = SlotValue.peg;
          }
        } else {
          if (column != longest - 1) {
            board[row][column] = SlotValue.peg;
          } else {
            board[row][column] = SlotValue.peg;
          }
        }
      }

    }
    validPosns(rowV, columnV);

  }


  //All methods from this class are now inherited from Marble Base.


}



