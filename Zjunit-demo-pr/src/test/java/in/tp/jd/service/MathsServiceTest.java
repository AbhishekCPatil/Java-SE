package in.tp.jd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MathsServiceTest {
	
	@Test
	void testAdd() {
		MathsService ms = new MathsService();
		
		int input1 = 3;
		int input2 = 5;
		int actual = ms.add(input1, input2);
		int expected = 8;
		assertEquals(expected, actual);
	}
	
	
}
