package cs3500.marblesolitaire.controller;

import org.junit.Test;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;

public class TriangleSolitaireControllerTest {


  @Test(expected = IllegalArgumentException.class)
  public void exceptio1() {
    StringBuffer ap = new StringBuffer();
    StringReader r = null;
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl();
    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exceptionc1() throws IOException {
    StringWriter ap = new StringWriter();
    StringReader r = new StringReader("2 4 4 4 q");
    ap.close();
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl();
    one.playGame(mod1);
  }

  @Test(expected = IllegalStateException.class)
  public void exception2() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 4 4 4 q");
    r.close();
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalArgumentException.class)
  public void exception5() {
    StringBuffer ap = null;
    StringReader r = new StringReader("2 4 4 4 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl();
    one.playGame(mod1);
  }


  @Test(expected = IllegalArgumentException.class)
  public void exceptio3() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("2 4 4 4 q");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = null;
    one.playGame(mod1);
  }

  @Test
  public void constructorsqqqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader("q  2 0 0 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl(3, 0, 0);
    one.playGame(mod1);

    assertEquals(

            "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5", ap.toString());
  }

  @Test
  public void constructorsqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader(" 2 q 0 0 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl(3, 0, 0);
    one.playGame(mod1);

    assertEquals(

            "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5", ap.toString());
  }

  @Test
  public void constructorsqqq() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader(" 2 2 q 0 ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl(3, 0, 0);
    one.playGame(mod1);

    assertEquals(

            "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5", ap.toString());
  }

  @Test
  public void constructorsqq1q() {
    StringBuffer ap = new StringBuffer();
    StringReader r = new StringReader(" 2 2 0 q ");
    MarbleSolitaireControllerImpl one = new MarbleSolitaireControllerImpl(r, ap);
    TriangleSolitaireModelImpl mod1 = new TriangleSolitaireModelImpl(3, 0, 0);
    one.playGame(mod1);

    assertEquals(

            "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5\n" +
                    "Game quit!\n" +
                    "State of game when quit:\n" +
                    "  _\n" +
                    " O O\n" +
                    "O O O\n" +
                    "Score: " + "5", ap.toString());
  }
}
