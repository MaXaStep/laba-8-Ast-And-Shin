package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquereTest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int  output = test.square(5);
		assertEquals(25,output); 
	}

}
