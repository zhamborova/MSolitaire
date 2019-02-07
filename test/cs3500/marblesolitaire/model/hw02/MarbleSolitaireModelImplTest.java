package cs3500.marblesolitaire.model.hw02;

import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.fail;

public class MarbleSolitaireModelImplTest {
  //Board not as expected after starting from arm l
  // ength 3 and empty cell (2,4) and moving from (0,4)

  MarbleSolitaireModelImpl board1 = new MarbleSolitaireModelImpl(2, 4);
  MarbleSolitaireModelImpl board3 = new MarbleSolitaireModelImpl();
  MarbleSolitaireModelImpl boardT = new MarbleSolitaireModelImpl();
  MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(5);
  MarbleSolitaireModelImpl board32 = new MarbleSolitaireModelImpl(2, 2);
  MarbleSolitaireModelImpl board02 = new MarbleSolitaireModelImpl(0, 2);
  MarbleSolitaireModelImpl board7 = new MarbleSolitaireModelImpl(7, 8, 7);


  @Test
          (expected = IllegalArgumentException.class)
  public void testContr1() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(0);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr0() {

    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(0, 0);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr2() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(1);
  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr3() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(2);
  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr4() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(-2);
  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr5() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(-1, -1, 3);
  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr6() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(-1, -1);
  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr7() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(7, 7);
  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr8() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(3, 7, 7);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr9() {
    MarbleSolitaireModelImpl board5 = new MarbleSolitaireModelImpl(14, 100, 5);

  }

  @Test
  public void testContr10() {
    try {
      MarbleSolitaireModelImpl board = new MarbleSolitaireModelImpl(14, 100);
      fail("nothing");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid empty cell position (14,100)", e.getMessage());
    }
  }

  @Test
  public void testContr11() {
    try {
      MarbleSolitaireModelImpl board = new MarbleSolitaireModelImpl(14);
      fail("nothing");
    } catch (IllegalArgumentException e) {
      assertEquals("Invalid arm thickness", e.getMessage());
    }
  }


  //More tests are in the MoveTest
  @Test
  public void isGameOver() {
    assertEquals(false, board3.isGameOver());
    assertEquals(false, board5.isGameOver());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc7() {
    board3.move(3, 3, 5, 3);
  }


  @Test(expected = IllegalArgumentException.class)
  public void testExc8() {
    board3.move(3, 2, 3, 4);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc9() {
    board3.move(3, 2, 1, 4);
  }

  @Test
  public void getGameState() {

    assertEquals(
            "    O O O\n"
                    +
                    "    O O O\n"
                    +
                    "O O O O O O O\n"
                    +
                    "O O O _ O O O\n"
                    +
                    "O O O O O O O\n"
                    +
                    "    O O O\n"
                    +
                    "    O O O", board3.getGameState());

    assertEquals(
            "    _ O O\n"
                    +
                    "    O O O\n"
                    +
                    "O O O O O O O\n"
                    +
                    "O O O O O O O\n"
                    +
                    "O O O O O O O\n"
                    +
                    "    O O O\n"
                    +
                    "    O O O", board02.getGameState());

    assertEquals(
            "        O O O O O\n"
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
                    "        O O O O O", board5.getGameState());
    assertEquals("    O O O\n"
            +
            "    O O O\n"
            +
            "O O _ O O O O\n"
            +
            "O O O O O O O\n"
            +
            "O O O O O O O\n"
            +
            "    O O O\n"
            +
            "    O O O", board32.getGameState())
    ;

    assertEquals(
            "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "O O O O O O O O O O O O O O O O O O O\n"
                    +
                    "O O O O O O O O O O O O O O O O O O O\n"
                    +
                    "O O O O O O O _ O O O O O O O O O O O\n"
                    +
                    "O O O O O O O O O O O O O O O O O O O\n"
                    +
                    "O O O O O O O O O O O O O O O O O O O\n"
                    +
                    "O O O O O O O O O O O O O O O O O O O\n"
                    +
                    "O O O O O O O O O O O O O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O\n"
                    +
                    "            O O O O O O O", board7.getGameState());
  }


  @Test
  public void getScore() {
    assertEquals(32, boardT.getScore());
    boardT.move(1, 3, 3, 3);
    assertEquals(31, boardT.getScore());
    assertEquals(104, board5.getScore());
    board5.move(4, 6, 6, 6);
    assertEquals(103, board5.getScore());
  }
}



