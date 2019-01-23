package cs361.battleships.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class AITest {

	@Test
	public void testAI() {
		int i=100, t;
		for (t=0;t<i,t++){
			assertTrue(Number(randCol()) < 10);
		}
		for (t=0; t<i,t++){
			assertTrue(Number(randCol()) >= 0);
		}
		assertTrue(randRow() < 10);
		assertTrue(randRow() >= 0);
		assertTrue(randVertical());
	}
}
