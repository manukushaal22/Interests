import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestsTester {

	@Test
	void testSimple() {
		Interests i=new Interests();
		
		assertEquals(100,i.simple(100, 100, 1));
		assertEquals(90,i.simple(45, 200, 1));
	}

	@Test
	void testCompound() {
		Interests i=new Interests();
		
		assertEquals(1,i.compound(100, 1, 1));
		assertEquals(35,i.compound(3500, 1, 1));
	}

}
