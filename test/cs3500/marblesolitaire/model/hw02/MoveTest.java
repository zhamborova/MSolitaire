package cs3500.marblesolitaire.model.hw02;


import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelImpl;

import static junit.framework.TestCase.assertEquals;

public class MoveTest {
  MarbleSolitaireModelImpl boardTest = new MarbleSolitaireModelImpl();

  @Test
  public void move() {
    boardTest.move(1, 3, 3, 3);
    assertEquals("    O O O\n"
            + "    O _ O\n"
            + "O O O _ O O O\n"
            + "O O O O O O O\n"
            + "O O O O O O O\n"
            + "    O O O\n"
            + "    O O O", boardTest.getGameState());


  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc() {
    boardTest.move(0, 3, -2, 3);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc1() {
    boardTest.move(3, 0, 3, -2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc2() {
    boardTest.move(3, 6, 3, 8);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc3() {
    boardTest.move(6, 5, 8, 5);


    MarbleSolitaireModelImpl test1 = new MarbleSolitaireModelImpl();
    test1.move(3, 1, 3, 3);
    assertEquals(31, test1.getScore());


    boardTest.move(2, 1, 2, 3);
    assertEquals("    O O O\n" +
            "    O _ O\n" +
            "O _ _ O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", boardTest.getGameState());

    boardTest.move(0, 2, 2, 2);
    assertEquals("    _ O O\n" +
            "    _ _ O\n" +
            "O _ O O O O O\n" +
            "O O O O O O O\n" +
            "O O O O O O O\n" +
            "    O O O\n" +
            "    O O O", boardTest.getGameState());


    boardTest.move(0, 4, 0, 2);
    assertEquals("    O _ _\n"
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
            "    O O O", boardTest.getGameState());

    boardTest.move(3, 2, 1, 2);
    assertEquals("    O _ _\n"
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
            "    O O O", boardTest.getGameState());

    boardTest.move(0, 2, 2, 2);
    assertEquals("    _ _ _\n" +
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
            "    O O O", boardTest.getGameState());
    boardTest.move(5, 2, 3, 2);
    assertEquals("    _ _ _\n"
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
            "    O O O", boardTest.getGameState());
    boardTest.move(4, 0, 4, 2);
    assertEquals("    _ _ _\n" +
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
            "    O O O", boardTest.getGameState());
    boardTest.move(2, 0, 4, 0);
    assertEquals("    _ _ _\n"
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
            "    O O O", boardTest.getGameState());
    boardTest.move(4, 3, 4, 1);
    assertEquals("    _ _ _\n"
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
            "    O O O", boardTest.getGameState());
    boardTest.move(4, 0, 4, 2);
    assertEquals("    _ _ _\n"
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
            "    O O O", boardTest.getGameState());
    boardTest.move(4, 5, 4, 3);
    assertEquals("    _ _ _\n"
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
            "    O O O", boardTest.getGameState());
    boardTest.move(6, 4, 4, 4);
    assertEquals("    _ _ _\n"
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
            "    O O _", boardTest.getGameState());
    boardTest.move(6, 2, 6, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ O", boardTest.getGameState());
    boardTest.move(3, 4, 5, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ O", boardTest.getGameState());
    boardTest.move(6, 4, 4, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(1, 4, 3, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());


    boardTest.move(2, 6, 2, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());

    //////////
    //////////////////////////////////
    boardTest.move(4, 6, 2, 6);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(2, 3, 2, 5);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(2, 6, 2, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(4, 3, 4, 5);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(4, 5, 2, 5);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(2, 5, 2, 3);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(2, 3, 2, 1);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());
    boardTest.move(2, 1, 4, 1);
    assertEquals("    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O O O _ _\n" +
            "_ O O _ _ _ _\n" +
            "    _ O _\n" +
            "    _ _ _", boardTest.getGameState());
    boardTest.move(4, 1, 4, 3);
    assertEquals("    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O O O _ _\n" +
            "_ _ _ O _ _ _\n" +
            "    _ O _\n" +
            "    _ _ _", boardTest.getGameState());
    boardTest.move(3, 3, 3, 5);
    assertEquals("    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O _ _ O _\n" +
            "_ _ _ O _ _ _\n" +
            "    _ O _\n" +
            "    _ _ _", boardTest.getGameState());


    boardTest.move(5, 3, 3, 3);
    assertEquals("    _ _ _\n" +
            "    _ _ _\n" +
            "_ _ _ _ _ _ _\n" +
            "_ _ O O _ O _\n" +
            "_ _ _ _ _ _ _\n" +
            "    _ _ _\n" +
            "    _ _ _", boardTest.getGameState());


    assertEquals(false, boardTest.isGameOver());


    boardTest.move(3, 2, 3, 4);
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());

    ///checking  game status in between
    assertEquals(false, boardTest.isGameOver());
    assertEquals(2, boardTest.getScore());

    boardTest.move(3, 5, 3, 3);
    assertEquals(true, boardTest.isGameOver());
    assertEquals("    _ _ _\n"
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
            "    _ _ _", boardTest.getGameState());

    assertEquals(1, boardTest.getScore());
    assertEquals(true, boardTest.isGameOver());

  }

  @Test(expected = IllegalArgumentException.class)
  public void testsom() {
    boardTest.move(2, 0, 4, 0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc4() {
    boardTest.move(3, 2, 0, 2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc5() {
    boardTest.move(3, 2, 5, 1);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc6() {
    boardTest.move(3, 2, 3, 2);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc7() {
    boardTest.move(3, 5, 3, 7);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testExc8() {
    boardTest.move(-1, -2, 3, 7);
  }


}