package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class BoardTest {

    @Test
    public void testInvalidPlacement() {
        Board board = new Board();
        assertTrue(board.placeShip(new Ship("BATTLESHIP"), 1, 'A', true));
        assertTrue(board.placeShip(new Ship("BATTLESHIP"), 3, 'C', true));
        assertTrue(board.placeShip(new Ship("MINESWEEPER"), 7, 'I', true));

        assertFalse(board.placeShip(new Ship("BATTLESHIP"), 3, 'C', true)); // false because a ship exists there
        assertFalse(board.placeShip(new Ship("MINESWEEPER"), 0, 'C', false));
        assertFalse(board.placeShip(new Ship("MINESWEEPER"), 0, 'D', false));
        assertFalse(board.placeShip(new Ship("MINESWEEPER"), 11, 'D', false));
        assertFalse(board.placeShip(new Ship("MINESWEEPER"), 11, 'I', true));
        
        assertTrue(board.attack(1, 'A'));
        assertTrue(board.attack(3, 'C'));
        assertTrue(board.attack(7, 'I'));

        assertFalse(board.attack(6, 'A'));
        assertFalse(board.attack(7, 'A'));
    }
}
