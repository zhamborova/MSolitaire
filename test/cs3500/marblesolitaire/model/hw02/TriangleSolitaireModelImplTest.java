package cs3500.marblesolitaire.model.hw02;

import org.junit.Test;

import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;

public class TriangleSolitaireModelImplTest {

  TriangleSolitaireModelImpl boardTest = new TriangleSolitaireModelImpl();
  TriangleSolitaireModelImpl boardDefault = new TriangleSolitaireModelImpl();
  TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(3);
  TriangleSolitaireModelImpl boardCoordinates = new TriangleSolitaireModelImpl(2, 1);
  TriangleSolitaireModelImpl boardAll = new TriangleSolitaireModelImpl(3, 2, 1);


  @Test
          (expected = IllegalArgumentException.class)
  public void testContr0() {
    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(0);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testContr1() {
    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(-1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testTr() {

    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(-1, 0);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr1() {

    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(0, -1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr2() {

    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(-1, -1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr3() {

    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(-1,
            1, 1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr4() {

    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(3,
            -1, 1);

  }

  @Test
          (expected = IllegalArgumentException.class)
  public void testtr5() {

    TriangleSolitaireModelImpl getBoardArmthick = new TriangleSolitaireModelImpl(3,
            1, -1);

  }


  @Test
  public void getGameState() {
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());

    assertEquals("  _\n" +
                    " O O\n" +
                    "O O O"
            , getBoardArmthick.getGameState());

    assertEquals("    O\n" +
            "   O O\n" +
            "  O _ O\n" +
            " O O O O\n" +
            "O O O O O", boardCoordinates.getGameState());

    assertEquals("  O\n" +
                    " O O\n" +
                    "O _ O"
            , boardAll.getGameState());
  }


  @Test
  public void move() {
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    boardDefault.move(2, 0, 0, 0);

    //up
    assertEquals("    O\n" +
            "   _ O\n" +
            "  _ O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    boardDefault.move(2, 2, 2, 0);

    //from right to left
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ _\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    //diagonal up left
    boardDefault.move(4, 4, 2, 2);
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ O\n" +
            " O O O _\n" +
            "O O O O _", boardDefault.getGameState());

    boardDefault.move(4, 3, 2, 1);

    assertEquals("    O\n" +
            "   _ O\n" +
            "  O O O\n" +
            " O O _ _\n" +
            "O O O _ _", boardDefault.getGameState());
    //down diagonal right
    boardDefault.move(1, 1, 3, 3);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  O O _\n" +
            " O O _ O\n" +
            "O O O _ _", boardDefault.getGameState());

    //left to right
    boardDefault.move(2, 0, 2, 2);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  _ _ O\n" +
            " O O _ O\n" +
            "O O O _ _", boardDefault.getGameState());
    boardDefault.move(3, 0, 3, 2);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  _ _ O\n" +
            " _ _ O O\n" +
            "O O O _ _", boardDefault.getGameState());
    boardDefault.move(2, 2, 4, 4);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  _ _ _\n" +
            " _ _ O _\n" +
            "O O O _ O", boardDefault.getGameState());
    //diagonal up right
    boardDefault.move(4, 2, 2, 2);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  _ _ O\n" +
            " _ _ _ _\n" +
            "O O _ _ O", boardDefault.getGameState());
    assertEquals(5, boardDefault.getScore());
    assertEquals(false, boardDefault.isGameOver());
    boardDefault.move(4, 0, 4, 2);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  _ _ O\n" +
            " _ _ _ _\n" +
            "_ _ O _ O", boardDefault.getGameState());
    assertEquals(true, boardDefault.isGameOver());
    assertEquals(4, boardDefault.getScore());

  }


  @Test
  public void moveMore() {
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    boardDefault.move(2, 0, 0, 0);

    //up
    assertEquals("    O\n" +
            "   _ O\n" +
            "  _ O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    boardDefault.move(2, 2, 2, 0);

    //from right to left
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ _\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    //diagonal up left
    boardDefault.move(4, 4, 2, 2);
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ O\n" +
            " O O O _\n" +
            "O O O O _", boardDefault.getGameState());

    boardDefault.move(4, 3, 2, 1);

    assertEquals("    O\n" +
            "   _ O\n" +
            "  O O O\n" +
            " O O _ _\n" +
            "O O O _ _", boardDefault.getGameState());
    boardDefault.move(4, 1, 4, 3);

    assertEquals("    O\n" +
            "   _ O\n" +
            "  O O O\n" +
            " O O _ _\n" +
            "O _ _ O _", boardDefault.getGameState());
    //down
    boardDefault.move(2, 1, 4, 1);

    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ O\n" +
            " O _ _ _\n" +
            "O O _ O _", boardDefault.getGameState());
  }

  @Test
  public void moveMoreMore() {
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    boardDefault.move(2, 0, 0, 0);

    //up
    assertEquals("    O\n" +
            "   _ O\n" +
            "  _ O O\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    boardDefault.move(2, 2, 2, 0);

    //from right to left
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ _\n" +
            " O O O O\n" +
            "O O O O O", boardDefault.getGameState());
    //diagonal up left
    boardDefault.move(4, 4, 2, 2);
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ O\n" +
            " O O O _\n" +
            "O O O O _", boardDefault.getGameState());
    //down diagonal left
    boardDefault.move(1, 1, 3, 3);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  O _ _\n" +
            " O O O O\n" +
            "O O O O _", boardDefault.getGameState());

  }


  @Test
  public void isGameOver() {
    assertEquals(true, boardAll.isGameOver());
    assertEquals(false, boardCoordinates.isGameOver());
  }

  @Test
  public void getScore() {
    assertEquals(5, boardAll.getScore());
    assertEquals(14, boardCoordinates.getScore());
  }

  //to a posn that does not exist
  @Test(expected = IllegalArgumentException.class)
  public void testExc() {
    boardTest.move(2, 0, 0, -1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc1() {
    boardTest.move(2, 0, 0, -1);
  }

  //from posn that does not exist
  @Test(expected = IllegalArgumentException.class)
  public void testExc2() {
    boardTest.move(-1, 0, 0, 0);
  }

  @Test
  public void moveTest() {
    assertEquals("    _\n" +
            "   O O\n" +
            "  O O O\n" +
            " O O O O\n" +
            "O O O O O", boardTest.getGameState());
    boardTest.move(2, 0, 0, 0);

    //up
    assertEquals("    O\n" +
            "   _ O\n" +
            "  _ O O\n" +
            " O O O O\n" +
            "O O O O O", boardTest.getGameState());
    boardTest.move(2, 2, 2, 0);

    //from right to left
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ _\n" +
            " O O O O\n" +
            "O O O O O", boardTest.getGameState());
    //diagonal up left
    boardTest.move(4, 4, 2, 2);
    assertEquals("    O\n" +
            "   _ O\n" +
            "  O _ O\n" +
            " O O O _\n" +
            "O O O O _", boardTest.getGameState());
    //down diagonal left
    boardTest.move(1, 1, 3, 3);
    assertEquals("    O\n" +
            "   _ _\n" +
            "  O _ _\n" +
            " O O O O\n" +
            "O O O O _", boardTest.getGameState());

    String test = "";

    //moving from empty
    try {

      boardTest.move(4, 4, 2, 2);
    } catch (IllegalArgumentException e) {
      test = "gotcha";
    }
    assertEquals("gotcha", test);

    //moving  to marble
    try {

      boardTest.move(4, 0, 4, 2);
    } catch (IllegalArgumentException e) {
      test = "gotchaAgain";
    }
    assertEquals("gotchaAgain", test);
    //moving  to marble diagonally
    try {

      boardTest.move(2, 2, 4, 4);
    } catch (IllegalArgumentException e) {
      test = "gotchaAgain.2";
    }
    assertEquals("gotchaAgain.2", test);
    //moving  to marble diagonally
    try {

      boardTest.move(2, 0, 4, 2);
    } catch (IllegalArgumentException e) {
      test = "still here,catching your faults at 2 am";
    }
    assertEquals("still here,catching your faults at 2 am", test);


    try {

      boardTest.move(3, 2, 1, 0);
    } catch (IllegalArgumentException e) {
      test = "Catch jump over empty";
    }
    assertEquals("Catch jump over empty", test);


    //moving  more than 2 posn
    try {

      boardTest.move(4, 0, 1, 0);
    } catch (IllegalArgumentException e) {
      test = "Jump too far";
    }
    assertEquals("Jump too far", test);


  }


}