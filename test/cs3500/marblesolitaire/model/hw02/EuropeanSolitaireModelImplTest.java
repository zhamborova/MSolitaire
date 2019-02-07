package cs3500.marblesolitaire.model.hw02;

import org.junit.Test;

import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;


public class EuropeanSolitaireModelImplTest {

  EuropeanSolitaireModelImpl board3 = new EuropeanSolitaireModelImpl();
  EuropeanSolitaireModelImpl boardArmthick = new EuropeanSolitaireModelImpl(5);
  EuropeanSolitaireModelImpl boardPosn = new EuropeanSolitaireModelImpl(3, 3);
  EuropeanSolitaireModelImpl boardAllThree = new EuropeanSolitaireModelImpl(5, 3, 3);
  EuropeanSolitaireModelImpl boardAllT = new EuropeanSolitaireModelImpl(5, 0, 4);

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr0() {
    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(0);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContreven() {
    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(2);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr1() {
    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(-1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testTr() {

    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(-1, 0);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr1() {

    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(0, -1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr2() {

    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(-1, -1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr3() {
    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(-1,
            1, 1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr4() {

    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(3,
            -1, 1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr5() {

    EuropeanSolitaireModelImpl getBoardArmthick = new EuropeanSolitaireModelImpl(3,
            0, 0);

  }


  @Test
  public void move() {


    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());

    board3.move(1, 3, 3, 3);
    assertEquals("    O O O\n" +
            "  O O _ O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());
    board3.move(2, 1, 2, 3);
    assertEquals("    O O O\n" +
            "  O O _ O O\n" +
            "O _ _ O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());

    board3.move(3, 3, 1, 3);
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());


    board3.move(3, 1, 3, 3);
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "O _ _ O O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());


    board3.move(5, 1, 3, 1);
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "O O _ O O O O\n" +
            "O _ O O O O O\n" +
            "  _ O O O O\n" +
            "    O O O", board3.getGameState());
    board3.move(5, 2, 3, 2);
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "O O O O O O O\n" +
            "O _ _ O O O O\n" +
            "  _ _ O O O\n" +
            "    O O O", board3.getGameState());
    board3.move(0, 2, 2, 2);
    assertEquals("    _ O O\n" +
            "  O _ O O O\n" +
            "O _ O _ O O O\n" +
            "O O O O O O O\n" +
            "O _ _ O O O O\n" +
            "  _ _ O O O\n" +
            "    O O O", board3.getGameState());

    board3.move(5, 4, 5, 2);
    assertEquals("    _ O O\n" +
            "  O _ O O O\n" +
            "O _ O _ O O O\n" +
            "O O O O O O O\n" +
            "O _ _ O O O O\n" +
            "  _ O _ _ O\n" +
            "    O O O", board3.getGameState());
    board3.move(3, 2, 1, 2);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "O O _ O O O O\n" +
            "O _ _ O O O O\n" +
            "  _ O _ _ O\n" +
            "    O O O", board3.getGameState());
    board3.move(6, 2, 4, 2);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "O O _ O O O O\n" +
            "O _ O O O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O O", board3.getGameState());
    board3.move(3, 0, 3, 2);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ _ O O O O O\n" +
            "O _ O O O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O O", board3.getGameState());


    board3.move(4, 3, 4, 1);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ _ O O O O O\n" +
            "O O _ _ O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O O", board3.getGameState());

    board3.move(4, 0, 4, 2);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ _ O O O O O\n" +
            "_ _ O _ O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O O", board3.getGameState());

    board3.move(3, 3, 3, 1);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ O _ _ O O O\n" +
            "_ _ O _ O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O O", board3.getGameState());

    board3.move(3, 4, 5, 4);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ O _ _ _ O O\n" +
            "_ _ O _ _ O O\n" +
            "  _ _ _ O O\n" +
            "    _ O O", board3.getGameState());


    board3.move(6, 4, 4, 4);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ O _ _ _ O O\n" +
            "_ _ O _ O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O _", board3.getGameState());


    board3.move(3, 6, 3, 4);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ O _ _ O _ _\n" +
            "_ _ O _ O O O\n" +
            "  _ _ _ _ O\n" +
            "    _ O _", board3.getGameState());

    board3.move(5, 5, 3, 5);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ O _ _ O O _\n" +
            "_ _ O _ O _ O\n" +
            "  _ _ _ _ _\n" +
            "    _ O _", board3.getGameState());

    board3.move(3, 4, 5, 4);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ _ O O O\n" +
            "_ O _ _ _ O _\n" +
            "_ _ O _ _ _ O\n" +
            "  _ _ _ O _\n" +
            "    _ O _", board3.getGameState());


    board3.move(2, 5, 2, 3);
    assertEquals("    _ O O\n" +
            "  O O O O O\n" +
            "O _ _ O _ _ O\n" +
            "_ O _ _ _ O _\n" +
            "_ _ O _ _ _ O\n" +
            "  _ _ _ O _\n" +
            "    _ O _", board3.getGameState());

    board3.move(0, 4, 0, 2);
    assertEquals("    O _ _\n" +
            "  O O O O O\n" +
            "O _ _ O _ _ O\n" +
            "_ O _ _ _ O _\n" +
            "_ _ O _ _ _ O\n" +
            "  _ _ _ O _\n" +
            "    _ O _", board3.getGameState());

    board3.move(1, 3, 3, 3);
    assertEquals("    O _ _\n" +
            "  O O _ O O\n" +
            "O _ _ _ _ _ O\n" +
            "_ O _ O _ O _\n" +
            "_ _ O _ _ _ O\n" +
            "  _ _ _ O _\n" +
            "    _ O _", board3.getGameState());

    assertEquals(14, board3.getScore());

    board3.move(1, 5, 1, 3);
    assertEquals("    O _ _\n" +
            "  O O O _ _\n" +
            "O _ _ _ _ _ O\n" +
            "_ O _ O _ O _\n" +
            "_ _ O _ _ _ O\n" +
            "  _ _ _ O _\n" +
            "    _ O _", board3.getGameState());

    String test = "";
    //moving to marble
    try {

      board3.move(1, 3, 1, 1);
    } catch (IllegalArgumentException e) {
      test = "cant move to marble";
    }
    assertEquals("cant move to marble", test);


    //jump over empty
    try {

      board3.move(1, 2, 3, 2);
    } catch (IllegalArgumentException e) {
      test = "cant jump over empty";
    }
    assertEquals("cant jump over empty", test);

    //move from posn that does not exist
    try {

      board3.move(-1, 2, 3, 2);
    } catch (IllegalArgumentException e) {
      test = "cant from there";
    }
    assertEquals("cant from there", test);


    //move to posn that does not exist
    try {

      board3.move(1, 2, -3, 2);
    } catch (IllegalArgumentException e) {
      test = "cant there";
    }
    assertEquals("cant there", test);

    //move too far
    try {

      board3.move(1, 2, 1, 5);
    } catch (IllegalArgumentException e) {
      test = "too far";
    }
    assertEquals("too far", test);


    assertEquals(13, board3.getScore());

    assertEquals(false, board3.isGameOver());

    board3.move(1, 2, 1, 4);
    assertEquals("    O _ _\n" +
            "  O _ _ O _\n" +
            "O _ _ _ _ _ O\n" +
            "_ O _ O _ O _\n" +
            "_ _ O _ _ _ O\n" +
            "  _ _ _ O _\n" +
            "    _ O _", board3.getGameState());
    assertEquals(true, board3.isGameOver());


    //moving from empty
    try {

      board3.move(5, 3, 5, 5);
    } catch (IllegalArgumentException e) {
      test = "gotcha";
    }
    assertEquals("gotcha", test);


  }


  @Test
  public void getGameState() {
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());

    board3.move(1, 3, 3, 3);
    assertEquals("    O O O\n" +
            "  O O _ O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", board3.getGameState());

    assertEquals("        O O O O O\n" +
            "      O O O O O O O\n" +
            "    O O O O O O O O O\n" +
            "  O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O _ O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "  O O O O O O O O O O O\n" +
            "    O O O O O O O O O\n" +
            "      O O O O O O O\n" +
            "        O O O O O", boardArmthick.getGameState());
    assertEquals("        O O O O O\n" +
            "      O O O O O O O\n" +
            "    O O O O O O O O O\n" +
            "  O O _ O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "O O O O O O O O O O O O O\n" +
            "  O O O O O O O O O O O\n" +
            "    O O O O O O O O O\n" +
            "      O O O O O O O\n" +
            "        O O O O O", boardAllThree.getGameState());
    assertEquals("    O O O\n" +
            "  O O O O O\n" +
            "O O O O O O O\n" +
            "O O O _ O O O\n" +
            "O O O O O O O\n" +
            "  O O O O O\n" +
            "    O O O", boardPosn.getGameState());


  }


}