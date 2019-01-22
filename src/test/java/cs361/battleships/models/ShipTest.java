package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShipTest {

	@Test
	public void testSquareInitialization() {
		Ship battleship = new Ship("BATTLESHIP");
		Ship destroyer = new Ship("DESTROYER");
		Ship minesweeper = new Ship("MINESWEEPER");

		assertTrue(battleship.getOccupiedSquares().size() == 4);
		assertTrue(destroyer.getOccupiedSquares().size() == 3);
		assertTrue(minesweeper.getOccupiedSquares().size() == 2);
	}
}
