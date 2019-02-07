package cs3500.marblesolitaire.controller;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;


public class EuropeanSolitaireControllerTest {


  @Test(expected = IllegalArgumentException.class)
  public void exceptio1() {
    StringBuffer ap = new StringBuffer();
    StringReader r = null;
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl();
    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exceptionc1() throws IOException {
    StringWriter ap = new StringWriter();
    StringReader r = new StringReader("2 4 4 4 q");

    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    ap.close();
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl();

    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exception2() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 4 4 4 q");
    r.close();
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalArgumentException.class)
  public void exception5() {
    StringBuffer ap = null;
    StringReader r = new StringReader("2 4 4 4 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test
  public void constructors1() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 3 4 3 Q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36\n" +
                    "    O O O\n"
                    + "  O _ O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "35\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "  O _ O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "35", ap.toString());

  }

  @Test
  public void constructorsq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("q 3 4 3 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36", ap.toString());

  }

  @Test
  public void constructorsqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader(" 3 q 4 3 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36", ap.toString());

  }

  @Test
  public void constructorsqqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("3 4 q 3 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36", ap.toString());

  }

  @Test
  public void constructorsqqqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("3 4 3 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    EuropeanSolitaireModelImpl mod1 = new EuropeanSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "  O O O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "  O O O O O\n"
                    + "    O O O\n" +
                    "Score: " + "36", ap.toString());

  }


}
