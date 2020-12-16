package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class countATest {

	@Test
	void test() {
		JUnitTesting test = new JUnitTesting();
		int outpout = test.countA("alphabet");
		assertEquals(3,outpout); 
	}

}
