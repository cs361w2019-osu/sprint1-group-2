package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AITest {

	@Test
	public void testAI() {
		assertTrue(Number(randCol()) < 10);
		assertTrue(Number(randCol()) >= 0);

		assertTrue(randRow() < 10);
		assertTrue(randRow() >= 0);
		assertTrue(randVertical());
	}
}