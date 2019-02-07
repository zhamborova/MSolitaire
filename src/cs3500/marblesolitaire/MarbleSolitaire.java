package cs3500.marblesolitaire;

import java.io.InputStreamReader;


import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelImpl;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModelImpl;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModelImpl;

import static java.lang.Integer.parseInt;

/**
 * Class main to run Mrble Solitaire Game.
 */
public final class MarbleSolitaire {
  /**
   * Runs different models of the game.
   *
   * @param args that are user inputs.
   */
  public static void main(String[] args) {

    InputStreamReader r = new InputStreamReader(System.in);
    Builder b1 = new Builder("english");
    switch (args[0]) {
      case "english":
        b1 = new Builder("english");
        break;
      case "triangular":
        b1 = new Builder("triangular");
        break;
      case "european":
        b1 = new Builder("european");
        break;

      default:
        break;
    }

    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-size")) {
        b1.armThick(parseInt(args[i + 1]));
      }
      if (args[i].equals("-hole")) {
        b1.row(parseInt(args[i + 1]));
        b1.column((parseInt(args[i + 2])));

      }
    }

    MarbleSolitaireControllerImpl cont = new MarbleSolitaireControllerImpl(r, System.out);
    cont.playGame(b1.build());

  }

  /**
   * Class Builder represents a builder for various Marble Solitaire models.
   */
  final static class Builder {
    private String boardType;
    private int row;
    private int column;
    private int armThick;

    Builder(String board) {
      this.boardType = board;
      if (boardType.equals("english") || boardType.equals("european")) {
        row = 3;
        column = 3;
        armThick = 3;
      } else {
        row = 0;
        column = 0;
        armThick = 5;
      }
    }

    /**
     * Sets the arm thickness of the game grid.
     *
     * @return {@code this} for method chaining
     */
    public Builder armThick(int armThick) {
      this.armThick = armThick;
      return this;
    }

    /**
     * Sets the row of the initial hole.
     *
     * @return {@code this}, for method chaining
     */
    public Builder row(int row) {
      this.row = row;
      return this;
    }

    /**
     * Sets the column of the initial hole.
     *
     * @return {@code this}, for method chaining
     */
    public Builder column(int column) {
      this.column = column;
      return this;
    }

    /**
     * Creates a model.
     *
     * @return MarbleSolitaireModel.
     */

    public MarbleSolitaireModel build() {
      if (boardType.equals("triangular")) {
        return new TriangleSolitaireModelImpl(this.armThick, this.row, this.column);
      } else if (boardType.equals("european")) {
        return new EuropeanSolitaireModelImpl(this.armThick, this.row, this.column);
      } else {
        return new MarbleSolitaireModelImpl(this.armThick, this.row, this.column);
      }
    }
  }
}
















