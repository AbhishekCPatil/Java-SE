package in.tp.jd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreetServiceTest {
	
	@Test
	void testGreet() {
		
		GreetService gs = new GreetService();
		String input = "Abhishek";
		String actual = gs.greet(input);
		String expected = "Hello Abhishek";
		assertEquals(expected, actual);
		
	}

}
