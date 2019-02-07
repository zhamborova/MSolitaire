package cs3500.marblesolitaire.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;

import static java.lang.String.valueOf;

/**
 * <p>Class MarbleSolitaireControllerImpl represents the controller for Marble Solitaire game.</p>
 */
public class MarbleSolitaireControllerImpl implements MarbleSolitaireController {

  private Readable in;
  private Appendable out;


  /**
   * <p>Constructor for Controller.</p>
   *
   * @param rd Readable
   * @param ap Appendable
   * @throws IllegalArgumentException if given invalid Readable or Appendable;
   */
  public MarbleSolitaireControllerImpl(Readable rd, Appendable ap) throws IllegalArgumentException {
    if (rd == null || ap == null) {
      throw new IllegalArgumentException();
    }
    this.in = (rd);
    this.out = ap;
  }


  @Override
  public void playGame(MarbleSolitaireModel model) throws IllegalArgumentException,
          IllegalStateException {

    Objects.requireNonNull(model);
    boolean newNextLine = true;
    ArrayList<Integer> inputs = new ArrayList<Integer>();
    Scanner scan = new Scanner(this.in);
    appendableHandler(model.getGameState(), newNextLine);
    appendableHandler("Score: " + valueOf(model.getScore()), newNextLine);

    while (!model.isGameOver()) {

      if (scan.hasNext()) {
        String temp = readHandler(scan);


        if (!temp.equals("q") && !temp.equals("Q") && !isPositiveInt(temp)) {
          appendableHandler("Retry:", newNextLine);
          continue;
        }


        while (inputs.size() < 4) {
          if (isPositiveInt(temp)) {
            inputs.add(Integer.parseInt(temp));
            if (inputs.size() != 4) {
              temp = readHandler(scan);
            }
          } else {
            if ((temp.equals("q")) || temp.equals("Q")) {
              appendableHandler("Game quit!\n" + "State of game when quit:", newNextLine);
              appendableHandler(model.getGameState(), newNextLine);
              newNextLine = false;
              appendableHandler("Score: " + valueOf(model.getScore()), newNextLine);
              return;
            } else {
              temp = readHandler(scan);
            }
          }
        }

        if (4 == inputs.size()) {
          try {
            model.move(inputs.get(0) - 1, inputs.get(1) - 1,
                    inputs.get(2) - 1, inputs.get(3) - 1);
            appendableHandler(model.getGameState(), newNextLine);
            appendableHandler("Score: " + valueOf(model.getScore()), newNextLine);
            inputs.clear();
          } catch (IllegalArgumentException e) {
            appendableHandler("Invalid move. Play again. " + e.getMessage(),
                    newNextLine);
            inputs.clear();
          }
        }
      } else {
        readHandler(scan);

      }
    }


    appendableHandler("Game over!", newNextLine);
    appendableHandler(model.getGameState(), newNextLine);
    newNextLine = false;
    appendableHandler("Score: " + valueOf(model.getScore()), newNextLine);

  }


  /**
   * <p>Handles appending strings to the appendable.</p>
   *
   * @throws IllegalStateException if IO error occured such as Appendable being null.
   */
  private void appendableHandler(String appendableThings, boolean newNextLine) {
    try {

      if (newNextLine) {
        out.append(appendableThings + "\n");
      } else {
        out.append(appendableThings);
        newNextLine = true;
      }
    } catch (IOException e1) {

      throw new IllegalStateException();
    }
  }

  /**
   * <p>Handles the Readable getting inputs  from the scanner.</p>
   *
   * @throws IllegalStateException if IO error occured such as readable being closed or null or out
   *                               inputs.
   */
  private String readHandler(Scanner scan) {
    try {

      return scan.next();

      ///this throws various exceptions that is why I was told to write just an Exception.
    } catch (Exception e1) {

      throw new IllegalStateException();
    }
  }


  /**
   * <p>Checks if the given string is a positive int.</p>
   *
   * @return true if an int, false otherwise.
   */
  private boolean isPositiveInt(String input) {
    try {
      int i = Integer.parseInt(input);
      return i >= 0;
      //should be ParseException but try block never throws it.
    } catch (Exception e) {
      return false;
    }
  }


}



