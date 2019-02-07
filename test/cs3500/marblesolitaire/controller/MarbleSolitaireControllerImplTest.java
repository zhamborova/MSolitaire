package cs3500.marblesolitaire.controller;


import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;

public class MarbleSolitaireControllerImplTest {


  @Test
  public void playGame() {
    StringReader r1 = new StringReader(
            " -1 2  4  4  4 " +
                    //check out of bounds
                    " 33  3 3 3 " +
                    //check out of bounds again
                    " 33  3 3 3 " +
                    //move from empty slot
                    " 3  4 5 4" +
                    // move to non-empty slot
                    " 3 1 5 1" +
                    //jumping over an empty slot
                    " 1 4 3 4" +
                    " t 3 2 3 4 " +
                    "1 3 3 3 " +
                    "1 5 1 3" +
                    //diagonal move
                    " 4 5 2 3 " +
                    //from position that doesn't exist
                    " 0 0 1 3 " +
                    //to position that doesn't exist
                    " 1 3 33 3 " +

                    " p 4 3 2 3  " +
                    " 1 3 3 3 " +
                    " 6 3 4 3" +
                    " 5 1 5 3" +
                    " 3 1 5 1" +
                    " 5 4 5 2" +
                    " 5 1 5 3" +
                    " 5 6 5 4" +
                    " 7 5 5 5" +
                    " 7 3 7 5" +
                    " 4 5 6 5" +
                    " 7 5 5 5" +
                    " 2 5 4 5" +
                    " 3 7 3 5" +
                    " 5 7 3 7" +
                    " 3 4 3 6" +
                    " 3 7 3 5" +
                    " 5 4 5 6 " +
                    " 5 6 3 6" +
                    " 3 6 3 4" +
                    " 3 4 3 2" +
                    " 3 2 5 2 " +
                    " 5 2 5 4" +
                    " 4 4 4 6" +
                    " 6 4 4 4" +
                    " 4 3 4 5 " +
                    " 4 6 4 4 ");


    StringBuffer ap = new StringBuffer();
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r1, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
    assertEquals("    O O O\n"
            + "    O O O\n"
            + "O O O O O O O\n"
            + "O O O _ O O O\n"
            + "O O O O O O O\n"
            + "    O O O\n"
            + "    O O O\n" +
            "Score: " + "32\n" +
            "Retry:\n" +

            "    O O O\n"
            + "    O _ O\n"
            + "O O O _ O O O\n"
            + "O O O O O O O\n"
            + "O O O O O O O\n"
            + "    O O O\n"
            + "    O O O\n" +
            "Score: " + "31\n" +
            "Invalid move. Play again. One or more inputs are out of bounds.\n" +
            "Invalid move. Play again. One or more inputs are out of bounds.\n" +
            "Invalid move. Play again. Cannot move from an empty slot.\n" +
            "Invalid move. Play again. Cannot move to a slot that is not empty.\n" +
            "Invalid move. Play again. Cannot move over an empty slot.\n" +
            "Retry:\n" +
            "    O O O\n" +
            "    O _ O\n" +
            "O _ _ O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O\n" +
            "Score: " + "30\n" +
            "    _ O O\n" +
            "    _ _ O\n" +
            "O _ O O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O\n" +
            "Score: " + "29\n" +
            "    O _ _\n"
            +
            "    _ _ O\n"
            +
            "O _ O O O O O\n"
            +
            "O O O O O O O\n"
            +
            "O O O O O O O\n"
            +
            "    O O O\n" +
            "    O O O\n" +
            "Score: " + "28\n" +
            "Invalid move. Play again. Cannot move further than 2 positions away.\n" +
            "Invalid move. Play again. One or more inputs are out of bounds.\n" +
            "Invalid move. Play again. One or more inputs are out of bounds.\n" +
            "Retry:\n" +

            "    O _ _\n"
            +
            "    O _ O\n"
            +
            "O _ _ O O O O\n"
            +
            "O O _ O O O O\n"
            +
            "O O O O O O O\n"
            +
            "    O O O\n"
            +
            "    O O O\n" +
            "Score: " + "27\n" +
            "    _ _ _\n" +
            "    _ _ O\n"
            +
            "O _ O O O O O\n"
            +
            "O O _ O O O O\n"
            +
            "O O O O O O O\n"
            +
            "    O O O\n"
            +
            "    O O O\n" +
            "Score: " + "26\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "O _ O O O O O\n"
            +
            "O O O O O O O\n"
            +
            "O O _ O O O O\n"
            +
            "    _ O O\n"
            +
            "    O O O\n" +
            "Score: " + "25\n" +
            "    _ _ _\n" +
            "    _ _ O\n"
            +
            "O _ O O O O O\n"
            +
            "O O O O O O O\n"
            +
            "_ _ O O O O O\n"
            +
            "    _ O O\n"
            +
            "    O O O\n" +
            "Score: " + "24\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O O O O\n"
            +
            "O _ O O O O O\n"
            +
            "    _ O O\n"
            +
            "    O O O\n" +
            "Score: " + "23\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O O O O\n"
            +
            "O O _ _ O O O\n"
            +
            "    _ O O\n"
            +
            "    O O O\n" +
            "Score: " + "22\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O O O O\n"
            +
            "_ _ O _ O O O\n"
            +
            "    _ O O\n"
            +
            "    O O O\n" +
            "Score: " + "21\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O O O O\n"
            +
            "_ _ O O _ _ O\n"
            +
            "    _ O O\n"
            +
            "    O O O\n" +
            "Score: " + "20\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O O O O\n"
            +
            "_ _ O O O _ O\n"
            +
            "    _ O _\n"
            +
            "    O O _\n" +
            "Score: " + "19\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O O O O\n"
            +
            "_ _ O O O _ O\n"
            +
            "    _ O _\n"
            +
            "    _ _ O\n" +
            "Score: " + "18\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O _ O O\n"
            +
            "_ _ O O _ _ O\n"
            +
            "    _ O O\n"
            +
            "    _ _ O\n" +
            "Score: " + "17\n" +
            "    _ _ _\n"
            +
            "    _ _ O\n"
            +
            "_ _ O O O O O\n"
            +
            "_ O O O _ O O\n"
            +
            "_ _ O O O _ O\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "16\n" +
            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O O _ O O\n"
            +
            "_ O O O O O O\n"
            +
            "_ _ O O O _ O\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "15\n" +
            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O O O _ _\n"
            +
            "_ O O O O O O\n"
            +
            "_ _ O O O _ O\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "14\n" +
            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O O O _ O\n"
            +
            "_ O O O O O _\n"
            +
            "_ _ O O O _ _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "13\n" +

            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O _ _ O O\n"
            +
            "_ O O O O O _\n"
            +
            "_ _ O O O _ _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "12\n" +

            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O _ O _ _\n"
            +
            "_ O O O O O _\n"
            +
            "_ _ O O O _ _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "11\n" +

            "    _ _ _\n"
            +

            "    _ _ _\n"
            +
            "_ _ O _ O _ _\n"
            +
            "_ O O O O O _\n"
            +
            "_ _ O _ _ O _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "10\n" +

            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O _ O O _\n"
            +
            "_ O O O O _ _\n"
            +
            "_ _ O _ _ _ _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "9\n" +

            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ O O _ _ _\n"
            +
            "_ O O O O _ _\n"
            +
            "_ _ O _ _ _ _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "8\n" +

            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ O _ _ _ _ _\n"
            +
            "_ O O O O _ _\n"
            +
            "_ _ O _ _ _ _\n"
            +
            "    _ O _\n"
            +
            "    _ _ _\n" +
            "Score: " + "7\n" +
            "    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O O O _ _\n" +
            "_ O O _ _ _ _\n" +
            "    _ O _\n" +
            "    _ _ _\n" +
            "Score: " + "6\n" +

            "    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O O O _ _\n" +
            "_ _ _ O _ _ _\n" +
            "    _ O _\n" +
            "    _ _ _\n" +
            "Score: " + "5\n" +

            "    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O _ _ O _\n" +
            "_ _ _ O _ _ _\n" +
            "    _ O _\n" +
            "    _ _ _\n" +
            "Score: " + "4\n" +
            "    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O O _ O _\n" +
            "_ _ _ _ _ _ _\n" +
            "    _ _ _\n" +
            "    _ _ _\n" +
            "Score: " + "3\n" +

            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ _ _ _ _ _\n"
            +
            "_ _ _ _ O O _\n"
            +
            "_ _ _ _ _ _ _\n"
            +
            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "Score: " + "2\n" +
            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ _ _ _ _ _\n"
            +
            "_ _ _ O _ _ _\n"
            +
            "_ _ _ _ _ _ _\n"
            +
            "    _ _ _\n"
            +
            "    _ _ _\n" +
            "Score: " + "1\n" +
            "Game over!\n" +
            "    _ _ _\n"
            +
            "    _ _ _\n"
            +
            "_ _ _ _ _ _ _\n"
            +
            "_ _ _ O _ _ _\n"
            +
            "_ _ _ _ _ _ _\n"
            +
            "    _ _ _\n"
            +
            "    _ _ _\n" +
            "Score: " + "1", ap.toString());

  }

  ////////////CONSTRUCTORS////////////

  @Test
  public void constructors() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("5 7 7 7 Q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(5);
    one.playGame(mod1);

    assertEquals("        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n" +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O _ O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n" +
            "Score: 104" + "\n" +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n" +
            "O O O O O O _ O O O O O O\n"
            +
            "O O O O O O _ O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n" +
            "Score: 103" + "\n" +
            "Game quit!\n" +
            "State of game when quit:\n" +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n" +
            "O O O O O O _ O O O O O O\n"
            +
            "O O O O O O _ O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "O O O O O O O O O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n"
            +
            "        O O O O O\n" +
            "Score: 103", ap.toString());
  }

  @Test
  public void constructors1() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 3 4 3 Q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "    O O O\n"
                    + "    _ O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "31\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    _ O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "31", ap.toString());

  }


  @Test
  public void constructors2() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 3 4 3 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "    O O O\n"
                    + "    _ O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "31\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    _ O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "31", ap.toString());

  }

  @Test
  public void constructorsn() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 3\n 4 3 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "    O O O\n"
                    + "    _ O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "31\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    _ O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "31", ap.toString());

  }


  @Test(expected = IllegalArgumentException.class)
  public void constructors3() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("1 2 3 2 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(33, 2);
    one.playGame(mod1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructors4() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("1 2 3 2 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(2, 3, 2);
    one.playGame(mod1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void constructors41() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("1 2 3 2 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(2, 33, 2);
    one.playGame(mod1);
  }


  ////////IOEXCEPTIONS//////////////

  @Test(expected = IllegalStateException.class)
  public void exception1() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("p 2 4 4 4 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exception2() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 4 4 4 q");
    r.close();
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = NullPointerException.class)
  public void exception3() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 4 4 4 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = null;
    one.playGame(mod1);
  }


  @Test(expected = IllegalStateException.class)
  public void exception4() throws IOException {
    StringWriter ap = new StringWriter();
    StringReader r = new StringReader("2 4 4 4 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    ap.close();
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalArgumentException.class)
  public void exception5() {
    StringBuffer ap = null;
    StringReader r = new StringReader("2 4 4 4 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalStateException.class)
  public void exception6() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 4 4 4 q ");
    r.close();
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalArgumentException.class)
  public void exception7() {
    StringBuffer ap = null;
    StringReader r = null;
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalStateException.class)
  public void exception8() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("p");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exception9() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  //THIS SHOULD FAIL///
  @Test(expected = IllegalStateException.class)
  public void exception10() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("\nq 2 4 4 4");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exception11() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("\n");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test
  public void constructorsq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("q 3 4 3 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32", ap.toString());

  }


  @Test
  public void constructorsqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("3 q 4 3 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32", ap.toString());

  }


  @Test
  public void constructorsqqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader(" 3 4 q 3 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32", ap.toString());

  }

  @Test
  public void constructorsqqqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader(" 3 4 3 q ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    MarbleSolitaireModel mod1 = new MarbleSolitaireModelImpl(3, 3, 2);
    one.playGame(mod1);

    assertEquals(
            "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "    O O O\n"
                    + "    O O O\n"
                    + "O O O O O O O\n"
                    + "O O _ O O O O\n"
                    + "O O O O O O O\n"
                    + "    O O O\n"
                    + "    O O O\n" +
                    "Score: " + "32", ap.toString());

  }

}