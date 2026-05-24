package src.test.java;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import src.main.java.*;

public class CounterTest {
	private Counter counter;

	@Before
	public void setUp() {
		counter = new Counter();
	}

	@Test
	public void testReset() {
		for (int i = 0; i < 10; i++) {
			counter.increment();
		}

		counter.reset();

		assertEquals(0, counter.getCount());
	}

	@Test
	public void testIncrement() {
		for (int i = 0; i < 9; i++) {
			counter.increment();
			assertEquals(i + 1, counter.getCount());
		}
	}

	@Test
	public void testDecrement() {
		for (int i = 0; i < 9; i++) {
			counter.decrement();
			assertEquals(-(i + 1), counter.getCount());
		}
	}
}
