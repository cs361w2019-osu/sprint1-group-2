package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class placeAttTest {

  @Test
  public void testPlacementAttack() {
    Board board = new Board();

    board.placeShip(new Ship("BATTLESHIP"), 1, 'A', true);
    board.placeShip(new Ship("BATTLESHIP"), 3, 'C', true);
    board.placeShip(new Ship("MINESWEEPER"), 7, 'I', true);

    assertTrue(board.attack(1, 'A'));
    assertTrue(board.attack(3, 'C'));
    assertTrue(board.attack(7, 'I'));

    assertFalse(board.attack(6, 'A'));
    assertFalse(board.attack(7, 'A'));
  }
}
