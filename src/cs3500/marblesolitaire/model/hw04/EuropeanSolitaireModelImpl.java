package cs3500.marblesolitaire.model.hw04;


import cs3500.marblesolitaire.model.hw02.SlotValue;


/**
 * Class EuropeanSolitaireModelImpl represents the model for Marble Solitaire game.
 */

public class EuropeanSolitaireModelImpl extends MarbleBase {

  /**
   * Default constructor with no arguments.
   */
  public EuropeanSolitaireModelImpl() {
    this(3, 3, 3);
  }

  /**
   * Second constructor that takes in an armThick.
   */
  public EuropeanSolitaireModelImpl(int armThick) {

    this(armThick, (armThick * 3 - 2) / 2, (armThick * 3 - 2) / 2);
  }


  /**
   * Third constructor that takes in postition of an empty slot(row and column).
   */
  public EuropeanSolitaireModelImpl(int sRow, int sCol) {
    this(3, sRow, sCol);
  }

  /***
   *  <p>Constructor4 takes in coordinates x and y of initial empty slot and arm thickness "a"
   * and constructs aXa board with empty slot at position (x,y).</p>
   * @throws IllegalArgumentException if given invalid coordinates or given thickness is
   *                                  non-odd or negative integer or integer less than 3.
   */

  public EuropeanSolitaireModelImpl(int armThick, int rowV, int columnV) {


    int mid = init(armThick);

    for (int i = 0; i < longest; i++) {
      for (int j = 0; j < longest; j++) {

        if (Math.abs(longest / 2 - i) + Math.abs(longest / 2 - j)
                <= armThick * 2 - 2) {
          board[i][j] = SlotValue.peg;

        } else {
          board[i][j] = SlotValue.invalid;
        }
      }
    }
    validPosns(rowV, columnV);
  }
}


