package cs3500.marblesolitaire.controller;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;

public interface MarbleSolitaireController {

  /**
   * <p>Runs the game until it's over.</p>
   *
   * @throws IllegalArgumentException if the provided model is null.
   * @throws IllegalStateException    if the controller is unable to successfully receive input or
   *                                  transmit output.
   */
  public void playGame(MarbleSolitaireModel model) throws IllegalArgumentException,
          IllegalStateException;
}
